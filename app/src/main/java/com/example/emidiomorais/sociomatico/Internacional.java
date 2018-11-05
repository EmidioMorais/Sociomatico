package com.example.emidiomorais.sociomatico;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toolbar;

import com.example.emidiomorais.sociomatico.controler.adapter.GridViewAdapter;

public class Internacional extends AppCompatActivity {

    private Toolbar toolbar;
    private GridView gridView;
    private GridViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internacional);


        setUpToolbar();



        gridView = (GridView) findViewById(R.id.internacional_gridview);
        adapter = new GridViewAdapter(getApplicationContext());

        int i;
        for (i = 0; i < 10; i++) {
            Internacional i = new Internacional();
            i.setImagemInternacional(R.drawable.sociomatico);
            i.setNomeInternacional("Nome Interacional");

            adapter.addItem(i);
        }

        gridView.setAdapter();
    }

    private void setNomeInternacional(String nome_interacional) {

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

        return super.onOptionsItemSelected(item);
    }

    public void setUpToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        toolbar.setTitle("Internacional");

        setSupportActionBar().show();
    }
}