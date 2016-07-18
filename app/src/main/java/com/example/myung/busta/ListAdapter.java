package com.example.myung.busta;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by myung on 2016-07-19.
 */
public class ListAdapter extends BaseAdapter {

    public ListAdapter() {
        mTitle = new ArrayList<String>();
    }

    private ArrayList<String> mTitle;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
