package com.example.fragmentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Transmit {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataStudent(SinhVien sinhVien) {
        FragmentStudentInfo fragmentStudentInfo =
                (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragmentInfo);

        Configuration configuration = getResources().getConfiguration();

        if (fragmentStudentInfo != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //fragmentStudentInfo.isInLayout() dung de fix loi chuyen man hinh video 172.
            fragmentStudentInfo.SetInfo(sinhVien);
        }else {
            Intent intent = new Intent(MainActivity.this, StudentInfomation.class);
            intent.putExtra("InformationSV",sinhVien);
            startActivity(intent);
        }
    }
}