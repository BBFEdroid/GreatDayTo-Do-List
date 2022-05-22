package com.bb.greatdayto_do_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.bb.greatdayto_do_list.databinding.ActivityWalkthroughBinding;

public class WalkthroughActivity extends AppCompatActivity {
    private ActivityWalkthroughBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWalkthroughBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.wlkBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}