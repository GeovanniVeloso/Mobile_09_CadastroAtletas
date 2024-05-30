package com.example.mobile_09_cadastroatletas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

        AtletaJunior Atleta = new AtletaJunior();
        Atleta.setName(name);
        Atleta.setBirthDate(birth);
        Atleta.setAddress(address);
        Atleta.setCompetitionAge(time);

        Toast.makeText(view.getContext(), Atleta.toString(), Toast.LENGTH_LONG).show();
    }
}