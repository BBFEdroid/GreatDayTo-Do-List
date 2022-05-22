package com.bb.greatdayto_do_list.database;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.bb.greatdayto_do_list.dao.CategoriesDao;
import com.bb.greatdayto_do_list.dao.TaskDao;
import com.bb.greatdayto_do_list.entity.CategoriesEntity;
import com.bb.greatdayto_do_list.entity.TaskEntity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {TaskEntity.class, CategoriesEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    private static final String DB_NAME = "local_db";
    private static final String TAG = "AppDatabase";
    private static AppDatabase instance;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static AppDatabase    getInstance(final Context context) {
        if (instance == null) {
            synchronized (AppDatabase.class) {
                if (instance == null) {
                    instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DB_NAME)
                            .build();
                    Log.d(TAG, "New instance created...");
                }
            }
        }
        return instance;
    }

//    public static synchronized AppDatabase getInstance( final Context context) {
//        if (instance == null) {
//            instance = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, DB_NAME)
//                    .fallbackToDestructiveMigration()
//                    .build();
//        }
//        return instance;
//    }

    public abstract CategoriesDao categoriesDao();

    public abstract TaskDao taskDao();


    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}
