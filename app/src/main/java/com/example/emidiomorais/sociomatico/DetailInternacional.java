package com.example.emidiomorais.sociomatico;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailInternacional extends AppCompatActivity {

    private TextView nomeInternacional;
    private ImageView imagemInternacional;
    private TextView descricaoInternacional;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_internacional);

        nomeInternacional = (TextView) findViewById(R.id.nome_detail_internacional_textview);
        imagemInternacional = (ImageView) findViewById(R.id.imagem_detail_internacional_imageview);
        descricaoInternacional = (TextView) findViewById(R.id.descricao_internacional_textview);

    }
}
