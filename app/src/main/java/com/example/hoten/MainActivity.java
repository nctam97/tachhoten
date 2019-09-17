package com.example.hoten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edithoten;
    Button btntach;
    TextView textxuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edithoten=(EditText)findViewById(R.id.editText_hoten);
        btntach=(Button)findViewById(R.id.button_tach);
        textxuat=(TextView)findViewById(R.id.textView_xuat);
        btntach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi=edithoten.getText().toString();
                chuoi=chuoi.trim();
                int a=chuoi.indexOf(' ');
                int b=chuoi.lastIndexOf(' ');
                String ho=chuoi.substring(0,a);
                String ten=chuoi.substring(b);
                textxuat.setText("Họ: "+ho+" và Tên:"+ten);
            }
        });
    }
}
