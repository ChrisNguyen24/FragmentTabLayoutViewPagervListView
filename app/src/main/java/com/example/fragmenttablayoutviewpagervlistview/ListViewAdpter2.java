package com.example.fragmenttablayoutviewpagervlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fragmenttablayoutviewpagervlistview.model.Cong;

import java.util.List;

public class ListViewAdpter2 extends ArrayAdapter<Cong> {
    private MainActivity mainActivity;
    private List<Cong> mList;

    public ListViewAdpter2(@NonNull Activity context, List<Cong> list) {
        super(context, R.layout.item_list2,list);
        this.mainActivity = (MainActivity) context;
        this.mList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = mainActivity.getLayoutInflater();
        View v  = inflater.inflate(R.layout.item_list2,parent,false);

        ImageView img = v.findViewById(R.id.iSImg);
        TextView tv1 = v.findViewById(R.id.iStv1);
        TextView tv2 = v.findViewById(R.id.iStv2);
        TextView tv3 = v.findViewById(R.id.iStv3);

        Cong c = mList.get(position);

        img.setImageResource(c.getImgRes());
        tv1.setText(c.getIp1());
        tv2.setText(c.getIp2());
        tv3.setText(c.getIp3());
        return v;
    }
}
