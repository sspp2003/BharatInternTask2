package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class KtoC extends AppCompatActivity {
    private EditText keltoc;
    private TextView cout;
    private Button ktoc_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kto_c);
        keltoc = findViewById(R.id.keltoc);
        cout = findViewById(R.id.cout);
        ktoc_btn = findViewById(R.id.ktoc_btn);

        ktoc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // °C = K - 273.15
                String inp = keltoc.getText().toString();
                if(inp.isEmpty()){
                    Toast.makeText(KtoC.this,"Enter data",Toast.LENGTH_SHORT).show();
                }
                else {
                    double data = Double.parseDouble(inp);
                    double f;
                    f = data- 273.15;
                    DecimalFormat df = new DecimalFormat("#.###");
                    String formattedResult = df.format(f);
                    cout.setText(inp+"K in Celsius is " + formattedResult+"°C");
                    keltoc.setText("");
                }

            }
        });
    }
}