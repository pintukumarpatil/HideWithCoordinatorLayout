package com.pk.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import com.pk.example.R;
import com.pk.example.activity.partone.PartOneActivity;
import com.pk.example.activity.partthree.PartThreeRecyclerViewActivity;
import com.pk.example.activity.partthree.PartThreeScrollViewActivity;
import com.pk.example.activity.parttwo.PartTwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button partOneButton;
    private Button partTwoButton;
    private Button partThreeButtonRecyclerview;
    private Button partThreeButtonScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();

        partOneButton = (Button) findViewById(R.id.partOneButton);
        partTwoButton = (Button) findViewById(R.id.partTwoButton);
        partThreeButtonRecyclerview = (Button) findViewById(R.id.partThreeButtonRecyclerview);
        partThreeButtonScrollView = (Button) findViewById(R.id.partThreeButtonScrollView);



        partOneButton.setOnClickListener(this);
        partTwoButton.setOnClickListener(this);
        partThreeButtonRecyclerview.setOnClickListener(this);
        partThreeButtonScrollView.setOnClickListener(this);


    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle(getString(R.string.app_name));
    }

    @Override
    public void onClick(View v) {
        if(v.equals(partOneButton)) {
            startActivity(PartOneActivity.class);
        } else if(v.equals(partTwoButton)) {
            startActivity(PartTwoActivity.class);
        } else if(v.equals(partThreeButtonRecyclerview)) {
            startActivity(PartThreeRecyclerViewActivity.class);
        } else {
            startActivity(PartThreeScrollViewActivity.class);
        }
    }

    private void startActivity(Class<?> activityClass) {
        Intent myIntent = new Intent(this, activityClass);
        startActivity(myIntent);
    }
}
