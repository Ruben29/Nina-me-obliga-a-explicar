package boletin10.pkg2;

import javax.swing.JOptionPane;

public class Juego {

    private int jug1, jug2, numint, aux;
    private boolean perdedor = true;

    public Juego() {
        numint = 0;
        jug1 = 0;
        jug2 = 0;
        aux = 0;

    }

    public void GenerarDatos() {
        jug1 = (int) (Math.random() * 50 + 1);
        numint = 20;
    }

    public void Evaluar() {

        for (int contador = 0; contador != numint; contador++) {

            String respuesta3 = JOptionPane.showInputDialog("Juega tu número entre 1 y 50:");
            jug2 = Integer.parseInt(respuesta3);

            if (jug2 == jug1) {
                perdedor = false;
                JOptionPane.showMessageDialog(null, "Oooooooh, ENHORABUENA, HAS GANADO.\n ¡¡¡ERES MÁS LISTO QUE UNO DE PCPI!!!");
                contador = numint - 1;
            } else if (jug2 > jug1 && numint != (contador + 1)) {
                JOptionPane.showMessageDialog(null, "El número es menor \n Te quedan " + ((numint - contador) - 1) + "intentos...");
            } else {
                if (numint != (contador + 1)) {
                    JOptionPane.showMessageDialog(null, "El número es mayor \n Te quedan  " + ((numint - contador) - 1) + "intentos...");

                }

            }
        }

        if (perdedor == true) {
            JOptionPane.showMessageDialog(null, "JAJAJAJAJAJAJAJA HAS PERDIDO \n ¡¡¡LOS DE PCPI SON MÁS LISTOS QUE TU!!!");
        }

    }

}
