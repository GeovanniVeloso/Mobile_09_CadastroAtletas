package com.example.mobile_09_cadastroatletas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mobile_09_cadastroatletas.model.AtletaPleno;

public class AtletaPlenoFragment extends Fragment {

    private View view;
    private EditText etNameAP;
    private EditText etBirthAP;
    private EditText etAddressAP;
    private EditText etGymAP;
    private EditText etRecordAP;
    private Button btCalcAP;

    public AtletaPlenoFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_pleno, container, false);
        etNameAP = view.findViewById(R.id.etNameAJ);
        etAddressAP = view.findViewById(R.id.etAddressAJ);
        etBirthAP = view.findViewById(R.id.etBirthAJ);
        etGymAP = view.findViewById(R.id.etGymAP);
        etRecordAP = view.findViewById(R.id.etRecordAP);
        btCalcAP = view.findViewById(R.id.btCalcAP);
        btCalcAP.setOnClickListener(op -> cadastrar());

        return view;
    }

    private void cadastrar() {
        AtletaPleno Atleta = new AtletaPleno();
        Atleta.setName(etNameAP.getText().toString());
        Atleta.setAddress(etAddressAP.getText().toString());
        Atleta.setBirthDate(etBirthAP.getText().toString());
        Atleta.setGym(etGymAP.getText().toString());
        Atleta.setRecord(Double.parseDouble(etRecordAP.getText().toString()));

        Toast.makeText(view.getContext(), Atleta.toString(), Toast.LENGTH_LONG).show();
    }
}