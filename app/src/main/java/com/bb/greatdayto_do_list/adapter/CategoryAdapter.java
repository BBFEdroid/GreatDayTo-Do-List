package com.bb.greatdayto_do_list.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bb.greatdayto_do_list.R;
import com.bb.greatdayto_do_list.entity.CategoriesEntity;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private List<CategoriesEntity> categoriesEntities;

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return categoriesEntities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextInputEditText categoryName;
        ImageView categoryIcon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.item_cat_title);
            categoryIcon = itemView.findViewById(R.id.item_cat_icon);
        }
    }
}
