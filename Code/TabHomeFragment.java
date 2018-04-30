package edu.niu.z1779105.tablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabHomeFragment extends Fragment {


    public TabHomeFragment() {
        // Required empty public constructor
    }

//layoutInflator is used here for making the corresponding layout XML file to the View claas.
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tabhome, container, false);
    }

}

