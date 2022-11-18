package com.example.bottombar;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    FrameLayout contenedorFragmentos;
    BottomNavigationView menuInferior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuInferior = findViewById(R.id.menuInferior);

        //barra para capturar los eventos al seleccionar un item del menu
        menuInferior.setOnItemSelectedListener(
                new NavigationBarView.OnItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        //Aqui se programa lo que sucede en el boton
                        //Obtener el Id del item seleccionado
                        int id = item.getItemId();
                        Log.d(TAG, String.valueOf(id));
                        switch (id) {
                            case R.id.iCalc:
                                //CArgar el fragmento de la calculadora

                                FragmentManager miAdministrador;
                                FragmentTransaction miTransaccion;
                                miAdministrador = getSupportFragmentManager();
                                miTransaccion = miAdministrador.beginTransaction();
                                miTransaccion.replace(R.id.contenedorFragmentos, new FragmentoCalculadora());
                                miTransaccion.commit();
                                break;
                            case R.id.iTeams:
                                //CArgar el fragmento de la calculadora
                                break;

                            case R.id.iMap:
                                //CArgar el fragmento de la calculadora
                                break;
                        }
                        return false;
                    };
                }
        );
    }
}