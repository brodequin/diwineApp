package com.example.diwineapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    String varietyNames[]={"ACOLON (Ac)","AGNI (Ag)","ALIBERNET (Al)","ANDRÉ (An)","ARIANA (Ar)","AURELIUS (Au)","AUXERROIS","BLAUBURGER",
            "CABERNET CORTIS","CABERNET DORSA","CABERNET MORAVIA","CABERNET SAUVIGNON","CERASON","DĚVÍN","DORNFELDER","ERILON","FLORIANKA",
            "FRANKOVKA","FRATAVA","HIBERNAL","CHARDONNAY","IRSAI OLIVER","JAKUBSKÉ","KERNER","KOFRANKA","LAUROT","LENA","MALVERINA","MEDEA",
            "MERLOT","MERY","MODRÝ PORTUGAL","MUŠKÁT MORAVSKÝ","MUŠKÁT OTTONEL","MÜLLER THURGAU","NATIVA","NERONET","NEUBURSKÉ","PÁLAVA","RINOT",
            "RUBINET","RULANDSKÉ BÍLÉ","RULANDSKÉ MODRÉ","RULANDSKÉ ŠEDÉ","RULENKA","RYZLINK RÝNSKÝ","RYZLINK VLAŠSKÝ","SAUVIGNON","SAVILON","SEVAR",
            "SVATOVAVŘINECKÉ","SVOJSEN","SYLVÁNSKÉ ZELENÉ","TRAMÍN ČERVENÝ","TRISTAR","VELTLÍNSKÉ ČERVENÉ RANÉ","VELTLÍNSKÉ ZELENÉ","VERITAS","VESNA","VRBOSKA","ZWEIGELTREBE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().show();

        recyclerView=findViewById(R.id.reclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerAdapter(this,varietyNames);
        recyclerView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        MenuItem item=menu.findItem(R.id.action_search);
        SearchView searchView= (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}