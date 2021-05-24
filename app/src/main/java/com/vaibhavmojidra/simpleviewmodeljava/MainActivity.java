package com.vaibhavmojidra.simpleviewmodeljava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.vaibhavmojidra.simpleviewmodeljava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private MainActivityViewModel mainActivityViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainActivityViewModel= new ViewModelProvider(this).get(MainActivityViewModel.class);
        activityMainBinding.result.setText(String.valueOf(mainActivityViewModel.getResult()));
        activityMainBinding.button.setOnClickListener(v -> {
            activityMainBinding.result.setText(String.valueOf(mainActivityViewModel.updateResult(Integer.parseInt(activityMainBinding.textBox.getText().toString()))));
            activityMainBinding.textBox.setText("");
        });
    }
}