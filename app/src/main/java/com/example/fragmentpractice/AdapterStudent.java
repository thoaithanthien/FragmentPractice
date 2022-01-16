package com.example.fragmentpractice;

import android.content.Context;
import android.text.Layout;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterStudent extends BaseAdapter {
    private Context context;
    private int layout;
    private List<SinhVien> list;

    public AdapterStudent(Context context, int layout, List<SinhVien> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolde {
        TextView txtTen;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolde holde;
        if (view == null) {
            holde = new ViewHolde();
            //Lớp LayoutInflater được sử dụng để khởi tạo nội dung của các tệp XML bố trí vào các đối tượng View tương ứng của chúng
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holde.txtTen = (TextView) view.findViewById(R.id.tv_NameSV);
            view.setTag(holde);
        } else {
            holde = (ViewHolde) view.getTag();
        }
        SinhVien sinhVien = list.get(i);
        holde.txtTen.setText(sinhVien.getHoTen());

        return view;
    }
}
