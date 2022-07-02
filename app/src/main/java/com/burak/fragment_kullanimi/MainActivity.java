package com.burak.fragment_kullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton button1 = findViewById(R.id.fragmentFirst);
        AppCompatButton button2 = findViewById(R.id.fragmentLast);

        button1.setOnClickListener((e)-> {
            FragmentStart(new Fragment1());
        });
        button2.setOnClickListener((e)-> {
            FragmentStart(new Fragment2());
        });
    }

    private void FragmentStart(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager(); // fragment işlemlerini yapan metot
        FragmentTransaction transaction = fragmentManager.beginTransaction(); // işlemi başlatan yapı

        transaction.add(R.id.FrameLayout,fragment); //transactiona fragmentleri ekleyeceği bir frame layout ve fragment eklenir
        transaction.commit(); // işlemi başlatma

    }
}