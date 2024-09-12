package vn.edu.usth.usth_weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class WeatherActivity extends FragmentActivity {
    public static final String Command = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);

        View headerView = findViewById(R.id.header);
        TextView headerTitle = headerView.findViewById(R.id.header_title); // ID này phải trùng khớp với trong header.xml
        headerTitle.setText("Weather Header");

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
            @Override
            public Fragment getItem(int position) {
                return WeatherAndForecastFragment.newInstance("Param1_" + position, "Param2_" + position);
            }

            @Override
            public int getCount() {
                return 3;
            }
        });

        Log.i(Command, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Command, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Command, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Command, "onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Command, "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Command, "onStop");
    }
}
