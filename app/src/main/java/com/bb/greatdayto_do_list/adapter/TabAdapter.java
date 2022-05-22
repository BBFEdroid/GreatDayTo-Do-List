package com.bb.greatdayto_do_list.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.bb.greatdayto_do_list.TaskListFragment;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentStateAdapter {
    private List<String> mainTab;
    public TabAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        mainTab=new ArrayList<>();
        mainTab.add("Task List");
        mainTab.add("Completed");
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
                    Fragment fragment = new Fragment();
            switch (position){
                case 0:
                case 1:
                    fragment = new TaskListFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getItemCount() {
            return mainTab.size();
        }

}
