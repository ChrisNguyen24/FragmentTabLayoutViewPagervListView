package com.example.fragmenttablayoutviewpagervlistview.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.fragmenttablayoutviewpagervlistview.ListViewAdpter1;
import com.example.fragmenttablayoutviewpagervlistview.MainActivity;
import com.example.fragmenttablayoutviewpagervlistview.R;
import com.example.fragmenttablayoutviewpagervlistview.model.Cong;

import java.util.ArrayList;
import java.util.List;

public class FragmentAR extends Fragment {
    private Spinner sp;
    private EditText et1,et2,et3;
    private Button bt1;
    private ListView lv1;
    private View v;
    private ListViewAdpter1 listViewAdpter1;
    private MainActivity mainActivity;
    private List<Cong> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_a_r, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        //listview
        list = new ArrayList<>();
        list.add(new Cong(R.drawable.ic_launcher_background,"Cong Nguyen","qwer","content test"));
        ((MainActivity)getActivity()).listM = list;

        listViewAdpter1 = new ListViewAdpter1((MainActivity)getActivity(),list);
        lv1.setAdapter(listViewAdpter1);
        //spinner
        String[] imgs = getResources().getStringArray(R.array.imgs);
        ArrayAdapter arrayAdapter = new ArrayAdapter(v.getContext(), android.R.layout.simple_spinner_item,imgs);
        sp.setAdapter(arrayAdapter);
        //add
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = sp.getSelectedItem().toString();
                String ip1 = et1.getText().toString();
                String ip2 = et2.getText().toString();
                String ip3 = et3.getText().toString();
                switch (item){
                    case "1":
                        list.add(new Cong(R.drawable.ic_launcher_foreground,ip1,ip2,ip3));
                        ((MainActivity)getActivity()).listM = list;
                        listViewAdpter1.notifyDataSetChanged();
                        break;
                    case "2":
                        list.add(new Cong(R.drawable.ic_launcher_background,ip1,ip2,ip3));
                        ((MainActivity)getActivity()).listM = list;
                        listViewAdpter1.notifyDataSetChanged();
                        break;
                }


            }
        });
    }

    private void initView(View v) {
        sp = v.findViewById(R.id.sp1);
        et1 = v.findViewById(R.id.et1);
        et2 = v.findViewById(R.id.et2);
        et3 = v.findViewById(R.id.et3);
        bt1 = v.findViewById(R.id.btAdd);
        lv1 = v.findViewById(R.id.lv1);
    }
}