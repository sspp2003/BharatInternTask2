package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class FtoC extends AppCompatActivity {
    EditText fahrentocel;
    TextView celout;
    Button ftoc_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fto_c);
        fahrentocel = findViewById(R.id.fahrentocel);
        celout = findViewById(R.id.celout);
        ftoc_btn = findViewById(R.id.ftoc_btn);

        ftoc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // °C = (°F - 32) × 5/9
                String inp = fahrentocel.getText().toString();
                if(inp.isEmpty()){
                    Toast.makeText(FtoC.this,"Enter data",Toast.LENGTH_SHORT).show();
                }
                else {
                    double data = Double.parseDouble(inp);
                    double f;
                    f = ((data - 32)*(5.0/9.0));
                    DecimalFormat df = new DecimalFormat("#.###");
                    String formattedResult = df.format(f);
                    celout.setText(inp+"°F in Celsius is " +formattedResult+"°C");
                    fahrentocel.setText("");
                }

            }
        });
    }
}