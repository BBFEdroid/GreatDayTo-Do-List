package com.bb.greatdayto_do_list;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bb.greatdayto_do_list.adapter.CategoryAdapter;
import com.bb.greatdayto_do_list.adapter.TaskAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TaskListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TaskListFragment extends Fragment {

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_task_list, container, false);

        root.findViewById(R.id.task_list_cat_btn_add).setOnClickListener( v -> {
            Intent intent = new Intent(requireActivity(), AddCategoryActivity.class);
            startActivity(intent);
        });

        root.findViewById(R.id.task_list_task_btn_add).setOnClickListener( v -> {
            Intent intent = new Intent(requireActivity(), AddTaskActivity.class);
            startActivity(intent);
        });

        CategoryAdapter categoryAdapter = new CategoryAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView rvCategory=root.findViewById(R.id.task_list_cat_container);
        rvCategory.setLayoutManager(linearLayoutManager);
        rvCategory.setAdapter(categoryAdapter);

        TaskAdapter taskAdapter = new TaskAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false);
        RecyclerView rvTask=root.findViewById(R.id.task_list_task_container);
        rvTask.setLayoutManager(linearLayoutManager);
        rvTask.setAdapter(taskAdapter);

        return root;

    }

}