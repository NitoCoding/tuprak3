package com.example.tuprak3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private final List<Data> postList;
    private OnItemClickListener onItemClickListener;
    private final Context context;


    public interface OnItemClickListener {
        void onItemClick(Data post);
    }

    public CardAdapter(Context context, List<Data> postList) {
        this.context = context;
        this.postList = postList;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Data post = postList.get(position);
        if (post != null) {
            holder.bindData(post);
        }
    }

    @Override
    public int getItemCount() {
        return postList == null ? 0 : postList.size();
    }

    class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final ImageView postProfileImageView;
        private final ImageView postImageView;
        private final TextView postUserView;
        private final TextView postTextView;
        private final LinearLayout postHeadView;

        CardViewHolder(@NonNull View itemView) {
            super(itemView);
            postProfileImageView = itemView.findViewById(R.id.postProfileImage);
            postUserView = itemView.findViewById(R.id.postUser);
            postTextView = itemView.findViewById(R.id.postText);
            postImageView = itemView.findViewById(R.id.postImage);
            postHeadView = itemView.findViewById(R.id.postHead);

            // Attach the click listener to the entire itemView or any view that needs the listener
            postHeadView.setOnClickListener(this);
        }

        void bindData(Data post) {
            // Set post data to the view elements
            postImageView.setImageResource(post.getFotoPostingan());
            postProfileImageView.setImageResource(post.getFotoProfile());
            postUserView.setText(post.getUsername());
            postTextView.setText(post.getDeskripsi());

            // Set click listeners
            postProfileImageView.setOnClickListener(v -> {
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("data", post);
                context.startActivity(intent);
            });

            postUserView.setOnClickListener(v -> {
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("data", post);
                context.startActivity(intent);
            });

            postHeadView.setOnClickListener(v -> {
                Intent intent = new Intent(context, ProfileActivity.class);
                intent.putExtra("data", post);
                context.startActivity(intent);
            });
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    Data post = postList.get(position);
                    onItemClickListener.onItemClick(post);
                }
            }
        }
    }
}
