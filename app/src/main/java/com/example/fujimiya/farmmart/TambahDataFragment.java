package com.example.fujimiya.farmmart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TambahDataFragment extends Fragment {


    EditText Fid,Fnama,Fkomoditi,Fnope,Falamat;
    Button Fsimpan;
    public TambahDataFragment() {


        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tambah_data, container, false);

        Fid = (EditText) view.findViewById(R.id.input_id);
        Fnama = (EditText) view.findViewById(R.id.input_nama);
        Fkomoditi = (EditText) view.findViewById(R.id.input_komoditi);
        Fnope = (EditText) view.findViewById(R.id.input_nope);
        Falamat = (EditText) view.findViewById(R.id.input_alamat);
        Fsimpan = (Button) view.findViewById(R.id.btn_signup);




        Fsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                formcek();
            }
        });

        return view;
    }

    private boolean validateId() {
        if (Fid.getText().toString().trim().isEmpty()) {
            Fid.setError("Tidak boleh kosong!");
            Fid.requestFocus();
            return false;
        } else {

        }

        return true;
    }

    private boolean validateName() {
        if (Fnama.getText().toString().trim().isEmpty()) {
            Fnama.setError("Tidak boleh kosong!");
            Fnama.requestFocus();
            return false;
        } else {

        }

        return true;
    }

    private boolean validateKomoditi() {
        if (Fkomoditi.getText().toString().trim().isEmpty()) {
            Fkomoditi.setError("Tidak boleh kosong!");
            Fkomoditi.requestFocus();
            return false;
        } else {

        }

        return true;
    }

    private boolean validateNope() {
        if (Fnope.getText().toString().trim().isEmpty()) {
            Fnope.setError("Tidak boleh kosong!");
            Fnope.requestFocus();
            return false;
        } else {

        }

        return true;
    }

    private boolean validateAlamat() {
        if (Falamat.getText().toString().trim().isEmpty()) {
            Falamat.setError("Tidak boleh kosong!");
            Falamat.requestFocus();
            return false;
        } else {

        }

        return true;
    }

    private void formcek(){

        if (!validateId()) {
            return;
        }
        if (!validateName()) {
            return;
        }
        if (!validateNope()) {
            return;
        }

        if (!validateKomoditi()) {
            return;
        }

        if (!validateAlamat()) {
            return;
        }
    }

}
