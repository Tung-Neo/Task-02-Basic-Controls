package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View v){
        Log.i("Info", "Convert Staring");
        EditText enterPrice = findViewById(R.id.enterPrice);
        TextView tvwPrice =  findViewById(R.id.textView);
        String USD = enterPrice.getText().toString();
        double USDDouble = Double.parseDouble(USD);
        double VNDDouble = USDDouble*23000;
        String result = String.format("%.2f USD convert to %.2f VND", USDDouble, VNDDouble);
        tvwPrice.setText(result);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}