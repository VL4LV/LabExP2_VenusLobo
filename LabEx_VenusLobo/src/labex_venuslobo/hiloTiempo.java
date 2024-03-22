/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labex_venuslobo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author ADMIN
 */
public class hiloTiempo implements Runnable {
private JLabel hora;
    private boolean running;

    public hiloTiempo(JLabel hora) {
        this.hora = hora;
        this.running = true; 
    }

    // metodo para detener el hilo
    public void detener() {
        running = false;
    }

    @Override
    public void run() {
        while (running) {
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("mm:ss");
            hora.setText(f.format(h));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

}
