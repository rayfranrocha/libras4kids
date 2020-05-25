package com.librasforkids.ui.login;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.librasforkids.R;
import com.librasforkids.utils.Utils;

public class LoginActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //conetando objetos da VIEW com variaveis da Activity
        final ImageView ivRobot = findViewById(R.id.ivRobot);
        final ImageView ivMenino = findViewById(R.id.ivMenino);
        final ImageView ivMenina = findViewById(R.id.ivMenina);

        final TextView tvBemvindo = findViewById(R.id.tvBemvindo);
        final TextView tvEscolha = findViewById(R.id.tvEscolha);

        //definindo os textos
        tvBemvindo.setText("Olá, seja bem-vindo. Seu IMEI: 1209839022133");
        tvEscolha.setText("Agora escolha um super herói e vamos brincar!");

        //tornando as imagens clicaveis
        ivMenino.setClickable(true);
        ivMenina.setClickable(true);

        //load das imagens
        ivRobot.setImageBitmap(Utils.getBitmapFromAssets(getAssets(),"robot.png"));
        ivMenino.setImageBitmap(Utils.getBitmapFromAssets(getAssets(),"superman.png"));
        ivMenina.setImageBitmap(Utils.getBitmapFromAssets(getAssets(),"wwoman.jpeg"));

        //criando o onclick das imagens
        ivMenino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onClick","clicou no menino...");


            }
        });

        ivMenina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("onClick","clicou na menina...");
            }
        });



    }
}
