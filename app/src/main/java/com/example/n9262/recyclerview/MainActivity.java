package com.example.n9262.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Student> studentList = new ArrayList<Student>();
    private MyAdater myAdater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudentList();
        initViews();
    }

    private void initViews() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager Lmanager = new LinearLayoutManager(this);
        Lmanager.setOrientation(LinearLayoutManager.HORIZONTAL);
        GridLayoutManager Gmanager = new GridLayoutManager(this,3);
    }

    private void initStudentList() {
        studentList.add(new Student("dsdff11111111134444",R.drawable.dog1));
        studentList.add(new Student("dsd24",R.drawable.dog2));
        studentList.add(new Student("dsa2sdd24",R.drawable.dog3));
        studentList.add(new Student("d472sdd24",R.drawable.dog3));
        studentList.add(new Student("ds4888895697844138d24",R.drawable.dog3));
        studentList.add(new Student("dsa2sdd24",R.drawable.dog3));
        studentList.add(new Student("dsa2sdd24",R.drawable.dog3));
        studentList.add(new Student("d345215844857895684545621235894224",R.drawable.dog3));
        studentList.add(new Student("d1533sdd24",R.drawable.dog3));
        studentList.add(new Student("ds18566285693458978562138sdd24",R.drawable.dog3));
    }
}
