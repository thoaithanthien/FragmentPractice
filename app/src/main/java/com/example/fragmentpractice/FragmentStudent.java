package com.example.fragmentpractice;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentStudent extends ListFragment {
    ArrayList<SinhVien> arrayListSV;
    AdapterStudent adapterStudent;
    Transmit transmit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        transmit = (Transmit) getActivity();
        arrayListSV = new ArrayList<>();
        AddArraySV();
        adapterStudent = new AdapterStudent(getActivity(),R.layout.row_student,arrayListSV);
        setListAdapter(adapterStudent);

        return inflater.inflate(R.layout.fragment_student_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        transmit.DataStudent(arrayListSV.get(position));
    }

    private void AddArraySV() {
        arrayListSV.add(new SinhVien("Pham Thoai", 2002,"Ha Noi", "pthoai@gmail.com"));
        arrayListSV.add(new SinhVien("Thanh Nga", 2002,"Hue", "pthoai@gmail.com"));
        arrayListSV.add(new SinhVien("Pham Quy", 2002,"Da Nang", "pthoai@gmail.com"));
        arrayListSV.add(new SinhVien("Quoc Hoa", 2002,"Ha Noi", "pthoai@gmail.com"));
        arrayListSV.add(new SinhVien("Truong Quang", 2002,"HCM", "pthoai@gmail.com"));
        arrayListSV.add(new SinhVien("Truong Quy", 2002,"Ha Noi", "pthoai@gmail.com"));
        arrayListSV.add(new SinhVien("Pham Thoai", 2002,"Quang tri", "pthoai@gmail.com"));
    }
}
