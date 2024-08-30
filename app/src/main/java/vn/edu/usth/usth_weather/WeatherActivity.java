package vn.edu.usth.usth_weather;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        try {
            ForecastFragment forecastFragment = new ForecastFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.container, forecastFragment).commit();
        } catch (Exception e) {
            Log.i(TAG, "onCreate", e);
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");
    }



}