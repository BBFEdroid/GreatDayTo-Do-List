package com.bb.greatdayto_do_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bb.greatdayto_do_list.databinding.ActivityAddCategoryBinding;
import com.bb.greatdayto_do_list.databinding.ActivityAddTaskBinding;

public class AddTaskActivity extends AppCompatActivity {
    private ActivityAddTaskBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddTaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addTaskBtnBack.setOnClickListener( v -> finish());
    }
}