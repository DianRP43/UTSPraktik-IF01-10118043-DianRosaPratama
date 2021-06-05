package com.example.utspraktik_if01_10118043_dianrosapratama;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "com.example.utspraktik_if01_10118043_dianrosapratama";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void pindahhalaman (View view){
        Intent intent = new Intent(this,CekKembali.class);
        EditText editText = (EditText) findViewById(R.id.text_NIK);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}