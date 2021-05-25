package sg.edu.rp.c346.id19011909.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    //Creating Variable,
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //Linking Variable,
        tvAnswer = findViewById(R.id.textView2);

        //Setting Intent,
        Intent intentReceived = getIntent();
        Character value = intentReceived.getCharExtra("Char", 'X');
        tvAnswer.setText("Character value received is: " + value);

    }
}