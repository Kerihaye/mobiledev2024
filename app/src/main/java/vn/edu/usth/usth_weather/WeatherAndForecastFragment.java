package vn.edu.usth.usth_weather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WeatherAndForecastFragment extends Fragment {

    public WeatherAndForecastFragment() {
        // Constructor mặc định
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate layout cho fragment này
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

        // Tạo instance của WeatherFragment và ForecastFragment
        Fragment weatherFragment = new WeatherFragment();
        Fragment forecastFragment = new ForecastFragment();

        // Quản lý các fragment con
        FragmentManager fragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container_weather, weatherFragment);
        fragmentTransaction.replace(R.id.fragment_container_forecast, forecastFragment);
        fragmentTransaction.commit();

        return view;
    }
}
