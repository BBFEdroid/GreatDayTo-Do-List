package com.bb.greatdayto_do_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.bb.greatdayto_do_list.adapter.TabAdapter;
import com.bb.greatdayto_do_list.databinding.ActivityMainBinding;
import com.bb.greatdayto_do_list.entity.CategoriesEntity;
import com.bb.greatdayto_do_list.entity.TaskEntity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private List<String> mainTab;
    private List<CategoriesEntity> categoriesEntities;
    private List<TaskEntity> taskEntities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        
        mainTab=new ArrayList<>();
        mainTab.add("Task List");
        mainTab.add("Completed");

        ViewPager2 viewPager2 =findViewById(R.id.main_container_vpager);
        TabAdapter tabAdapter = new TabAdapter(MainActivity.this);
        viewPager2.setAdapter(tabAdapter);
        viewPager2.setUserInputEnabled(false);

        TabLayout tabLayout =findViewById(R.id.main_tablayout);
        new TabLayoutMediator(tabLayout, viewPager2, true, false,
                (tab, position) -> tab.setText(mainTab.get(position))).attach();
//        tabLayout.setTabRippleColor(null);
    }


}