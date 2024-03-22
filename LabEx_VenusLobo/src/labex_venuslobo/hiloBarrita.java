/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labex_venuslobo;

import javax.swing.JProgressBar;

/**
 *
 * @author ADMIN
 */
public class hiloBarrita implements Runnable {

    private JProgressBar barra;
    private int velocidad;

    public hiloBarrita(JProgressBar barra, int velocidad) {
        this.barra = barra;
        this.velocidad = velocidad;
    }

    @Override
    public void run() {
         while (barra.getValue() < 100) {
            // incrementar la barra de progreso segun la velocidad
            barra.setValue(barra.getValue() + velocidad);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
