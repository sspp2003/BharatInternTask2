package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class KtoF extends AppCompatActivity {
    EditText ktofh;
    TextView fout;
    Button ktof_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kto_f);

        ktofh = findViewById(R.id.ktofh);
        fout = findViewById(R.id.fout);
        ktof_btn = findViewById(R.id.ktof_btn);

        ktof_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  °F = (K × 9/5) - 459.67
                String inp = ktofh.getText().toString();
                if(inp.isEmpty()){
                    Toast.makeText(KtoF.this,"Enter data",Toast.LENGTH_SHORT).show();
                }
                else {
                    double data = Double.parseDouble(inp);
                    double f;
                    f = ((data *(5.0/9.0)) - 459.67);
                    DecimalFormat df = new DecimalFormat("#.###");
                    String formattedResult = df.format(f);
                    fout.setText(inp+"K in Fahrenheit is " + formattedResult+"°F");
                    ktofh.setText("");
                }

            }
        });
    }
}