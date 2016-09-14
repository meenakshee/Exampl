package com.example.it.exampl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView textview1;
    TimePicker timepicker1;
    Button changetime,open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1=(TextView)findViewById(R.id.textView1);
        timepicker1=(TimePicker)findViewById(R.id.timePicker1);
        //Uncomment the below line of code for 24 hour view
        timepicker1.setIs24HourView(true);
        changetime=(Button)findViewById(R.id.button1);
        open=(Button)findViewById(R.id.button2);

        textview1.setText(getCurrentTime());

        changetime.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textview1.setText(getCurrentTime());
            }
        });
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }

    public String getCurrentTime(){
        String currentTime="Current Time: "+timepicker1.getCurrentHour()+":"+timepicker1.getCurrentMinute();
        return currentTime;
    }


}

