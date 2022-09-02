package com.example.quran_app.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.quran_app.DBHelper;
import com.example.quran_app.R;
import com.example.quran_app.SurahModel;
import com.example.quran_app.Surah_Detail;
import com.example.quran_app.databinding.FragmentHomeBinding;

import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_gallery, container, false);
        ListView listView = contentView.findViewById(R.id.listview2);

        DBHelper dbHelper=new DBHelper(getContext());
        List<SurahModel> list = dbHelper.getAllSurah();
        for(int i=0;i<10;i++)
            list.("Item \n" + i);

        ArrayAdapter ad = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);


//        listView.set
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                String currData = adapterView.getItemAtPosition(position).toString();
//                String arr[] = currData.split(" ");
//                String id = arr[0];
//                String name=arr[1];
//
//
//                Intent i = new Intent(getContext(), Surah_Detail.class);
//                i.putExtra("surahId",id);
//                i.putExtra("name",name);
//
//                startActivity(i);
//
//
//            }
//        });


        return contentView;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}