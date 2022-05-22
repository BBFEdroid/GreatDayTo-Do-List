package com.bb.greatdayto_do_list;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bb.greatdayto_do_list.adapter.CategoryAdapter;
import com.bb.greatdayto_do_list.adapter.TaskAdapter;
import com.bb.greatdayto_do_list.database.AppDatabase;
import com.bb.greatdayto_do_list.entity.CategoriesEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TaskListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TaskListFragment extends Fragment {
    private List<CategoriesEntity> categoriesEntities;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TaskListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TaskListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TaskListFragment newInstance(String param1, String param2) {
        TaskListFragment fragment = new TaskListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_task_list, container, false);

        categoriesEntities = new ArrayList<>();

        root.findViewById(R.id.task_list_cat_btn_add).setOnClickListener( v -> {
            Intent intent = new Intent(requireActivity(), AddCategoryActivity.class);
            startActivity(intent);
        });

        root.findViewById(R.id.task_list_task_btn_add).setOnClickListener( v -> {
            Intent intent = new Intent(requireActivity(), AddTaskActivity.class);
            startActivity(intent);
        });

        CategoryAdapter categoryAdapter = new CategoryAdapter(categoriesEntities);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView rvCategory=root.findViewById(R.id.task_list_cat_container);
        rvCategory.setLayoutManager(linearLayoutManager);
        rvCategory.setAdapter(categoryAdapter);

        AppDatabase appDatabase = Room.databaseBuilder(requireActivity(), AppDatabase.class, "local_db").allowMainThreadQueries().build();
        appDatabase.categoriesDao().getAll().observe(requireActivity(), ctg -> {
            categoriesEntities = ctg;
            categoryAdapter.notifyDataSetChanged();
        });

//        TaskAdapter taskAdapter = new TaskAdapter();
////        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
//        RecyclerView rvTask=root.findViewById(R.id.task_list_task_container);
////        rvTask.setLayoutManager(linearLayoutManager);
//        rvTask.setAdapter(taskAdapter);

        return root;

    }

}