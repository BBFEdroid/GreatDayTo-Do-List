package com.bb.greatdayto_do_list.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.bb.greatdayto_do_list.entity.CategoriesEntity;
import com.bb.greatdayto_do_list.entity.TaskEntity;

import java.util.List;

@Dao
public interface TaskDao {
    @Query("SELECT * FROM task")
    List<TaskEntity> getAll();

    @Query("SELECT * FROM task WHERE task_id IN (:taskId)")
    List<TaskEntity> loadAllByIds(int[] taskId);

//    @Query("SELECT * FROM task WHERE  task_id")
//    TaskEntity findById(String task_id);

    @Query("UPDATE task SET task_start = :taskStart, task_end = :taskEnd, task_title = :taskTitle, task_categories = :taskCategories, task_desc = :taskDesc WHERE task_id= :taskId")
    void updateAnExistingRow(int taskId, String taskStart, String taskEnd, String taskTitle, String taskCategories, String taskDesc);

    @Insert
    void insert(TaskEntity taskEntities);

    @Delete
    void delete(TaskEntity taskEntity);

}
