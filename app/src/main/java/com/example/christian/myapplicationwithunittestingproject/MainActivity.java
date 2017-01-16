package com.example.christian.myapplicationwithunittestingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doSomething();
    }

    // What is that ;->
    private void doSomething() {
        
        Vector v = new Vector();
        v.add("Hello");
        
        if (v.contains("Hello")) {

        } else {

        }
    }
}
