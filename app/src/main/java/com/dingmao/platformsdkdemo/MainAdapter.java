package com.dingmao.platformsdkdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Create by atu on 2020/9/7
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<String> data;
    private Context mContext;
    public MainAdapter(Context context,List data){
        this.mContext = context;
        this.data = data;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_main,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        holder.mTextView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder{
        TextView mTextView;
        public MainViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.item);
        }
    }
}
