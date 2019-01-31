package com.example.guilherme.dicionario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Locale;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView texto;
    private ImageButton apagar;

    private ImageButton textoA;
    private ImageButton textoB;
    private ImageButton textoC;
    private ImageButton textoD;
    private ImageButton textoE;
    private ImageButton textoF;
    private ImageButton textoG;
    private ImageButton textoH;
    private ImageButton textoI;
    private ImageButton textoJ;
    private ImageButton textoK;
    private ImageButton textoL;
    private ImageButton textoM;
    private ImageButton textoN;
    private ImageButton textoO;
    private ImageButton textoP;
    private ImageButton textoQ;
    private ImageButton textoR;
    private ImageButton textoS;
    private ImageButton textoT;
    private ImageButton textoU;
    private ImageButton textoV;
    private ImageButton textoW;
    private ImageButton textoX;
    private ImageButton textoY;
    private ImageButton textoZ;

    private ImageButton texto0;
    private ImageButton texto1;
    private ImageButton texto2;
    private ImageButton texto3;
    private ImageButton texto4;
    private ImageButton texto5;
    private ImageButton texto6;
    private ImageButton texto7;
    private ImageButton texto8;
    private ImageButton texto9;

    private Button espaço;
    private TextToSpeech t1;
    private ImageButton btnSound;
    String aux="";



    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textoPrincipal);
        apagar = (ImageButton)  findViewById(R.id.apagar);
        btnSound = (ImageButton) findViewById(R.id.btnSound);

        textoA = (ImageButton) findViewById(R.id.textoA);
        textoB = (ImageButton) findViewById(R.id.textoB);
        textoC = (ImageButton) findViewById(R.id.textoC);
        textoD = (ImageButton) findViewById(R.id.textoD);
        textoE = (ImageButton) findViewById(R.id.textoE);
        textoF = (ImageButton) findViewById(R.id.textoF);
        textoG = (ImageButton) findViewById(R.id.textoG);
        textoH = (ImageButton) findViewById(R.id.textoH);
        textoI = (ImageButton) findViewById(R.id.textoI);
        textoJ = (ImageButton) findViewById(R.id.textoJ);
        textoK = (ImageButton) findViewById(R.id.textoK);
        textoL = (ImageButton) findViewById(R.id.textoL);
        textoM = (ImageButton) findViewById(R.id.textoM);
        textoN = (ImageButton) findViewById(R.id.textoN);
        textoO = (ImageButton) findViewById(R.id.textoO);
        textoP = (ImageButton) findViewById(R.id.textoP);
        textoQ = (ImageButton) findViewById(R.id.textoQ);
        textoR = (ImageButton) findViewById(R.id.textoR);
        textoS = (ImageButton) findViewById(R.id.textoS);
        textoT = (ImageButton) findViewById(R.id.textoT);
        textoU = (ImageButton) findViewById(R.id.textoU);
        textoV = (ImageButton) findViewById(R.id.textoV);
        textoW = (ImageButton) findViewById(R.id.textoW);
        textoX = (ImageButton) findViewById(R.id.textoX);
        textoY = (ImageButton) findViewById(R.id.textoY);
        textoZ = (ImageButton) findViewById(R.id.textoZ);

        texto0 = (ImageButton) findViewById(R.id.textoNumero0);
        texto1 = (ImageButton) findViewById(R.id.textoNumero1);
        texto2 = (ImageButton) findViewById(R.id.textoNumero2);
        texto3 = (ImageButton) findViewById(R.id.textoNumero3);
        texto4 = (ImageButton) findViewById(R.id.textoNumero4);
        texto5 = (ImageButton) findViewById(R.id.textoNumero5);
        texto6 = (ImageButton) findViewById(R.id.textoNumero6);
        texto7 = (ImageButton) findViewById(R.id.textoNumero7);
        texto8 = (ImageButton) findViewById(R.id.textoNumero8);
        texto9 = (ImageButton) findViewById(R.id.textoNumero9);

        espaço = (Button) findViewById(R.id.espaço);

        apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // texto.setText("");
               // aux = "";
                deletar();
            }
        });

        apagar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                aux=" ";
                deletar();
                return false;
            }
        });


        espaço.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += " ";
                texto.setText(aux);
            }
        });


       textoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "A";
                texto.setText(aux);

            }
        });

        textoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "B";
                texto.setText(aux);

            }
        });

        textoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "C";
                texto.setText(aux);
            }
        });

        textoD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "D";
                texto.setText(aux);
            }
        });

        textoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "E";
                texto.setText(aux);
            }
        });

        textoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "F";
                texto.setText(aux);
            }
        });

        textoG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "G";
                texto.setText(aux);
            }
        });

        textoH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "H";
                texto.setText(aux);
            }
        });

        textoI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "I";
                texto.setText(aux);
            }
        });

        textoJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "J";
                texto.setText(aux);
            }
        });

        textoK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "K";
                texto.setText(aux);
            }
        });

        textoL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "L";
                texto.setText(aux);
            }
        });

        textoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "M";
                texto.setText(aux);
            }
        });
        textoN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "N";
                texto.setText(aux);
            }
        });

        textoO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "O";
                texto.setText(aux);
            }
        });

        textoP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "P";
                texto.setText(aux);
            }
        });
        textoQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "Q";
                texto.setText(aux);
            }
        });
        textoR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "R";
                texto.setText(aux);
            }
        });

        textoS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "S";
                texto.setText(aux);
            }
        });

        textoT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "T";
                texto.setText(aux);
            }
        });

        textoU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "U";
                texto.setText(aux);
            }
        });

        textoV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "V";
                texto.setText(aux);
            }
        });

        textoW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "W";
                texto.setText(aux);
            }
        });

        textoX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "X";
                texto.setText(aux);
            }
        });

        textoY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "Y";
                texto.setText(aux);
            }
        });

        textoZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "Z";
                texto.setText(aux);
            }
        });

        texto0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "0";
                texto.setText(aux);
            }
        });

        texto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "1";
                texto.setText(aux);
            }
        });

        texto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "2";
                texto.setText(aux);
            }
        });

        texto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "3";
                texto.setText(aux);
            }
        });

        texto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "4";
                texto.setText(aux);
            }
        });

        texto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "5";
                texto.setText(aux);
            }
        });

        texto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "6";
                texto.setText(aux);
            }
        });

        texto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "7";
                texto.setText(aux);
            }
        });

        texto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "8";
                texto.setText(aux);
            }
        });

        texto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux += "9";
                texto.setText(aux);
            }
        });




        t1=new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.getDefault());
                }
            }
        });

        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = texto.getText().toString();
               // Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
    }

    private void deletar(){

        if (texto.length() > 0) {
            aux = aux.substring (0, aux.length() - 1);
            texto.setText(aux);
        }

    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
            t1.shutdown();
        }
        super.onPause();
    }
}
