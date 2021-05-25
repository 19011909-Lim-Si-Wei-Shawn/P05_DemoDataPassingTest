package sg.edu.rp.c346.id19011909.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    //Creating Variable,
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        //Linking Variable,
        tvAnswer = findViewById(R.id.textView3);

        //Setting Intent,
        Intent intentReceived = getIntent();
        Double value = intentReceived.getDoubleExtra("Value", 0.0);
        tvAnswer.setText("Double value received is: " + value);
    }
}