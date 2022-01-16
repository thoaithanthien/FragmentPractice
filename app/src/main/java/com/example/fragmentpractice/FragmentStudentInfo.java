package com.example.fragmentpractice;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentStudentInfo extends Fragment {
    TextView tv_Name, tv_NameSinh, tv_DiaChi, tv_Email;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_student_info,container,false);
         AnhXa();

        return view;
    }

    public void SetInfo(SinhVien sinhVien) {
        tv_Name.setText(sinhVien.getHoTen());
        tv_NameSinh.setText("Nam Sinh" + sinhVien.getNamSinh());
        tv_DiaChi.setText(sinhVien.getDiaChi());
        tv_Email.setText(sinhVien.getEmail());
    }

    private void AnhXa() {
        tv_Name = (TextView) view.findViewById(R.id.tv_Hoten);
        tv_NameSinh = (TextView) view.findViewById(R.id.tv_Namsinh);
        tv_DiaChi = (TextView) view.findViewById(R.id.tv_Diachi);
        tv_Email = (TextView) view.findViewById(R.id.tv_Email);
    }
}
