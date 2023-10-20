package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CtoF extends AppCompatActivity {
    private EditText celsiustofahren;
    private TextView fahrenout;

    private Button ctof_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cto_f);
        celsiustofahren = findViewById(R.id.celsiustofahren);
        fahrenout = findViewById(R.id.fahrenout);
        ctof_btn = findViewById(R.id.ctof_btn);



        ctof_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //°F = (°C × 9/5) + 32
                String inp = celsiustofahren.getText().toString();
                if(inp.isEmpty()){
                    Toast.makeText(CtoF.this,"Enter data",Toast.LENGTH_SHORT).show();
                }
                else {
                    double data = Double.parseDouble(inp);
                    double f;
                    f = (data*(9.0/5.0))+32;
                    DecimalFormat df = new DecimalFormat("#.###");
                    String formattedResult = df.format(f);
                    fahrenout.setText(inp+"°C in Fahrenheit is " + formattedResult+"°F");
                    celsiustofahren.setText("");
                }

            }
        });


    }
}