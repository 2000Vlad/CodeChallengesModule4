package com.course.codechallenges.voyage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.course.codechallenges.R;

import java.util.List;

public class VoyageAdapter extends RecyclerView.Adapter<VoyageViewHolder> {
    private List<Voyage> mSource;
    public VoyageAdapter(List<Voyage> source){
        mSource=source;
    }
    @NonNull
    @Override
    public VoyageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate( R.layout.voyage_item,viewGroup,false);
        return new VoyageViewHolder(itemView,viewGroup.getContext());


    }

    @Override
    public void onBindViewHolder(@NonNull VoyageViewHolder voyageViewHolder, int i) {

        Voyage currentVoyage=mSource.get(i);
        voyageViewHolder.getPicture().setImageResource(currentVoyage.getImage());
        voyageViewHolder.getPicture().setTag(currentVoyage.getImage());
        voyageViewHolder.getLocation().setText(currentVoyage.getLocation());
        voyageViewHolder.getMoment().setText(currentVoyage.getMoment());
    }

    @Override
    public int getItemCount() {
      return mSource.size();
    }
}
