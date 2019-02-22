package com.course.codechallenges.students;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.course.codechallenges.R;

import java.util.List;

public class StudentsAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    public StudentsAdapter(List<Student> source) {
        mSource=source;
    }
    private List<Student> mSource;
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View item=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_item,viewGroup,false);
        return new StudentViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
     Student currentStudent=mSource.get(i);
     studentViewHolder.getFirstNameText().setText(currentStudent.getFirstName());
     studentViewHolder.getLastNameText().setText(currentStudent.getLastName());
    }

    @Override
    public int getItemCount() {
        return mSource.size();
    }
}
