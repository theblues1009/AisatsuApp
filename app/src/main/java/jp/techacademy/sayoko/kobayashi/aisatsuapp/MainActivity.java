package jp.techacademy.sayoko.kobayashi.aisatsuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.TimePickerDialog;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.view.View;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            showTimePickerDialog();
        }
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        if(hourOfDay>=2 && hourOfDay<=9){
                            mTextView.setText("おはよう");
                        }else if(hourOfDay>=10 && hourOfDay<=17){
                            mTextView.setText("こんにちは");
                        }else {
                            mTextView.setText("こんばんは");
                        }
                    }
                },
                0,
                0,
                true);
        timePickerDialog.show();
                    }
}



