package com.example.jetpacky;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import com.example.jetpacky.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Person person1 = new Person("Jack", "jack@gmail.com");
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setPerson(person1);





    }

    public class MainActivityClickHandler{
        Context context;

        public MainActivityClickHandler(Context context) {
            this.context = context;
        }

        // First Button Click Handling
        public void onBtnHello(View view){
            Toast.makeText(context, "Hello My Friends", Toast.LENGTH_SHORT).show();

        }

        // Second Button Click Handling
        public void onBtnBye(View view){
            Toast.makeText(context, "Bye Bye My Friends", Toast.LENGTH_SHORT).show();

        }

    }