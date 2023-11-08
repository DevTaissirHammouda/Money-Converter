package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    TextView t;
    RadioGroup rg;
RadioButton rb;
RadioButton rd1;
    RadioButton rd2;

    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


     @SuppressLint("SetTextI18n")
     public void Des(View view) {

        rg = findViewById(R.id.rg);
et=findViewById(R.id.editTextTextPersonName);
        t= findViewById(R.id.textView);
        int buttonId = rg.getCheckedRadioButtonId();
        rb= findViewById(buttonId);
        rd1=findViewById(R.id.rb1);
         rd2=findViewById(R.id.rb2);

         if(rd1.isChecked() == rd2.isChecked())
{
    t.setText("you need to chzck");
}
else
            if (rb.getText().equals("Dinar to Euro") )
                t.setText("the convert is :" +Float.parseFloat(et.getText().toString())*3.36);
            else
                t.setText("the convert is :" + Float.parseFloat(et.getText().toString())/3.36);


    }



}