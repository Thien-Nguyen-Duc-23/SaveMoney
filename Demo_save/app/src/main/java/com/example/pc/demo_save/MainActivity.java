package com.example.pc.demo_save;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtMain,txtMain_2;
    private EditText  edtMoney;
    private Button btnContinue;

    Typeface tfMain,tfMain2,tfMeney,tfCotri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMain=(TextView) findViewById(R.id.txtMain);
        txtMain_2=(TextView) findViewById(R.id.txtMain_2);
        edtMoney=(EditText) findViewById((R.id.edtMoney));
        btnContinue=(Button) findViewById(R.id.btnContinue);

        tfMain=Typeface.createFromAsset(getAssets(),"si.TTF");
        //tfMain2=Typeface.createFromAsset(getAssets(),"si.TTF");
        //tfMeney=Typeface.createFromAsset(getAssets(),"si.TTF");

        txtMain.setTypeface(tfMain);
        txtMain_2.setTypeface(tfMain);
        edtMoney.setTypeface(tfMain);

    }
}
