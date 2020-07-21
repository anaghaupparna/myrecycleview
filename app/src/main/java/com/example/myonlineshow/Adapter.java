package com.example.myonlineshow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {

    private List<ModelClass> modelclassList;
    private Context context;

    public Adapter(List<ModelClass> modelclassList, Context context)
    {
        this.modelclassList = modelclassList;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_layout, viewGroup, false);
        return new Viewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int position) {
        ModelClass model = modelclassList.get(position);
        viewholder.setData(model.getImageIcon(), model.getTittle(), model.getBody());
    }
    @Override
    public int getItemCount() {
        return modelclassList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder{
        private ImageView imageView;
        private TextView tittle;
        private TextView body;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            tittle = itemView.findViewById(R.id.textTittle);
            body = itemView.findViewById(R.id.textBody);
        }

        public void setData(int imageResource, String titleText, String bodyText) {
            imageView.setImageResource(imageResource);
            tittle.setText(titleText);
            body.setText(bodyText);
        }

    }

}
