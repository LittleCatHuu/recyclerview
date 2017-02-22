package com.example.n9262.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by n9262 on 2017/2/22.
 */
public class MyAdater extends RecyclerView.Adapter<MyAdater.ViewHolder>{
    private List<Student> studentList;
    public MyAdater(List<Student> studentList){
        this.studentList = studentList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.img_item,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Student student = studentList.get(position);
        holder.dogImg.setImageResource(student.imgId);
        holder.name.setText(student.name);
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView dogImg;
        TextView name;
        public ViewHolder(View itemView) {
            super(itemView);
            dogImg = (ImageView) itemView.findViewById(R.id.dogImg);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
