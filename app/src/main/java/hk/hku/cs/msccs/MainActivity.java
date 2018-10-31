package hk.hku.cs.msccs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "main";

    private BottomNavigationView navigation;
    private ViewPager mVp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        //mTextMessage = (TextView) findViewById(R.id.textView);
        //BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void initView() {
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


}
