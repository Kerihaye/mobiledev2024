package vn.edu.usth.usth_weather;

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
        view.setBackgroundColor(Color.parseColor("#2000FF00"));

        // Lấy tham chiếu tới các thành phần trong layout
        TextView dayTextView = view.findViewById(R.id.textview_day);
        ImageView weatherIconView = view.findViewById(R.id.imageview_weather_icon);

        // Bạn có thể thiết lập văn bản hoặc hình ảnh động cho các thành phần này nếu cần
        dayTextView.setText("Thursday");
        weatherIconView.setImageResource(R.drawable.sun); // Sử dụng tên ảnh đúng trong thư mục drawable

        return view;
    }
}
