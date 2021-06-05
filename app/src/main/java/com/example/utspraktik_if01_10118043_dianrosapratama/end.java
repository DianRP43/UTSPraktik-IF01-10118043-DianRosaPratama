package com.example.utspraktik_if01_10118043_dianrosapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class end extends AppCompatActivity {
    //(5 Juni 2021, 10118043, Dian Rosa Pratama, IF-01)
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