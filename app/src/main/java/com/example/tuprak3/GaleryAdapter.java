package com.example.tuprak3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GaleryAdapter extends RecyclerView.Adapter<GaleryAdapter.GaleryViewHolder>{
    private List<Data> postList;


    GaleryAdapter(List<Data> postList){
        this.postList = postList;
    }

    @NonNull
    @Override
    public GaleryAdapter.GaleryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_galery, parent, false);
        return new GaleryAdapter.GaleryViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull GaleryAdapter.GaleryViewHolder holder, int position) {
        Data post = postList.get(position);
        holder.profilePostView.setImageResource(post.getFotoPostingan());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    class GaleryViewHolder extends RecyclerView.ViewHolder {
        ImageView profilePostView;


        GaleryViewHolder(@NonNull View itemView) {
            super(itemView);
            profilePostView = itemView.findViewById(R.id.imageView2);
//            postHeadView.setOnClickListener(this);
        }

        void setData(Data post){
            profilePostView.setImageResource(post.getFotoPostingan());
        }



//        @Override
//        public void onClick(View v) {
//            if (onItemClickListener != null) {
//                int position = getAdapterPosition();
//                if (position != RecyclerView.NO_POSITION) {
//                    Post post = postList.get(position);
//                    onItemClickListener.onItemClick(post);
//                }
//            }
//        }
    }



}
