package com.example.newproject;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

class SpinnerCustomAdapter implements SpinnerAdapter {

    Context context;
    String countrylist[];
    int flags[];
    LayoutInflater layoutInflater;

    public SpinnerCustomAdapter(Context applicationContext, String[] countrylist, int[] flags) {

        super();
        this.countrylist = countrylist;
        this.context = applicationContext;
        this.flags = flags;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

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
    public boolean hasStableIds() {
        return false;
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

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
