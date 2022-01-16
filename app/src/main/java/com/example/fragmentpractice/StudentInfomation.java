package com.example.fragmentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StudentInfomation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infomation);

        Intent intent = getIntent();
        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("InformationSV");

        FragmentStudentInfo studentInfo =
                (FragmentStudentInfo) getFragmentManager().findFragmentById(R.id.fragmentInfoToinformation);
        studentInfo.SetInfo(sinhVien);
    }
}