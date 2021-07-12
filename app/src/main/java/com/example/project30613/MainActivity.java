package com.example.project30613;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    Button btnFin, btnInit;
    ImageView imgAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1=findViewById(R.id.Text1);
        chkAgree=findViewById(R.id.ChkAgree);
        text2=findViewById(R.id.Text2);
        rGroup1=findViewById(R.id.Rgroup1);
        imgAndroid=findViewById(R.id.ImgAndroid);
        btnFin=findViewById(R.id.BtnFin);
        btnInit=findViewById(R.id.BtnInit);

        findViewById(R.id.Oreo).setOnClickListener(this);
        findViewById(R.id.Pie).setOnClickListener(this);
        findViewById(R.id.Q).setOnClickListener(this);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnFin.setVisibility(View.VISIBLE);
                    btnInit.setVisibility(View.VISIBLE);
                    imgAndroid.setVisibility(View.VISIBLE);
                } else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnFin.setVisibility(View.INVISIBLE);
                    btnInit.setVisibility((View.INVISIBLE));
                    imgAndroid.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Oreo:
                imgAndroid.setImageResource(R.drawable.oreo);
                break;

            case R.id.Pie:
                imgAndroid.setImageResource(R.drawable.pie);
                break;

            case R.id.Q:
                imgAndroid.setImageResource(R.drawable.q10);
                break;

            case R.id.BtnFin:
                finish();
                break;

            case R.id.BtnInit:
                chkAgree.setChecked(false);
                rGroup1.clearCheck();
                imgAndroid.setImageResource(0);
                break;
        }
    }
}