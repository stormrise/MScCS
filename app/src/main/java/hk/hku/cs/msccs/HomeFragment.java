package hk.hku.cs.msccs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    //parameters
    public String CSURL = "https://www.msc-cs.hku.hk";
    private final static String TAG = "HomeActivity";
    private List<Guide_Content> card = new ArrayList<>();
    public static final int CONNECTED=1;
    Message messageHome = new Message();
    Handler handlerHome;
    ImageView bannerImage, cardimg1, cardimg2, cardimg3, cardimg4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "HomeActivity Start");
        getFlow_text();
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @SuppressLint("HandlerLeak")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {//equals mainActivity onCreated method
        super.onActivityCreated(savedInstanceState);
        bannerImage = (ImageView) getActivity().findViewById(R.id.banner);//add getActivity(). before findViewById
        cardimg1 = (ImageView) getActivity().findViewById(R.id.home_card_view1_image);
        cardimg2 = (ImageView) getActivity().findViewById(R.id.home_card_view2_image);
        cardimg3 = (ImageView) getActivity().findViewById(R.id.home_card_view3_image);
        cardimg4 = (ImageView) getActivity().findViewById(R.id.home_card_view4_image);

        handlerHome = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what){
                    case CONNECTED:
                        Log.d(TAG, "Message handled");
                        //UI操作
//                        String hometext1 = Home_text.get(1).getTitle()+Home_text.get(1).getText();
//                        textView.setText(hometext1);
                        Glide.with(cardimg2.getContext()).load(CSURL+card.get(0).getPic()).into(cardimg2);
                        Glide.with(cardimg3.getContext()).load(CSURL+card.get(1).getPic()).into(cardimg3);
                        Glide.with(cardimg4.getContext()).load(CSURL+card.get(2).getPic()).into(cardimg4);


                        break;
                    default:
                        break;
                }
            }
        };
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
                    Elements clo=doc.select("div.col.s12");
                    for(Element e:clo){
                        String card_title_tmp=e.select("div.card-content").text();
                        //String card_title=card_title_tmp.substring(0,card_title_tmp.length()-9);
                        String card_pic=e.select("div.card-image").select("img.activator").attr("src");
                        String card_url=e.select("div.card-reveal").select("a").attr("href");
                        //System.out.println("title: " + card_title_tmp);
                        //System.out.println("picture_address: "+card_pic);
                        System.out.println("picture_url: "+card_url);
                        Guide_Content guide_content=new Guide_Content(card_title_tmp,null,card_pic,card_url);
                        card.add(guide_content);
                        Log.d(TAG, "card add!");
                    }

                    messageHome.what=CONNECTED;//获取数据成功后，调用handler方法更新UI
                    handlerHome.sendMessage(messageHome);

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
