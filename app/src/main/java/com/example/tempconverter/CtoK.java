package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CtoK extends AppCompatActivity {
    EditText celsiustokelvin;
    TextView kelvout;
    Button ctok_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cto_k);
        celsiustokelvin = findViewById(R.id.celsiustokelvin);
        kelvout = findViewById(R.id.kelvout);
        ctok_btn = findViewById(R.id.ctok_btn);

        ctok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // K = °C + 273.15
                String inp = celsiustokelvin.getText().toString();
                if(inp.isEmpty()){
                    Toast.makeText(CtoK.this,"Enter data",Toast.LENGTH_SHORT).show();
                }
                else {
                    double data = Double.parseDouble(inp);
                    double f;
                    f = data + 273.15;
                    DecimalFormat df = new DecimalFormat("#.###");
                    String formattedResult = df.format(f);
                    kelvout.setText(inp+"°C in Kelvin is " + formattedResult+"K");
                    celsiustokelvin.setText("");
                }

            }
        });

    }
}