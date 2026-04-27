/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadrelay;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author compu
 */
public class Corridore implements Runnable{
    private JLabel label;
    private JProgressBar progressBar;
    
    public Corridore(JLabel label, JProgressBar progressBar){
        this.label = label;
        this.progressBar = progressBar;
    }

    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            int valore = i;
            label.setText("" + valore);
            progressBar.setValue(valore);

            try {
                Thread.sleep(20);
            }
            catch(InterruptedException e) {
                System.out.println("Errore durante l'esecuzione del Thread");
            }
        }
    }
}
