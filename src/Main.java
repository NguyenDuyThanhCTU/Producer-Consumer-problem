/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1906595_ct240;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    
    public static void main(String [] args) throws InterruptedException {

        Kho store1 = new Kho(5);
        while(true) {
            Producer t1 = new Producer(store1);
            Customer t2 = new Customer(store1);
            t1.start();
            t2.start();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập phím bất kì để thoát. Hoặc c để tiếp tục.");
            String s = sc.nextLine();
            if(s.equals(null) == false){
                t1.stop();
                t2.stop();
                break;
            }

        }

//        Producer t1 = new Producer(store1);
//        Customer t2 = new Customer(store1);
//        t1.start();
//        t2.start();
        
    }
    
}
