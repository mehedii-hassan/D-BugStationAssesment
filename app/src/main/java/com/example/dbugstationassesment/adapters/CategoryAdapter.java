package com.example.dbugstationassesment.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbugstationassesment.databinding.RowItemDesignBinding;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private int[] categoryIcons;
    private String[] categoryNames;

    public CategoryAdapter(int[] categoryIcons, String[] categoryNames) {
        this.categoryIcons = categoryIcons;
        this.categoryNames = categoryNames;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        RowItemDesignBinding binding = RowItemDesignBinding.inflate(LayoutInflater
                .from(parent.getContext()), parent, false);
        return new CategoryViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.binding.ivCategoryImage.setImageResource(categoryIcons[position]);
        holder.binding.tvCategoryName.setText(categoryNames[position]);


    }

    @Override
    public int getItemCount() {
        return categoryIcons.length;
    }

    class CategoryViewHolder extends RecyclerView.ViewHolder {
        private RowItemDesignBinding binding;

        public CategoryViewHolder(RowItemDesignBinding binding) {

            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
