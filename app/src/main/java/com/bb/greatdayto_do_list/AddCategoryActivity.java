package com.bb.greatdayto_do_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bb.greatdayto_do_list.dao.CategoriesDao;
import com.bb.greatdayto_do_list.databinding.ActivityAddCategoryBinding;
import com.bb.greatdayto_do_list.entity.CategoriesEntity;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.Objects;

public class AddCategoryActivity extends AppCompatActivity {
    private ActivityAddCategoryBinding binding;

    String categoryIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addCatBtnBack.setOnClickListener( v -> finish());

//        binding.addCatBtnSubmit.setOnClickListener( v -> saveCategory());

    }

//    private void saveCategory() {
//        CategoriesEntity categoriesEntity = new CategoriesEntity();
//        categoriesEntity.setCategories_name(Objects.requireNonNull(binding.addCatNameField.getText()).toString());
//        CategoriesDao categoriesDao = new CategoriesDao() {
//            @Override
//            public List<CategoriesEntity> getAll() {
//                return null;
//            }
//
//            @Override
//            public CategoriesEntity findById(String categories_id) {
//                return null;
//            }
//
//            @Override
//            public void updateAnExistingRow(int categoriesId, String categoriesName, String categoriesIcon) {
//
//            }
//
//            @Override
//            public void insertAll(CategoriesEntity... categoriesEntities) {
//
//            }
//
//            @Override
//            public void delete(CategoriesEntity categoriesEntity) {
//
//            }
//        };
//    }
}