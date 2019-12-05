package br.com.marcoapps.apiavicena.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.com.marcoapps.apiavicena.R;
import br.com.marcoapps.apiavicena.controller.UsuarioController;

public class ValidarUsuario extends AppCompatActivity {

    private UsuarioController control;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        control = new UsuarioController(this);
    }

    public void validar(View v){

        control.validarAction();
    }

}
