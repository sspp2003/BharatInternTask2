package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FtoK extends AppCompatActivity {
    private EditText farhtok;
    private TextView kout;

    private Button ftok_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fto_k);
        farhtok = findViewById(R.id.farhtok);
        kout = findViewById(R.id.kout);
        ftok_btn = findViewById(R.id.ftok_btn);

        ftok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // K = (°F + 459.67) × 5/9
                String inp = farhtok.getText().toString();
                if(inp.isEmpty()){
                    Toast.makeText(FtoK.this,"Enter data",Toast.LENGTH_SHORT).show();
                }
                else {
                    double data = Double.parseDouble(inp);
                    double f;
                    f = ((data + 459.67)*(5.0/9.0));
                    DecimalFormat df = new DecimalFormat("#.###");
                    String formattedResult = df.format(f);
                    kout.setText(inp+"°F in Kelvin is " +formattedResult+"K");
                    farhtok.setText("");
                }

            }
        });
    }
}