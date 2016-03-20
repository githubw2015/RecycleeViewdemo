package com.example.com.recyclerviewdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/3/20.
 */
public class StraggerAdapter extends RecyclerView.Adapter<StraggerAdapter.myHolder> {

    private int[] mStraggeredIcons = new int[]{R.drawable.p1, R.drawable.p2, R.drawable.p3, R
            .drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8, R.drawable.p9, R
            .drawable.p10, R.drawable.p11, R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable
            .p15, R.drawable.p16, R.drawable.p17, R.drawable.p18, R.drawable.p19, R.drawable.p20, R
            .drawable.p21, R.drawable.p22, R.drawable.p23, R.drawable.p24, R.drawable.p25, R.drawable
            .p26, R.drawable.p27, R.drawable.p28, R.drawable.p29, R.drawable.p30, R.drawable.p31, R
            .drawable.p32, R.drawable.p33, R.drawable.p34, R.drawable.p35, R.drawable.p36, R.drawable
            .p37, R.drawable.p38, R.drawable.p39, R.drawable.p40, R.drawable.p41, R.drawable.p42, R
            .drawable.p43, R.drawable.p44};


    private Context context;
    public StraggerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public myHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, null);
        return new myHolder(view);
    }

    @Override
    public void onBindViewHolder(myHolder holder, int position) {
        holder.imageView.setImageDrawable(context.getDrawable(mStraggeredIcons[position % 10]));

    }

    @Override
    public int getItemCount() {
        return 1000;
    }

    public class myHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public myHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.recycler_imageview);
        }
    }
}
