package com.example.recyclerviewinsidefragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HelperAdapter extends RecyclerView.Adapter {
    Context context;
    ArrayList<String> arrayList , arrayListName;

    public HelperAdapter(Context context, ArrayList arrayList,ArrayList arrayListName) {
        this.context = context;
        this.arrayList = arrayList;
        this.arrayListName=arrayListName;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.display_item,parent,false);
        ViewHolderClass viewHolderClass=new ViewHolderClass(view);
        return viewHolderClass;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolderClass viewHolderClass=(ViewHolderClass)holder;
        viewHolderClass.textView1.setText(arrayList.get(position));
        viewHolderClass.textView2.setText(arrayListName.get(position));
        viewHolderClass.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"Item Selected",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListName.size();
    }
    public class ViewHolderClass extends RecyclerView.ViewHolder
    {
        TextView textView1, textView2;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            textView1=(TextView)itemView.findViewById(R.id.textView1);
            textView2=(TextView)itemView.findViewById(R.id.textView2);
        }
    }
}
