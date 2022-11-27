package com.muhammetbalikci.customfonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.myButton);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        String[] list = {"fonts/OpenSans-Bold.ttf","fonts/OpenSans-BoldItalic.ttf","fonts/OpenSans-ExtraBold.ttf","fonts/OpenSans-Regular.ttf", "fonts/OpenSans-Semibold.ttf"};
        Random rand = new Random();






        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] randList = new int[list.length];
                for(int i = 0; i < randList.length; i++){
                    randList[i] = rand.nextInt(randList.length);
                    a = list[randList[i]];
                    Typeface font = Typeface.createFromAsset(getAssets(),a);
                    if(i == 0) textView1.setTypeface(font);
                    if(i == 1) textView2.setTypeface(font);
                    if(i == 2) textView3.setTypeface(font);
                    if(i == 3) textView4.setTypeface(font);
                    else textView5.setTypeface(font);

                }







            }
        });
    }
}