package com.example.emidiomorais.sociomatico.controler.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emidiomorais.sociomatico.Internacional;
import com.example.emidiomorais.sociomatico.controler.core.Noticia;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {

    private ArrayList<Internacional> mData = new ArrayList<Internacional>();
    private LayoutInflater mInflater;

    public GridViewAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(Internacional inernacional) {
        mData.add(inernacional);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Internacional getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();

        if (convertView == null) {
            convertView = mInflater.inflate(R.id.layout.item_gridview null);

            holder.imageInternacional = (ImageView) convertView.findViewById(R.id.imagem_internacional_imageview);
            holder.nomeInternacional = (TextView) convertView.findViewById(R.id.nome_internacional_textview);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.imageInternacional.setImageResource(mData.get(position).getImagemInternacional);
        holder.nomeInternacional.setText(mData.get(position).getNomeInternacional);
        return  convertView;

    }
    public static class ViewHolder {
        public ImageView imageInternacional;
        public TextView nomeInternacional;
    }


}
