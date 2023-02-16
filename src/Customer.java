/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1906595_ct240;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Customer extends Thread {
    
    private Kho kho;
    private int sl_conlai;
    
    public Customer(Kho kho) {
        this.kho = kho;
        sl_conlai = kho.conlai();
    }

    @Override
    public void run() {
        
        synchronized(kho) {
//            while(true) {
                while(kho.isEmpty()){
                    System.out.println("Da het hang!");
                    try {
                        //                    kho.notifyAll();
                        kho.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                int sp = kho.getElement();
                System.out.println("Lay san pham " + sp + " ra khoi kho!");
                kho.remove();
                try {
                    Thread.sleep(1000);
                
                } catch (InterruptedException ex) {
                    Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
                }
                kho.notify();
//            }
       }   
    } 
}
