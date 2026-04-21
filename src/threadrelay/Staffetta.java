/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadrelay;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
/**
 *
 * @author ARCALENI.DANIELE2
 */
public class Staffetta implements Runnable{
    private JLabel label;
    private JProgressBar progressBar;
    
    public Staffetta(JLabel label, JProgressBar progressBar){
        this.label = label;
        this.progressBar =  progressBar;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            int count = i;
            label.setText("" + count);
            System.out.println("Thread: " + count);

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println("errore durante l'esecuzione del Thread");
            }
        }
    }
}

