package com.example.mobile_09_cadastroatletas;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mobile_09_cadastroatletas.model.AtletaJunior;

public class AtletaJuniorFragment extends Fragment {

     private View view;
     private EditText etNameAJ;
     private EditText etBirthAJ;
     private EditText etAddressAJ;
     private EditText etTimeAJ;
     private Button btCAJ;
     private TextView tvResAJ;

    public AtletaJuniorFragment() {
       super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =  inflater.inflate(R.layout.fragment_atleta_junior, container, false);
        etNameAJ = view.findViewById(R.id.etNameAJ);
        etBirthAJ = view.findViewById(R.id.etBirthAJ);
        etAddressAJ = view.findViewById(R.id.etAddressAJ);
        etTimeAJ = view.findViewById(R.id.etTimeAJ);
        btCAJ = view.findViewById(R.id.btCAJ);
        tvResAJ = view.findViewById(R.id.tvResAJ);

        btCAJ.setOnClickListener(op -> cadastrar());
        return view;
    }

    private void cadastrar() {
        String name = etNameAJ.getText().toString();
        String birth = etBirthAJ.getText().toString();
        String address = etAddressAJ.getText().toString();
        int time = Integer.parseInt(etTimeAJ.getText().toString());

        AtletaJunior aj = new AtletaJunior();
        aj.setName(name);
        aj.setBirthDate(birth);
        aj.setAddress(address);
        aj.setCompetitionAge(time);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.item_01){
            Intent i = new Intent(this, AtletaJuniorFragment.class);
            this.startActivity(i);
            this.finish();
            return true;
        }
        if(id == R.id.item_02){
            Intent i = new Intent(this, MainActivity.class);
            this.startActivity(i);
            this.finish();
            return true;
        }
        if(id == R.id.item_03){
            Intent i = new Intent(this, AtletaSeniorFragment.class);
            this.startActivity(i);
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/
}