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
public class RecycleListAdapter extends RecyclerView.Adapter<RecycleListAdapter.MyHolder> {

    //这是上下文对象
    public Context context;
    //这是RecyclerView图片数据
    int icons[] = {R.drawable.g1, R.drawable.g2, R.drawable.g3, R.drawable.g4, R.drawable.g5, R.drawable.g6, R.drawable.g7, R.drawable.g9,
            R.drawable.g10, R.drawable.g11, R.drawable.g12, R.drawable.g13, R.drawable.g14, R.drawable.g15, R.drawable.g16, R.drawable.g17, R.drawable.g18, R.drawable.g19,
            R.drawable.g20, R.drawable.g21, R.drawable.g22, R.drawable.g23, R.drawable.g24, R.drawable.g25, R.drawable.g26, R.drawable.g27, R.drawable.g28, R.drawable.g29,};

    public RecycleListAdapter(Context context) {
        this.context = context;
    }


    //返回一个RecyclerView所需要的View对象(加载xml布局)
    @Override
    public RecycleListAdapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //动态加载布局
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, null);
        return new MyHolder(view);
    }


    //填充数据
    @Override
    public void onBindViewHolder(RecycleListAdapter.MyHolder holder, int position) {
        //imageView.setImageResource(icons[position]);
        holder.imageView.setImageDrawable(context.getResources().getDrawable(icons[position % 10]));
    }

    //返回要展示的数据个数
    @Override
    public int getItemCount() {
        //我这里暂时定1000
        return 1000;
    }


    //自定义ViewHolder(查找xml中的控件)
    public class MyHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public MyHolder(View v) {
            super(v);
            imageView = (ImageView) v.findViewById(R.id.recycler_imageview);
        }
    }
}
