package vn.edu.usth.usth_weather;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);

        // Set the background color of the fragment (if not done in XML)
        view.setBackgroundColor(Color.parseColor("#FFFFFF"));


        TextView mondayTextView = view.findViewById(R.id.monday);
        ImageView weathermondayIconView = view.findViewById(R.id.imageview_monday_weather_icon);

        TextView tuesdayTextView = view.findViewById(R.id.tuesday);
        ImageView weathertuesdayIconView = view.findViewById(R.id.imageview_tuesday_weather_icon);

        TextView wednesdayTextView = view.findViewById(R.id.wednesday);
        ImageView weatherwednesdayIconView = view.findViewById(R.id.imageview_wednesday_weather_icon);

        TextView thursdayTextView = view.findViewById(R.id.thursday);
        ImageView weatherthursdayIconView = view.findViewById(R.id.imageview_thursday_weather_icon);

        TextView fridayTextView = view.findViewById(R.id.friday);
        ImageView weatherfridayIconView = view.findViewById(R.id.imageview_friday_weather_icon);

        TextView saturdayTextView = view.findViewById(R.id.saturday);
        ImageView weathersaturdayIconView = view.findViewById(R.id.imageview_saturday_weather_icon);

        TextView sundayTextView = view.findViewById(R.id.sunday);
        ImageView weathersundayIconView = view.findViewById(R.id.imageview_sunday_weather_icon);


        // Bạn có thể thiết lập văn bản hoặc hình ảnh động cho các thành phần này nếu cần
        thursdayTextView.setText("monday");
        weathermondayIconView.setImageResource(R.drawable.sun);

        thursdayTextView.setText("tuesday");
        weathertuesdayIconView.setImageResource(R.drawable.cloud);

        thursdayTextView.setText("wednesday");
        weatherwednesdayIconView.setImageResource(R.drawable.cloud);

        thursdayTextView.setText("Thursday");
        weatherthursdayIconView.setImageResource(R.drawable.rainy);

        thursdayTextView.setText("friday");
        weatherfridayIconView.setImageResource(R.drawable.wind);

        thursdayTextView.setText("saturday");
        weathersaturdayIconView.setImageResource(R.drawable.sun);

        fridayTextView.setText("sunday");
        weathersundayIconView.setImageResource(R.drawable.sun);

        return view;
    }
}
