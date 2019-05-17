package com.example.mysqlite;

import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListviewAdapter<ViewHelper> extends BaseAdapter {

    Context mcontext;
    LayoutInflater inflater;
    List<model>modelList;
    ArrayList<model>arrayList;

    public ListviewAdapter(Context context, List<model> modelList) {
        mcontext = context;
        this.modelList = modelList;
        inflater=LayoutInflater.from(mcontext);
        this.arrayList=new ArrayList<model>();
        this.arrayList.addAll(modelList);

    }
    public class viewhelder{
        TextView mtitleTv, mdescTv;
        ImageView mIconTv;
    }

    @Override
    public int getCount() {
        return modelList.size();
    }

    @Override
    public Object getItem(int i) {
        return modelList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        viewhelder holder;
        if (view==null){
            holder=new viewhelder();
            view=inflater.inflate(R.layout.row,null);
            holder.mtitleTv=view.findViewById(R.id.txtview);
            holder.mdescTv=view.findViewById(R.id.txt);
            holder.mIconTv=view.findViewById(R.id.icon);
            view.setTag(holder);
        }else {
            holder=(viewhelder)view.getTag();
        }

        holder.mtitleTv.setText(modelList.get(position).getTitle());
        holder.mdescTv.setText(modelList.get(position).getDesc());
        holder.mIconTv.setImageResource(modelList.get(position).getIcon());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });
        return view;
    }

   public void filter(String charText){
        charText=charText.toLowerCase(Locale.getDefault());
        modelList.clear();
        if (charText.length()==0){
            modelList.addAll(arrayList);
        }


            }
   }

