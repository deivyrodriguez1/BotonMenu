package com.example.bottombar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoCalculadora#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoCalculadora extends Fragment implements View.OnClickListener {



    public FragmentoCalculadora() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentoCalculadora.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentoCalculadora newInstance(String param1, String param2) {
        FragmentoCalculadora fragment = new FragmentoCalculadora();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_fragmento_calculadora, container,false);
        expresion = view.findViewById(R.id.expresion);

            //2. Relacionar el objeto con el elemento cuyo id sea boton
            boton1 = view.findViewById(R.id.boton_1);
            boton2 = view.findViewById(R.id.boton_2);
            boton3 = view.findViewById(R.id.boton_3);
            boton4 = view.findViewById(R.id.boton_4);
            boton5 = view.findViewById(R.id.boton_5);
            boton6 = view.findViewById(R.id.boton_6);
            boton7 = view.findViewById(R.id.boton_7);
            boton8 = view.findViewById(R.id.boton_8);
            boton9 = view.findViewById(R.id.boton_9);
            boton0 = view.findViewById(R.id.boton_0);
            botonC = view.findViewById(R.id.boton_C);
            botonAC = view.findViewById(R.id.boton_AC);
            botonP = view.findViewById(R.id.boton_punto);
            botonI = view.findViewById(R.id.boton_igual);
            botonR = view.findViewById(R.id.boton_restar);
            botonS = view.findViewById(R.id.boton_sumar);
            botonD = view.findViewById(R.id.boton_dividir);
            botonMul = view.findViewById(R.id.boton_multiplicar);
            botonPI = view.findViewById(R.id.boton_parentesis_i);
            botonPD = view.findViewById(R.id.boton_parentesis_d);

            //Convertir los botones en un listener
            boton1.setOnClickListener(this);
            boton2.setOnClickListener(this);
            boton3.setOnClickListener(this);
            boton4.setOnClickListener(this);
            boton5.setOnClickListener(this);
            boton6.setOnClickListener(this);
            boton7.setOnClickListener(this);
            boton8.setOnClickListener(this);
            boton9.setOnClickListener(this);
            boton0.setOnClickListener(this);
            botonC.setOnClickListener(this);
            botonAC.setOnClickListener(this);
            botonP.setOnClickListener(this);
            botonI.setOnClickListener(this);
            botonR.setOnClickListener(this);
            botonS.setOnClickListener(this);
            botonD.setOnClickListener(this);
            botonMul.setOnClickListener(this);
            botonPI.setOnClickListener(this);
            botonPD.setOnClickListener(this);

            //3. Convertir el boton en un Listener
        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        boton3.setOnClickListener(this);
        boton4.setOnClickListener(this);
        boton5.setOnClickListener(this);
        boton6.setOnClickListener(this);
        boton7.setOnClickListener(this);
        boton8.setOnClickListener(this);
        boton9.setOnClickListener(this);
        boton0.setOnClickListener(this);
        botonC.setOnClickListener(this);
        botonAC.setOnClickListener(this);
        botonP.setOnClickListener(this);
        botonI.setOnClickListener(this);
        botonR.setOnClickListener(this);
        botonS.setOnClickListener(this);
        botonD.setOnClickListener(this);
        botonMul.setOnClickListener(this);
        botonPI.setOnClickListener(this);
        botonPD.setOnClickListener(this);



        return inflater.inflate(R.layout.fragment_fragmento_calculadora, container, false);

    }

    @Override
    public void onClick(View view) {

    }
}