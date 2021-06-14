package com.example.myandoidapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myandoidapp1.RecyclerView.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity {
    private Fragment firstFragment;
    private Fragment secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstFragment = new FirstFragment();
        secondFragment = new SeconndFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,firstFragment).commit();
        Button buttonFragment1 = findViewById(R.id.buttonFragment1);
        Button buttonFragment2 = findViewById(R.id.buttonFragment2);
        buttonFragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,firstFragment).commit();
            }
        });
        buttonFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,secondFragment).commit();
                goToRecyclerView();
            }
        });

    }
    public void goToRecyclerView() {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}