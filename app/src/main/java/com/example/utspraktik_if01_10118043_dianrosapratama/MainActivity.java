package com.example.utspraktik_if01_10118043_dianrosapratama;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE = "com.example.utspraktik_if01_10118043_dianrosapratama";
    private Button button;
    private TextView textView;
    RadioGroup jenis_kelamin;
    private String jk,relasi2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.but_tgl);
        textView = findViewById(R.id.text_tanggal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilTanggal();
            }
        });


        RadioGroup jenisKelamin,relasi;
        jenisKelamin = findViewById(R.id.radgender);

        jenisKelamin.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_male:
                        jk = "Laki - Laki";
                        break;
                    case R.id.rb_female:
                        jk = "Perempuan";
                }
            }
        });

        relasi = findViewById(R.id.radrelasi);

        relasi.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.ortu:
                        relasi2 = "Orang tua";
                        break;
                    case R.id.suamiistri:
                        relasi2 = "Suami Istri";
                        break;
                    case R.id.anak:
                        relasi2 = "Anak";
                        break;
                    case R.id.kerabat:
                        relasi2 = "Kerabat";
                }
            }
        });

    }
    public  void pindahhalaman (View view){
        Intent intent = new Intent(this,CekKembali.class);
        EditText editText = (EditText) findViewById(R.id.text_NIK);
        EditText editText2 = (EditText) findViewById(R.id.text_nama);
        EditText editText3 = (EditText) findViewById(R.id.text_tanggal);

        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();
        String message3 = editText3.getText().toString();

        intent.putExtra("nik", message);
        intent.putExtra("nama", message2);
        intent.putExtra("tanggal", message3);
        intent.putExtra("jk", jk);
        intent.putExtra("relasi", relasi2);
        startActivity(intent);
    }
    public void TampilTanggal(){
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(), "data");
        datePickerFragment.setOnDateClickListener(new DatePickerFragment.onDateClickListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                String tahun = ""+datePicker.getYear();
                String bulan = ""+(datePicker.getMonth()+1);
                String hari = ""+datePicker.getDayOfMonth();
                String text = hari+" - "+bulan+" - "+tahun;
                textView.setText(text);
            }
        });
    }
}