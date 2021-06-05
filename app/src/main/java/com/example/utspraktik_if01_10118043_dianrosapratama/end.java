package com.example.utspraktik_if01_10118043_dianrosapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }
    public void pindahhalaman (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}