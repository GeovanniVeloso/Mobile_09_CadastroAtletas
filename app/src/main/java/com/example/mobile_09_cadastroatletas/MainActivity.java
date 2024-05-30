package com.example.mobile_09_cadastroatletas;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            carregaFragment(bundle);
        }
    }

    private void carregaFragment(Bundle bundle) {
        String tipo = bundle.getString("tipo");
        if(tipo.equals("Junior")){
            fragment = new AtletaJuniorFragment();
        }else if (tipo.equals("Pleno")) {
            fragment = new AtletaPlenoFragment();
        }else if (tipo.equals("Senior")) {
            fragment = new AtletaSeniorFragment();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Intent i = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        if(id == R.id.item_01){
            bundle.putString("tipo","Junior");
            i.putExtras(bundle);
            this.startActivity(i);
            this.finish();
            return true;
        }
        if(id == R.id.item_02){
            bundle.putString("tipo","Pleno");
            i.putExtras(bundle);
            this.startActivity(i);
            this.finish();
            return true;
        }
        if(id == R.id.item_03){
            bundle.putString("tipo","Senior");
            i.putExtras(bundle);
            this.startActivity(i);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}