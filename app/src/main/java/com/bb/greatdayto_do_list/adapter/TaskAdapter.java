package com.bb.greatdayto_do_list.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bb.greatdayto_do_list.entity.TaskEntity;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

public class TaskAdapter extends  RecyclerView.Adapter<TaskAdapter.ViewHolder>{
    private List<TaskEntity> taskEntities;
    @NonNull
    @Override
    public TaskAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextInputEditText

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
