package com.example.test12141;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyAdapter extends BaseAdapter {
    private String[] shuju;
    private Context mcontext;

    public MyAdapter(Context mcontext, String[] shuju) {
        super();
        this.mcontext = mcontext;
        this.shuju = shuju;

    }

    @Override
    public int getCount() {
        return shuju.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.item, null);
        TextView textView = view.findViewById(R.id.tv_1);
        TextView textView1 = view.findViewById(R.id.tv_2);
        ImageView imageView = view.findViewById(R.id.imageView);
        Button button = view.findViewById(R.id.button);
        imageView.setImageResource(R.mipmap.ic_launcher);
        textView.setText(shuju[position]);
        return view;
    }

}
