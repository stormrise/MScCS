package hk.hku.cs.msccs;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "main";
    public String CSURL = "https://www.msc-cs.hku.hk";
    public static final int CONNECTED=1;

    private BottomNavigationView navigation;
    private ViewPager mVp;

    private List<Guide_Content> Home_text=new ArrayList<>();
    private List<Guide_Content> gu_button=new ArrayList<>();
    private List<Guide_Content> card=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();//判断网络连接是否正常
        if (networkInfo != null && networkInfo.isConnected()) {
            //调用新线程进行数据抓取 !!!!! 执行方法
            //getFlow_text();
            Log.d(TAG, "Connect OK");
        }else{
            Toast.makeText(MainActivity.this,"No connection, Please check your network",Toast.LENGTH_SHORT).show();

        }
        @SuppressLint("HandlerLeak")
        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what){
                    case CONNECTED:
                        //UI操作
//                        String hometext1 = Home_text.get(1).getTitle()+Home_text.get(1).getText();
//                        textView.setText(hometext1);
//                        Glide.with(imageView.getContext()).load(CSURL+card.get(1).getPic()).into(imageView);
                       break;
                    default:
                        break;
                }
            }
        };

    }

    private void initView() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        mVp = (ViewPager) findViewById(R.id.vp);

        //数据填充
        setupViewPager(mVp);
        //ViewPager监听
        mVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                navigation.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.call:
                Toast.makeText(this,"click call",Toast.LENGTH_SHORT).show();
                MakeCall().show();
                break;
            case R.id.mail:
                Toast.makeText(this,"click mail",Toast.LENGTH_SHORT).show();
                MakeMail().show();
                break;
            default:
        }
        return true;
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Log.d(TAG, "home selected");
                    mVp.setCurrentItem(0);
                    return true;
                case R.id.navigation_about:
                    Log.d(TAG, "about selected");
                    mVp.setCurrentItem(1);
                    return true;
                case R.id.navigation_admission:
                    Log.d(TAG, "admission selected");
                    mVp.setCurrentItem(2);
                    return true;
                case R.id.navigation_curriculum:
                    Log.d(TAG, "curriculum selected");
                    mVp.setCurrentItem(3);
                    return true;
                case R.id.navigation_others:
                    Log.d(TAG, "other selected");
                    mVp.setCurrentItem(4);
                    return true;
            }
            return false;
        }
    };

    private void setupViewPager(ViewPager viewPager) {
        BottomAdapter adapter = new BottomAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new AboutFragment());
        adapter.addFragment(new AdmissionFragment());
        adapter.addFragment(new CurriculumFragment());
        adapter.addFragment(new OtherFragment());
        viewPager.setAdapter(adapter);
    }


    public Dialog MakeCall() {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Contact The MSc Programme Office");
        builder.setMessage("Want Call (852) 3917 1828 ?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        Uri data = Uri.parse("tel:+85239171828");
                        intent.setData(data);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
    public Dialog MakeMail() {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Contact The MSc Programme Office");
        builder.setMessage("Want Mail msccs@cs.hku.hk ?")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        Uri data = Uri.parse("mailto:msccs@cs.hku.hk");
                        intent.setData(data);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

    //------------------------------------------爬取页面------------------------------------------------------
    private void getFlow_text(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getId());//check thread ID
                    //Jsoup
                    Document doc=Jsoup.connect("https://www.msc-cs.hku.hk/").get();
                    Elements flow=doc.select("div.container");
                    for(Element e:flow){
                        String title_flow=e.select("h2").text();
                        String text=e.select("p").text();
                        String detail_url=e.select("a").attr("href");
                        //Log.d(TAG,flow_text);
                        //System.out.println("Title:" + title_flow);
                        //System.out.println("text:"+text);
                        //System.out.println("url:"+ detail_url);
                        Guide_Content guide_content=new Guide_Content(title_flow,text,null,detail_url);
                        Home_text.add(guide_content);
                        Log.d(TAG, "Home_text add!");
                    }
                    Elements clo=doc.select("div.col.s12");
                    for(Element e:clo){
                        String card_title_tmp=e.select("div.card-content").text();
                        //String card_title=card_title_tmp.substring(0,card_title_tmp.length()-9);
                        String card_pic=e.select("div.card-image").select("img.activator").attr("src");
                        String card_url=e.select("div.card-reveal").select("a").attr("href");
                        //System.out.println("title: " + card_title_tmp);
                        //System.out.println("picture_address: "+card_pic);
                        //System.out.println("picture_url: "+card_url);
                        Guide_Content guide_content=new Guide_Content(card_title_tmp,null,card_pic,card_url);
                        card.add(guide_content);
                        Log.d(TAG, "card add!");
                    }
                    Elements guide_button=doc.select("a.dropdown-button");
                    for(Element e:guide_button){
                        String button_name=e.text();
                        String button_url=e.attr("href");
                        //System.out.println("name: "+button_name);
                        //System.out.println("url: "+button_url);
                        Guide_Content guide_content=new Guide_Content(button_name,button_name,null,button_url);
                        gu_button.add(guide_content);
                        Log.d(TAG, "gu_button add!");
                    }
//                    message.what=CONNECTED;//获取数据成功后，调用handler方法更新UI
//                    handler.sendMessage(message);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
