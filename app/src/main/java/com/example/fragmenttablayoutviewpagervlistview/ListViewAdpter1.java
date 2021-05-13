package com.example.fragmenttablayoutviewpagervlistview;

import android.app.Activity;
import android.content.Context;
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

import java.util.ArrayList;
import java.util.List;

public class ListViewAdpter1 extends ArrayAdapter<Cong> {
    private MainActivity mainActivity;
    private List<Cong> mList;

    public ListViewAdpter1(@NonNull Activity context,List<Cong> list) {
        super(context, R.layout.item_list1,list);
        this.mainActivity = (MainActivity) context;
        this.mList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater = mainActivity.getLayoutInflater();
        View v  = inflater.inflate(R.layout.item_list1,parent,false);

        ImageView img = v.findViewById(R.id.iImg);
        TextView tv1 = v.findViewById(R.id.itv1);
        TextView tv2 = v.findViewById(R.id.itv2);
        TextView tv3 = v.findViewById(R.id.itv3);
        Button btDel = v.findViewById(R.id.iBt);
        btDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mList.remove(position);
                notifyDataSetChanged();
            }
        });
        Cong c = mList.get(position);

        img.setImageResource(c.getImgRes());
        tv1.setText(c.getIp1());
        tv2.setText(c.getIp2());
        tv3.setText(c.getIp3());
        return v;
    }
}
