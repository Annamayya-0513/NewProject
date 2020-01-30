package com.example.newproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomListAdapter extends BaseAdapter {

    Context context;
    String countrylist[];
    int flags[];
    LayoutInflater layoutInflater;

    public CustomListAdapter(Context applicationContext, String[] countrylist, int[] flags) {

        super();
        this.countrylist = countrylist;
        this.context = applicationContext;
        this.flags = flags;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return countrylist.length;
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


        view= layoutInflater.inflate(R.layout.listview_data,null);

        TextView ListTextView = (TextView)view.findViewById(R.id.ListTextView);
        ImageView IconImageView = (ImageView)view.findViewById(R.id.IconImageView);

        ListTextView.setText(countrylist[i]);
        IconImageView.setImageResource(flags[i]);

        return view;
    }
}
