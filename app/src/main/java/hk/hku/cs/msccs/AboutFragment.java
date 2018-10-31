package hk.hku.cs.msccs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class AboutFragment extends Fragment {
    private final static String TAG = "About";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "fragment about create");
        return inflater.inflate(R.layout.fragment_about, container, false);
    }


}
