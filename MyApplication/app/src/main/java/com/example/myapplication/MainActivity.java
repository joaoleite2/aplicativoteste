package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double n1 = Double.parseDouble(numero1.getText().toString());
                double n2 = Double.parseDouble(numero2.getText().toString());
                double result = n1 + n2;
                result.setText(result.toString());
            }
        });
        }
    }
    final Button btn=(Button)findViewById(R.id.btncalcular);
    final TextView txtresult=(TextView)findViewById(R.id.txtresultado);
    final EditText numero1=(EditText)findViewById(R.id.txtnumero1);
    final EditText numero2=(EditText)findViewById(R.id.txtnumero2);
}