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
    public void run(){
        for(int i = 0; i < 101; i++){
            label.setText("" + (Integer.parseInt(label.getText()) + i));
            progressBar.setValue(i);
        }
    }
}
