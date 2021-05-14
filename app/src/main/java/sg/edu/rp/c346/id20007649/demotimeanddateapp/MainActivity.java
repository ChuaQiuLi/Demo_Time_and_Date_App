package sg.edu.rp.c346.id20007649.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {


    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.LinearLayout);


        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String time = " ";

                time = "Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute();

                // this line to print out the display
                tvDisplay.setText(time);

            }
        });


        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String date = " ";

                int day = dp.getDayOfMonth();
                int month = dp.getMonth() + 1 ;
                int year = dp.getYear();

                date = "Date is " + day + "/" + month + "/" + year;

                // this line to print out the display
                tvDisplay.setText(date);


            }
        });


        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                tp.setCurrentHour(12);
                tp.setCurrentMinute(0);
                dp.updateDate(2021,0,1);


            }
        });





    }


}