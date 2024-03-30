package com.nexis.minioyunapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //ana ekranda basılan tuşta sayfaya yönlendirmek içim
    public void btnAnasayfaAyar(View view){
        switch (view.getId()){
            case R.id.btnNormalOyun:
                sayfadegis("NormalOyun");
                break;

            case R.id.btnSureliOyun:
                sayfadegis("SureliOyun");
                break;
            case R.id.btnCikis:
                break;


        }
    }

    private void sayfadegis(String aktiviteIsmi){
        if(aktiviteIsmi.equals("Normal Oyun"))
            intent=new Intent(this, NormalOyunActivity.class);
        else
            intent=new Intent(this, SureliOyunActivty.class);

        startActivity(intent);

    }

    public void cikisYap(){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    //Geri butonuna basıldığında yapılacak işlemler buraya yazılır SOR



}