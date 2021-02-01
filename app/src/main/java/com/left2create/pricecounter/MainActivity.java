package com.left2create.pricecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onCountButtonClick(View view)
    {
        EditText et_length = (EditText) findViewById(R.id.editText_length);
        EditText et_fuel = (EditText) findViewById(R.id.editText_fuel);
        EditText et_price = (EditText) findViewById(R.id.editText_price);
        if(et_length.getText().toString() != "" && et_fuel.getText().toString() != "" && et_price.getText().toString() != "")
        {
               double   length = Double.parseDouble(et_length.getText().toString()),
                        fuel = Double.parseDouble(et_fuel.getText().toString()),
                        price = Double.parseDouble(et_price.getText().toString()),
                        result = (fuel * length) / 100 * price;
               String s_result = Double.toString(result);
               EditText et_result = (EditText) findViewById(R.id.editText_result);
               et_result.setText(s_result);
        }
    }

    public void onExitButtonClick(View view)
    {
        this.finishAndRemoveTask();
    }
}