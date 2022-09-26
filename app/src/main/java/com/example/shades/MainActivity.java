package com.example.shades;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    private Button [] [] buttons; // imported button class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildGUIByCode(); // created method
    }

    int brownBackgroundColor = Color.parseColor("#c89b6d"); // BACKGROUND COLOR
    int buttonBackgroundColor = Color.parseColor("#ac7d50"); // BUTTON BACKGROUND COLOR

    private void buildGUIByCode() {
        // Get Width of the screen
        Point size = new Point();
        getWindowManager().getDefaultDisplay().getSize(size);
        int w = size.x;
        int h = size.y/7;

        // Create the layout manager as a GridLayout
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(1);
        gridLayout.setRowCount(3);

        // Create Buttons and add them to the GridLayout
        buttons = new Button[3][1];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 1; col++) {
                buttons[row][col] = new Button(this);
                gridLayout.addView(buttons[row][col], w, h);
                gridLayout.setBackgroundColor(brownBackgroundColor);
            }
        }


        // Set the GridLayout as the view of the activity
        setContentView(gridLayout);
    }


}