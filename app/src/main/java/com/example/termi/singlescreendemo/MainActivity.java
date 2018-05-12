package com.example.termi.singlescreendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring start button
        Button start_Btn = findViewById(R.id.start_btn);

        //initialing a toast message when the user taps the start button
        start_Btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(MainActivity.this,com.example.termi.singlescreendemo.R.string.start_btn_toast,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
