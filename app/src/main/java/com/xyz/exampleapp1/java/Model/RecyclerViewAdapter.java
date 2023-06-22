package com.xyz.exampleapp1.java.Model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.xyz.exampleapp1.R;

import java.util.ArrayList;

public class RecyclerViewAdapter  extends RecyclerView.Adapter<RecyclerViewAdapter.AnimalViewHolder>{

    ArrayList<animal2> animals;

    public RecyclerViewAdapter(ArrayList<animal2> animals) {
        this.animals = animals;
    }

    /////////////////////////////////////////////////////////////////
    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     //inflate items
      View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item,null,false);
        AnimalViewHolder viewHolder=new AnimalViewHolder(v);
        return viewHolder;
    }
    ///////////////////////////////
    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
     animal2 a=animals.get(position);
     holder.imageView.setImageResource(a.getImg());
     holder.txtName.setText(a.getName());
    }
    ///////////////////////////////
    @Override
    public int getItemCount() {
        return animals.size();
    }
    //////////////////////////////////////////////
    ///class holder
    class AnimalViewHolder extends RecyclerView.ViewHolder {
        CardView card;
        ImageView imageView;
        TextView txtName;
        TextView txtHabitat;
        TextView txtDiet;
        TextView textBehavior;
        TextView txtFacts;



        public AnimalViewHolder(@NonNull View itemView) {
            super(itemView);
           card=(CardView) itemView.findViewById(R.id.card);
           imageView=(ImageView)itemView.findViewById(R.id.imageView);
           txtName=(TextView) itemView.findViewById(R.id.txtName);

        }
        //
    }
    /////////////////////////////////////////////////

}
