package com.example.arunsampeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {


    private LayoutInflater layoutInflater;
    private ArrayList arrayList;
    private Context context;


    public CustomAdapter(ArrayList arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.layout_listview, null);
            holder = new ViewHolder();
            holder.textViewL = view.findViewById(R.id.textViewLang);
            holder.imageViewL = view.findViewById(R.id.imageViewL);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.textViewL.setText(arrayList.get(position).toString());
        return view;
    }

    public class ViewHolder {
        TextView textViewL;
        ImageView imageViewL;
    }
}
