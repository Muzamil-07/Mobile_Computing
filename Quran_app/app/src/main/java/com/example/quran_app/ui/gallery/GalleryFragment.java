package com.example.quran_app.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.quran_app.CustomAdapter;
import com.example.quran_app.DBHelper;
import com.example.quran_app.R;
import com.example.quran_app.SurahModel;
import com.example.quran_app.databinding.FragmentGalleryBinding;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_gallery, container, false);
        ListView listView = contentView.findViewById(R.id.listview);

        DBHelper dbHelper=new DBHelper(getContext());
        List<SurahModel> list = dbHelper.getAllSurah();
//        for(int i=0;i<10;i++)
//            list.("Item \n" + i);

        ArrayAdapter ad = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);


//        listView.set

        return contentView;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}