package com.example.radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity {
RadioGroup grouptime;
RadioButton rdSang,rdTrua,rdChieu;
Button btnXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grouptime = (RadioGroup) findViewById(R.id.GroupThoigian);
        btnXacnhan = (Button) findViewById(R.id.buttonXacnhan);
        rdSang = (RadioButton) findViewById(R.id.radioButtonSang);
        rdTrua = (RadioButton) findViewById(R.id.radioButtonTrua);
        rdChieu = (RadioButton) findViewById(R.id.radioButtonChieu);

        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rdSang.isChecked()){
                    Toast.makeText(MainActivity.this, rdSang.getText(), Toast.LENGTH_SHORT).show();
                }
                if (rdTrua.isChecked()){
                    Toast.makeText(MainActivity.this, rdTrua.getText(), Toast.LENGTH_SHORT).show();
                }
                if (rdChieu.isChecked()){
                    Toast.makeText(MainActivity.this, rdChieu.getText(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        grouptime.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                //i: trả id của radiobutton
                switch (i){
                    case R.id.radioButtonSang:
                        Toast.makeText(MainActivity.this, "Bạn chọn sáng", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtonTrua:
                        Toast.makeText(MainActivity.this, "Bạn chọn trưa", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.radioButtonChieu:
                        Toast.makeText(MainActivity.this, "Bạn chọn chiều", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}