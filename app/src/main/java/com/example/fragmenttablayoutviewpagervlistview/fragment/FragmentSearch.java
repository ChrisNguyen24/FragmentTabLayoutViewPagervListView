package com.example.fragmenttablayoutviewpagervlistview.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.fragmenttablayoutviewpagervlistview.ListViewAdpter1;
import com.example.fragmenttablayoutviewpagervlistview.ListViewAdpter2;
import com.example.fragmenttablayoutviewpagervlistview.MainActivity;
import com.example.fragmenttablayoutviewpagervlistview.R;
import com.example.fragmenttablayoutviewpagervlistview.model.Cong;

import java.util.ArrayList;
import java.util.List;

public class FragmentSearch extends Fragment {
    private EditText et;
    private Button btS;
    private ListView lv;
    private List<Cong> listS;
    private MainActivity mainActivity;
    private ListViewAdpter2 listViewAdpter2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);

        listS = new ArrayList<>();
        listS = ((MainActivity)getActivity()).listM;
        /*listViewAdpter2 = new ListViewAdpter2((MainActivity)getActivity(),listS);*/


        btS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Cong> listF = new ArrayList<>();
                String txt = et.getText().toString();
                for(Cong c:listS){
                    if(c.getIp1().indexOf(txt)>=0){
                        listF.add(c);
                    }
                }
                listViewAdpter2 = new ListViewAdpter2((MainActivity)getActivity(),listF);
                lv.setAdapter(listViewAdpter2);
            }
        });

    }

    private void initView(View view) {
        et = view.findViewById(R.id.etSearch);
        btS = view.findViewById(R.id.btSearch);
        lv = view.findViewById(R.id.lv2);
    }

}