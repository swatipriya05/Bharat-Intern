package com.example.swati_temperature_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText celcius;
    private Button convert;
    private TextView fahrenheit;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        celcius = findViewById(R.id.celcius);
        convert = findViewById(R.id.convert);
        fahrenheit = findViewById(R.id.fahrenheit);
        imageView = findViewById(R.id.imageView);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = celcius.getText().toString();
                double temp = Double.parseDouble(st);
                double farenheight = temp * (9.0 / 5.0) + 32.0;
                if (temp >= 40) {
                    imageView.setImageResource(R.drawable.fire);
                }
                else if (temp < 40 && temp > 10) {
                    imageView.setImageResource(R.drawable.smiley);
                }
                else {
                    imageView.setImageResource(R.drawable.ice);
                }
                fahrenheit.setText(Double.toString(farenheight));
            }
        });
    }
}