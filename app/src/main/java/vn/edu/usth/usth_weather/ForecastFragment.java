package vn.edu.usth.usth_weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
    }

    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("ForecastFragment", "onCreateView started");

        View view = inflater.inflate(R.layout.fragment_forecast, container, false);

        TextView textViewMonday = view.findViewById(R.id.text_view_monday);
        TextView textViewConditionMonday = view.findViewById(R.id.monday_condition_text);
        TextView textViewTemperatureMonday = view.findViewById(R.id.monday_temperature_text);
        ImageView imageViewIconMonday = view.findViewById(R.id.image_view_icon_monday);

        TextView textViewTuesday = view.findViewById(R.id.text_view_tuesday);
        TextView textViewConditionTuesday = view.findViewById(R.id.tuesday_condition_text);
        TextView textViewTemperatureTuesday = view.findViewById(R.id.tuesday_temperature_text);
        ImageView imageViewIconTuesday = view.findViewById(R.id.image_view_icon_tuesday);

        TextView textViewWednesday = view.findViewById(R.id.text_view_wednesday);
        TextView textViewConditionWednesday = view.findViewById(R.id.wednesday_condition_text);
        TextView textViewTemperatureWednesday = view.findViewById(R.id.wednesday_temperature_text);
        ImageView imageViewIconWednesday = view.findViewById(R.id.image_view_icon_wednesday);

        TextView textViewThursday = view.findViewById(R.id.text_view_thursday);
        TextView textViewConditionThursday = view.findViewById(R.id.thursday_condition_text);
        TextView textViewTemperatureThursday = view.findViewById(R.id.thursday_temperature_text);
        ImageView imageViewIconThursday = view.findViewById(R.id.image_view_icon_thursday);

        TextView textViewFriday = view.findViewById(R.id.text_view_friday);
        TextView textViewConditionFriday = view.findViewById(R.id.friday_condition_text);
        TextView textViewTemperatureFriday = view.findViewById(R.id.friday_temperature_text);
        ImageView imageViewIconFriday = view.findViewById(R.id.image_view_icon_friday);

        TextView textViewSaturday = view.findViewById(R.id.text_view_saturday);
        TextView textViewConditionSaturday = view.findViewById(R.id.saturday_condition_text);
        TextView textViewTemperatureSaturday = view.findViewById(R.id.saturday_temperature_text);
        ImageView imageViewIconSaturday = view.findViewById(R.id.image_view_icon_saturday);

        TextView textViewSunday = view.findViewById(R.id.text_view_sunday);
        TextView textViewConditionSunday = view.findViewById(R.id.sunday_condition_text);
        TextView textViewTemperatureSunday = view.findViewById(R.id.sunday_temperature_text);
        ImageView imageViewIconSunday = view.findViewById(R.id.image_view_icon_sunday);

        TextView textViewMonday2 = view.findViewById(R.id.text_view_monday_2);
        TextView textViewConditionMonday2 = view.findViewById(R.id.monday_2_condition_text);
        TextView textViewTemperatureMonday2 = view.findViewById(R.id.monday_2_temperature_text);
        ImageView imageViewIconMonday2 = view.findViewById(R.id.image_view_icon_monday_2);

        TextView textViewTuesday2 = view.findViewById(R.id.text_view_tuesday_2);
        TextView textViewConditionTuesday2 = view.findViewById(R.id.tuesday_2_condition_text);
        TextView textViewTemperatureTuesday2 = view.findViewById(R.id.tuesday_2_temperature_text);
        ImageView imageViewIconTuesday2 = view.findViewById(R.id.image_view_icon_tuesday_2);

        return view;
    }
}