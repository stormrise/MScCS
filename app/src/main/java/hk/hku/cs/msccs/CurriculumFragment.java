package hk.hku.cs.msccs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class CurriculumFragment extends Fragment {
    private final static String TAG = "Curriculum";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_curriculum, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       /* ImageView titleImage = (ImageView) getActivity().findViewById(R.id.banner);//add getActivity(). before findViewById
        ImageView cardimg1 = (ImageView) getActivity().findViewById(R.id.home_card_view1_image);
        ImageView cardimg2 = (ImageView) getActivity().findViewById(R.id.home_card_view2_image);
        ImageView cardimg3 = (ImageView) getActivity().findViewById(R.id.home_card_view3_image);
        ImageView cardimg4 = (ImageView) getActivity().findViewById(R.id.home_card_view4_image);
        */
    }
}
