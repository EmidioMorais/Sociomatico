package com.example.emidiomorais.sociomatico.controler.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emidiomorais.sociomatico.controler.core.Noticia;
import com.example.emidiomorais.sociomatico.R;

import java.util.ArrayList;

/**
 * created by.
 */

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<Noticia> mData = new ArrayList<Noticia>();
    private LayoutInflater mInflater;

    public ListViewAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(Noticia noticia) {
        mData.add(noticia);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Noticia getItem(int position) {
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
            convertView = mInflater.inflate(R.layout.item_listview_main, null);

            holder.noticaImageView = (ImageView) convertView.findViewById(R.id.noticia_imageview);
            holder.autorImageView = (ImageView) convertView.findViewById(R.id.autor_imageview);
            holder.tituloNoticiaTextView = (TextView) convertView.findViewById(R.id.titulo_noticia_textview);
            holder.autorTextView = (TextView) convertView.findViewById(R.id.autor_textview);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.noticaImageView.setImageResource(mData.get(position).getImagemNoticia());
        holder.autorImageView.setImageResource(mData.get(position).getImagemAutor());
        holder.tituloNoticiaTextView.setText(mData.get(position).tituloNoticia);
        holder.autorTextView.setText(mData.get(position).getAutorNoticia());

        return  convertView;

    }
    public static class ViewHolder {
        public ImageView noticaImageView;
        public ImageView autorImageView;
        public TextView tituloNoticiaTextView;
        public TextView autorTextView;
    }

}
