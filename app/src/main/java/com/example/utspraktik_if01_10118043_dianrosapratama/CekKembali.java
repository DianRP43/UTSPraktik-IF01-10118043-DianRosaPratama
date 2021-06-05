package com.example.utspraktik_if01_10118043_dianrosapratama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CekKembali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cek_kembali);

        // get intent
        Intent intent = getIntent();
        String message = intent.getExtras().getString("nik");
        String message2 = intent.getExtras().getString("nama");
        String message3 = intent.getExtras().getString("tanggal");
        // capture
        EditText editText = findViewById(R.id.text_NIK);
        editText.setText(message);
        EditText editText2 = findViewById(R.id.text_Nama);
        editText2.setText(message2);
        EditText editText3 = findViewById(R.id.Text_tglLahir);
        editText3.setText(message3);
    }
    public void pindahhalaman (View view){
        Intent intent = new Intent(this, end.class);
        startActivity(intent);
    }
    public void back (View view){
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}