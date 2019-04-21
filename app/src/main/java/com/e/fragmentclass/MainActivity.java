package com.e.fragmentclass;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.fragmentclass.fragments.FirstFragment;
import com.e.fragmentclass.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLoad;
    private boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoad = findViewById(R.id.btnLoad);

        btnLoad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if(status){
            transaction.replace(R.id.fragmentContainer, new FirstFragment())
                    .commit();
            status = false;
            btnLoad.setText("Load Second Fragment");
        }else{
            transaction.replace(R.id.fragmentContainer, new SecondFragment())
                    .commit();
            status = true;
            btnLoad.setText("Load Second Fragment");
        }
    }
}
