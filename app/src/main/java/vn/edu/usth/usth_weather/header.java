package vn.edu.usth.usth_weather;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class header extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.header, container, false);

        // Set the background color of the fragment (if not done in XML)
        view.setBackgroundColor(Color.parseColor("#FFFFFF"));
        return view;
    }
}