package com.example.mobile_09_cadastroatletas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mobile_09_cadastroatletas.model.AtletaSenior;

public class AtletaSeniorFragment extends Fragment {

    private View view;
    private EditText etNameAS;
    private EditText etBirthAS;
    private EditText etAddressAS;
    private RadioButton bt01AS;
    private RadioButton bt02AS;
    private Button btCAS;
    private TextView tvResAJ;

    public AtletaSeniorFragment() {
       super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_atleta_senior, container, false);
        etNameAS = view.findViewById(R.id.etNameAJ);
        etBirthAS = view.findViewById(R.id.etBirthAJ);
        etAddressAS = view.findViewById(R.id.etAddressAJ);
        bt01AS = view.findViewById(R.id.bt01AS);
        bt02AS = view.findViewById(R.id.bt02AS);
        btCAS = view.findViewById(R.id.bcCAS);

        btCAS.setOnClickListener(op -> cadastrar());
        return view;
    }

    private void cadastrar() {
            AtletaSenior Atleta = new AtletaSenior();
            Atleta.setName(etNameAS.getText().toString());
            Atleta.setAddress(etAddressAS.getText().toString());
            Atleta.setBirthDate(etBirthAS.getText().toString());

            if(bt01AS.isChecked()){
                Atleta.setCardiac(true);
            }else{
                Atleta.setCardiac(false);
            }
        Toast.makeText(view.getContext(), Atleta.toString(), Toast.LENGTH_LONG).show();
    }
}