package com.example.tuprak3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {

    private final List<Data> statusList;
    private final Context context;

    public StatusAdapter(Context context, List<Data> statusList) {
        this.context = context;
        this.statusList = statusList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_status, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Data status = statusList.get(position);

        holder.ivStatus.setImageResource(status.getFotoStory());
        holder.tvUsername.setText(status.getUsername());

        // Add click listener to the image view
        holder.ivStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pastikan intent dibuat dengan benar
                Intent intent = new Intent(context, StatusActivity.class);
                intent.putExtra("data", status); // Gunakan kunci yang sama dengan StatusActivity
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return statusList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivStatus;
        TextView tvUsername;
        Context context;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivStatus = itemView.findViewById(R.id.statusImage);
            tvUsername = itemView.findViewById(R.id.statusUser);
            context = itemView.getContext();
        }
    }
}
