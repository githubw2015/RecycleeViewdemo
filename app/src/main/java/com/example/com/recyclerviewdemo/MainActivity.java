package com.example.com.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecycleListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initView();
        initData();
    }


    /**
     * 初始化view
     */
    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }


    /**
     * 初始化数据
     */
    private void initData() {
        adapter = new RecycleListAdapter(getApplicationContext());
        initListAdapterV();
    }


    //------------------------------------------------------------------------------------------------------------------
    //列表纵向排列
    private void initListAdapterV() {
        //设置 layoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //设置adapter
        recyclerView.setAdapter(adapter);
    }

    //列表横向排列
    private void initListAdapterH() {
        //设置 layoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        //设置adapter
        recyclerView.setAdapter(adapter);
    }


    //------------------------------------------------------------------------------------------------------------------
    //网格横向排列
    private void initGridAdapterH() {
        //设置 layoutManager
        GridLayoutManager gridManager = new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(gridManager);
        //设置adapter
        recyclerView.setAdapter(adapter);
    }


    //网格横向排列
    private void initGridAdapterV() {
        //设置 layoutManager
        GridLayoutManager gridManager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(gridManager);
        //设置adapter
        recyclerView.setAdapter(adapter);
    }


//------------------------------------------------------------------------------------------------------------------
    //瀑布流横向排列
    private void initStraggAdapterH() {
        StraggerAdapter adapter = new StraggerAdapter(getApplicationContext());
        //设置 layoutManager
        StaggeredGridLayoutManager straggManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(straggManager);
        //设置adapter
        recyclerView.setAdapter(adapter);
    }


    //瀑布流横向排列
    private void initStraggAdapterV() {
        StraggerAdapter adapter = new StraggerAdapter(getApplicationContext());
        //设置 layoutManager
        StaggeredGridLayoutManager straggManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(straggManager);
        //设置adapter
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            //LinaLayout横向布局、纵向布局
            case R.id.recy_list_V:
                initListAdapterV();
                break;

            case R.id.recy_list_h:
                initListAdapterH();
                break;


            //LinaLayout网格布局、纵向布局
            case R.id.recy_grid_h:
                initGridAdapterH();
                break;

            case R.id.recy_grid_v:
                initGridAdapterV();
                break;


            //LinaLayout瀑布流布局、纵向布局
            case R.id.recy_stragg_h:
                initStraggAdapterH();
                break;

            case R.id.recy_stragg_v:
                initStraggAdapterV();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
