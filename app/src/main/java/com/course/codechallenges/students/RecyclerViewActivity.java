package com.course.codechallenges.students;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.course.codechallenges.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private static final int STUDENT_COUNT = 10;
    private RecyclerView studentsRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyler_view);
        initUi();
    }
    private void initUi() {
        studentsRecyclerView=findViewById(R.id.student_recycler);
        studentsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        studentsRecyclerView.setAdapter(new StudentsAdapter(getStudents()));
    }

    private List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student student;
        for (int i = 1; i <= STUDENT_COUNT; i++)
        {
            student=new Student();

            student.setFirstName("First Name "+i);
            student.setLastName("Last Name "+i);
            students.add(student);
        }
        return students;

    }
}
