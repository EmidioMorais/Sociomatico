package com.example.emidiomorais.sociomatico;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.example.emidiomorais.sociomatico.controler.adapter.GridViewAdapter;

public class Internacional extends AppCompatActivity {

    private GridView gridView;
    private GridViewAdapter adapter;
    public int getImagemInternacional;
    public int getNomeInternacional;
    private int imagemInternacional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional);

        gridView = (GridView) findViewById(R.id.internacional_gridview);
        adapter = new GridViewAdapter(getApplicationContext());

        int i;
        for (i = 0; i < 10; i++) {
            Internacional i = new Internacional();
            i.setImagemInternacional(R.drawable.sociomatico);
            i.serNomeInternacional("Nome Interacional");

            adapter.addItem(i);
        }

        gridView.setAdapter();
    }

    private void serNomeInternacional(String nome_interacional) {

    }

    @Override
    public boolean OnCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu_internacional, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        getItemId id = new getItemId();

        if (id == R.id.action_settings){
            return true;
        }

        return false;
    }

    public void setImagemInternacional(int imagemInternacional) {
        this.imagemInternacional = imagemInternacional;
    }
}