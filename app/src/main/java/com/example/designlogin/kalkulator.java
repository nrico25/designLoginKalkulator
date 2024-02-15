package com.example.designlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class kalkulator extends AppCompatActivity {
    //list widget
    EditText angka1;
    EditText angka2;
    Spinner spOperator;
    TextView tvHasil;
    Button buttonHitung;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        //connect ke layout
        angka1 = findViewById(R.id.angkaSatu);
        angka2 = findViewById(R.id.angkaDua);
        tvHasil = findViewById(R.id.tvHasil);
        spOperator = findViewById(R.id.spOperator);
        buttonHitung = findViewById(R.id.buttonHitung);
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //action kalkulasi angka 1 dan angka 2
                String value1 = angka1.getText().toString();
                String value2 = angka2.getText().toString();

                float num1 = Float.parseFloat(value1);
                float num2 = Float.parseFloat(value2);
                float hasil = 0f;

                String text = spOperator.getSelectedItem().toString();


                switch  (text){
                    case "Tambah":
                        hasil = num1+num2;
                        break;
                    case "Kurang":
                        hasil = num1-num2;
                        break;
                    case "Kali":
                        hasil = num1*num2;
                        break;
                    case "Bagi":
                        hasil = num1/num2;
                        break;

                }

                tvHasil.setText(Float.valueOf(hasil).toString());
            }
        });
    }
}