package com.bb.greatdayto_do_list.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "task")
public class TaskEntity implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int task_id;
    @ColumnInfo(name = "task_start")
    String task_start;
    @ColumnInfo(name = "task_end")
    String task_end;
    @ColumnInfo(name = "task_title")
    String task_title;
    @ColumnInfo(name = "task_categories")
    int task_categories;
    @ColumnInfo(name = "task_desc")
    String task_desc;

    public TaskEntity(){

    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_start() {
        return task_start;
    }

    public void setTask_start(String task_start) {
        this.task_start = task_start;
    }

    public String getTask_end() {
        return task_end;
    }

    public void setTask_end(String task_end) {
        this.task_end = task_end;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public int getTask_categories() {
        return task_categories;
    }

    public void setTask_categories(int task_categories) {
        this.task_categories = task_categories;
    }

    public String getTask_desc() {
        return task_desc;
    }

    public void setTask_desc(String task_desc) {
        this.task_desc = task_desc;
    }
}
