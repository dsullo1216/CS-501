package com.example.trafficlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private TextView lightLabel;
    private Button changeLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lightLabel = (TextView) findViewById(R.id.trafficLight);
        changeLight = (Button) findViewById(R.id.changeLightButton);

        changeLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int curColor = lightLabel.getCurrentTextColor();
                if (curColor == 0xffff0000) {
                    lightLabel.setTextColor(getResources().getColor(R.color.traffic_green));
                }
                else if (curColor == 0xffffff00) {
                    lightLabel.setTextColor(getResources().getColor(R.color.traffic_red));
                }
                else {
                    lightLabel.setTextColor(getResources().getColor(R.color.traffic_yellow));
                }
            }
        });

    }
}