package sg.edu.rp.c346.id19011909.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    Button btnPassInteger;

    Button btnPassChar;

    TextView textViewPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        btnPassInteger = findViewById(R.id.buttonPassInteger);

        btnPassChar = findViewById(R.id.buttonPassChar);

        textViewPassDouble = findViewById(R.id.textViewPassDouble);

        //Setting Action,
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });

        btnPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("Char", 'a');
                startActivity(intent);
            }
        });

        textViewPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                intent.putExtra("Value", 99.99);
                startActivity(intent);
            }
        });

    }
}