package com.example.proam.classnavigator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class SearchClass_Instructions_LHW_Elevator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchclass__instructions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void row1click(View view)
    {
            Intent I1 =new Intent(this,SearchClass_Instructions_ExpandedView.class);
            I1.putExtra("ImgID",R.drawable.lhwest_elevator_1);
            I1.putExtra("Text","Go to Exit");
            startActivity(I1);
    }

}
