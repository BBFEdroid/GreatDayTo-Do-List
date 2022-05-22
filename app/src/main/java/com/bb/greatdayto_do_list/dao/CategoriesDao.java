package com.bb.greatdayto_do_list.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.bb.greatdayto_do_list.entity.CategoriesEntity;

import java.util.List;

@Dao
public interface CategoriesDao {
    @Query("SELECT * FROM categories")
    LiveData <List<CategoriesEntity>> getAll();

    @Query("SELECT * FROM categories WHERE categories_id IN (:categoriesId)")
    List<CategoriesEntity> loadAllByIds(int[] categoriesId);

//    @Query("SELECT * FROM categories WHERE  categories_id")
//    CategoriesEntity findById(String categories_id);

    @Query("UPDATE categories SET categories_name = :categoriesName, categories_icon = :categoriesIcon WHERE categories_id= :categoriesId")
    void updateAnExistingRow(int categoriesId, String categoriesName, String categoriesIcon);

    @Insert
    void insert(CategoriesEntity categoriesEntities);

    @Delete
    void delete(CategoriesEntity categoriesEntity);

}
