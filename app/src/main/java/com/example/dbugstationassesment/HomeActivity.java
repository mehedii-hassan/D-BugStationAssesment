package com.example.dbugstationassesment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.dbugstationassesment.adapters.CategoryAdapter;
import com.example.dbugstationassesment.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    int[] categoryIcons = {R.drawable.category, R.drawable.group_1000001075, R.drawable.group_1000001074,
            R.drawable.category, R.drawable.group_1000001075, R.drawable.group_1000001074};
    private String[] categoryNames;
    private CategoryAdapter categoryAdapter;
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        categoryNames = getResources().getStringArray(R.array.CategoryNames);
        categoryAdapter = new CategoryAdapter(categoryIcons, categoryNames);
        binding.rvId.setLayoutManager(new LinearLayoutManager(
                this,LinearLayoutManager.HORIZONTAL,false));
        binding.rvId.setAdapter(categoryAdapter);
    }
}