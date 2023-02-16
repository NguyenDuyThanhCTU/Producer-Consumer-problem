/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1906595_ct240;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class Stop extends Thread {
    
    private int flag;
    
    public Stop(int flag){
        this.flag = flag;
    }
    
    public int getflag() {
        return flag;
    }

    @Override
    public void run() {
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                try {
                    this.wait(3000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Stop.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        long delay = 3000l;
        Timer t = new Timer("Timer");
        t.schedule(time, delay);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap bat ki ki tu nao de thoat");
        String str = sc.nextLine();
        if(str.equals(null) == false)
            flag = 1;
        
    }
    
    
    
}
