package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText RupeesEditText = (EditText)findViewById(R.id.RupeesEditText);

        Double RupeesAmountDouble = Double.parseDouble(RupeesEditText.getText().toString());
        Double DollarAmount = RupeesAmountDouble/64;
        Toast.makeText(MainActivity.this, "$" + String.format("%.2f",DollarAmount),Toast.LENGTH_SHORT).show();

        Log.i("amount",RupeesEditText.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
