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
    private Corridore precedente;
    int progresso = 0;
    private boolean pausa;
    
    public Corridore(JLabel label, JProgressBar progressBar, Corridore precedente){
        this.label = label;
        this.progressBar = progressBar;
        this.precedente = precedente;
    }
    
    public int getProgresso(){
        return progresso;
    }
    
    public void pausa(){
        pausa = true;
    }
    
    public void riprendi(){
        pausa = false;
    }

    @Override
    public void run() {
        if(precedente != null){
            while(precedente.getProgresso() < 90) {
                try {
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    System.out.println("Errore");
                }

            }
        }
        
        for (int i = 0; i < 101; i++) {
            controllaPausaThread();
            progresso = i;
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
    
    public void controllaPausaThread() {
        while (pausa == true) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Errore durante l'esecuzione del Thread");
            }
        }
        notifyAll();
    }
}
