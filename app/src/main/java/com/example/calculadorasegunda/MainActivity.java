package com.example.calculadorasegunda;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtCajaResultado;
    Button btnMC, btnMR, btnMas, btnMenos, btnM, btnPorcentaje, btnRaiz, btnCuadrado, btnFraccion,
            btnCE, btnC, btnDel, btnDivision, btnSiete, btnOcho, btnNueve, btnMultiplicar,
            btnCuatro, btnCinco, btnSeis, btnRestar, btnUno, btnDos, btnTres, btnSumar, btnMasMenos,
            btnCero, btnPunto, btnIgual;

    double n1=0, n2=0, res=0;
    boolean sumar, restar, multiplicar, division, porcentaje, raiz, cuadrado, sa, x=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCajaResultado = findViewById(R.id.txtCajaResultado);

        btnMC = findViewById(R.id.btnMC);
        btnMC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText("");
                res = 0;
            }
        });

        btnMR = findViewById(R.id.btnMR);
        btnMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(""+res);
            }
        });


        btnMas = findViewById(R.id.btnMas);
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res += n1;
                txtCajaResultado.setText(""+res);
            }
        });

        btnMenos = findViewById(R.id.btnMenos);
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res -= n1;
                txtCajaResultado.setText(""+res);
            }
        });

        btnM = findViewById(R.id.btnM);
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnPorcentaje = findViewById(R.id.btnPorcentaje);
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                porcentaje = true;
            }
        });

        btnRaiz = findViewById(R.id.btnRaiz);
        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                raiz = true;
            }
        });

        btnCuadrado = findViewById(R.id.btnCuadrado);
        btnCuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                cuadrado = true;
            }
        });

        btnFraccion = findViewById(R.id.btnFraccion);
        btnFraccion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnCE = findViewById(R.id.btnCE);
        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText("");
                res = 0;
            }
        });

        btnC = findViewById(R.id.btnC);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText("");
                res = 0;
            }
        });

        btnDel = findViewById(R.id.btnDel);
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText().subSequence(0, txtCajaResultado.getText().length()-1));
                res = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
            }
        });

        btnDivision = findViewById(R.id.btnDivision);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                txtCajaResultado.setText("");
                division = true;
                if(res==0) {
                    res = n1 / 1;
                }
                else {
                    res = res / n1;
                }
            }
        });

        btnSiete = findViewById(R.id.btnSiete);
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"7");
            }
        });

        btnOcho = findViewById(R.id.btnOcho);
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"8");
            }
        });

        btnNueve = findViewById(R.id.btnNueve);
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"9");
            }
        });

        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                txtCajaResultado.setText("");
                multiplicar = true;
                if(res==0) {
                    res = n1 * 1;
                }
                else {
                    res = res * n1;
                }
            }
        });

        btnCuatro = findViewById(R.id.btnCuatro);
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"4");
            }
        });

        btnCinco = findViewById(R.id.btnCinco);
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"5");
            }
        });

        btnSeis = findViewById(R.id.btnSeis);
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"6");
            }
        });

        btnRestar = findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                txtCajaResultado.setText("");
                if(res==0) {
                    res = n1 - res;
                }
                else {
                    res = res -n1;
                }
                restar = true;
            }
        });

        btnUno = findViewById(R.id.btnUno);
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"1");
            }
        });

        btnDos = findViewById(R.id.btnDos);
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"2");
            }
        });

        btnTres = findViewById(R.id.btnTres);
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"3");
            }
        });

        btnSumar = findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                txtCajaResultado.setText("");
                sumar = true;
                res = res + n1;
            }
        });

        btnMasMenos = findViewById(R.id.btnMasMenos);
        btnMasMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnCero = findViewById(R.id.btnCero);
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCajaResultado.setText(txtCajaResultado.getText()+"0");
            }
        });

        btnPunto = findViewById(R.id.btnPunto);
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnIgual = findViewById(R.id.btnIgual);
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sumar == true) {
                    if(res == n1) {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = n1 + n2;
                        txtCajaResultado.setText(""+res);
                        sa = false;

                    }
                    else {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = res + n2;
                        txtCajaResultado.setText(""+res);
                        sa = false;
                        n1 = res;
                    }
                }else if(restar == true) {
                    if(res == n1) {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = n1 - n2;
                        txtCajaResultado.setText(""+res);
                        restar = false;
                    }
                    else {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = res - n2;
                        txtCajaResultado.setText(""+res);
                        restar = false;
                    }
                }else if(division == true) {
                    if(res == n1) {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = n1 / n2;
                        txtCajaResultado.setText(""+res);
                        division = false;
                    }
                    else {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = res / n2;
                        txtCajaResultado.setText(""+res);
                        division=false;
                    }
                }else if(multiplicar == true) {
                    if(res == n1) {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = n1 * n2;
                        txtCajaResultado.setText(""+res);
                        multiplicar = false;
                    }
                    else {
                        n2 = Double.parseDouble(String.valueOf(txtCajaResultado.getText()));
                        res = res * n2;
                        txtCajaResultado.setText(""+res);
                        multiplicar = false;
                    }
                }else if(porcentaje == true) {
                    res = n1 / 100;
                    txtCajaResultado.setText(""+res);
                    porcentaje = false;
                }else if(raiz == true) {
                    res = Math.sqrt(n1);
                    txtCajaResultado.setText(""+res);
                    raiz = false;
                }else if(cuadrado == true) {
                    res = Math.pow(n1, 2);
                    txtCajaResultado.setText(""+res);
                    cuadrado = false;
                }
            }
        });
    }
}
