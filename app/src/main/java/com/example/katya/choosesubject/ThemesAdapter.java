package com.example.katya.choosesubject;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ThemesAdapter extends RecyclerView.Adapter<ThemesAdapter.ViewHolder> {

    ArrayList<String> themeName = new ArrayList<>();
    ArrayList<String> amountOfTasks = new ArrayList<>();
    Context context;

    public ThemesAdapter(Context applicationContext, ArrayList<String> themeName, ArrayList<String> amountOfTasks) {

        this.context = applicationContext;
        this.themeName = themeName;
        this.amountOfTasks = amountOfTasks;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView themeNameView;
        public TextView amountOfTasksView;

        public ViewHolder(View itemView) {
            super(itemView);

            themeNameView = itemView.findViewById(R.id.theme_name);
            amountOfTasksView = itemView.findViewById(R.id.number_of_tasks);
        }
    }

    @Override
    public ThemesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_theme_of_subject, parent, false);

        ThemesAdapter.ViewHolder viewHolder = new ThemesAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.themeNameView.setText(themeName.get(position));
        holder.amountOfTasksView.setText(amountOfTasks.get(position));

    }
    @Override
    public int getItemCount() {
        return amountOfTasks.size();
    }

}
