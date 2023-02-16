/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1906595_ct240;

import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Producer extends Thread {
    
    private Kho kho;
    private int sp ;
    
    public Producer(Kho kho) {
        this.kho = kho;
    }

    @Override
    public void run() {
        
        synchronized(kho) {
//            while(true) {
                while(kho.isFull()){
                    System.out.println("Kho da day!");
                    try {
                      kho.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Random ran = new Random();
                sp = ran.nextInt(100)+1;
                System.out.println("Them san pham " + sp + " vao kho");
                kho.add(sp);
                try {
                    Thread.sleep(1000);
                
                } catch (InterruptedException ex) {
                    Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
                }
                kho.notifyAll();
//            }
        }
    }   
}
