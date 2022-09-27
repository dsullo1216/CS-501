package com.example.calorietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView calorieTitle;
    private TextView servingTitle;
    private TextView cheeseburgerCals;
    private TextView friesCals;
    private TextView shakeCals;
    private TextView totalCals;
    private ImageView cheeseburgerPic;
    private ImageView friesPic;
    private ImageView shakePic;
    private EditText cheeseburgerServings;
    private EditText friesServings;
    private EditText shakeServings;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calorieTitle = (TextView) findViewById(R.id.calorieTitle);
        servingTitle = (TextView) findViewById(R.id.servingTitle);
        cheeseburgerCals = (TextView) findViewById(R.id.cheeseburgerCals);
        friesCals = (TextView) findViewById(R.id.friesCals);
        shakeCals = (TextView) findViewById(R.id.shakeCals);
        totalCals = (TextView) findViewById(R.id.totalCals);
        cheeseburgerPic = (ImageView) findViewById(R.id.cheeseburgerPic);
        friesPic = (ImageView) findViewById(R.id.friesPic);
        shakePic = (ImageView) findViewById(R.id.shakePic);
        cheeseburgerServings = (EditText) findViewById(R.id.cheeseburgerServings);
        friesServings = (EditText) findViewById(R.id.friesServings);
        shakeServings = (EditText) findViewById(R.id.shakeServings);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cheeseburgerServings.getText().toString().equals("") || friesServings.getText().toString().equals("") || shakeServings.getText().toString().equals("")) {
                    totalCals.setText("Please provide a value for each of the food items");
                    return;
                }
                int numCalsCheeseburger = Integer.parseInt(cheeseburgerCals.getText().toString());
                int numCalsFries = Integer.parseInt(friesCals.getText().toString());
                int numCalsShake = Integer.parseInt(shakeCals.getText().toString());
                int numCheeseburgers = Integer.parseInt(cheeseburgerServings.getText().toString());
                int numFries = Integer.parseInt(friesServings.getText().toString());
                int numShakes = Integer.parseInt(shakeServings.getText().toString());
                int total = (numCalsCheeseburger * numCheeseburgers) + (numCalsFries * numFries) + (numCalsShake * numShakes);
                totalCals.setText(Integer.toString(total));

            }
        });

    }
}