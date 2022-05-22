package com.bb.greatdayto_do_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.os.Bundle;

import com.bb.greatdayto_do_list.dao.CategoriesDao;
import com.bb.greatdayto_do_list.database.AppDatabase;
import com.bb.greatdayto_do_list.databinding.ActivityAddCategoryBinding;
import com.bb.greatdayto_do_list.entity.CategoriesEntity;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.Objects;

public class AddCategoryActivity extends AppCompatActivity {
    private ActivityAddCategoryBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addCatBtnBack.setOnClickListener( v -> finish());

        binding.addCatBtnSubmit.setOnClickListener( v -> saveCategory());

    }

    private void saveCategory() {
        CategoriesEntity categoriesEntity = new CategoriesEntity(Objects.requireNonNull(binding.addCatNameField.getText()).toString(),"test_icon");
        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext(),AppDatabase.class, "local_db").allowMainThreadQueries().build();
        appDatabase.categoriesDao().insert(categoriesEntity);


    }

    public interface setRefreshListener {
        void refresh();
    }
}