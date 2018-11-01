package com.example.hermenegildo.sociomatico;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hermenegildo.sociomatico.contoler.core.Noticia;

public class DetailNoticia extends AppCompatActivity {

    private TextView tituloNoticia;
    private  TextView descricaoNoticia;
    private ImageView imageNoticia;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_noticia);

        tituloNoticia = (TextView) findViewById(R.id.titulo_detail_noticia_textview);
        descricaoNoticia = (TextView) findViewById(R.id.descricao_noticia_textview);
        imageNoticia = (ImageView) findViewById(R.id.noticia_detail_imageview);
        Intent intent=  getIntent();

        int position = intent.getIntExtra(MainActivity.POSITION_NOTICIA, 0);

        Noticia noticia = MainActivity.arrayNoticia.get(position);

        tituloNoticia.setText(noticia.getTituloNoticia());
        descricaoNoticia.setText(noticia.getDescricaoNoticia());
        imageNoticia.setImageResource(noticia.getImagemNoticia());

    }
}
