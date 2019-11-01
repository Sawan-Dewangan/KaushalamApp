package com.skd.KaushalamApp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<Rview_list> mExampleList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{
        void onDeleteClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{

        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public Button mButton;

        public ExampleViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            mTextView1 = itemView.findViewById(R.id.tv1);
            mTextView2 = itemView.findViewById(R.id.tv2);
            mTextView3 = itemView.findViewById(R.id.tv3);
            mButton = itemView.findViewById(R.id.btn_del);

            mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if(position!= RecyclerView.NO_POSITION){
                            listener.onDeleteClick(position);
                        }
                    }
                }
            });
        }
    }
    public ExampleAdapter (ArrayList<Rview_list>exampleList){
        mExampleList = exampleList;
    }
    @NonNull
    @Override
    public ExampleAdapter.ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rview_list,parent,false);
        ExampleViewHolder evh = new ExampleViewHolder(v,mListener);
        return evh;
    }
    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int i) {
        Rview_list currentItem = mExampleList.get(i);
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        holder.mTextView3.setText(currentItem.getText3());

    }
    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}