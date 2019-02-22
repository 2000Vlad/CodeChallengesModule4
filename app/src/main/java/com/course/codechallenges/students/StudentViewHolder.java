package com.course.codechallenges.students;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.course.codechallenges.R;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mFirstNameText;
    private TextView mLastNameText;

    public TextView getFirstNameText() {
        return mFirstNameText;
    }

    public void setFirstNameText(TextView firstNameText) {
        mFirstNameText = firstNameText;
    }

    public TextView getLastNameText() {
        return mLastNameText;
    }

    public void setLastTextView(TextView lastTextView) {
        mLastNameText = lastTextView;
    }

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        mFirstNameText =  itemView.findViewById(R.id.first_name);
        mLastNameText = itemView.findViewById(R.id.last_name);

    }
}
