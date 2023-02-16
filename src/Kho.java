/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b1906595_ct240;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ADMIN
 */
public class Kho {
    
    private int sl_conlai;
    private int kt_kho;
    private final Queue<Integer> kho;

    public Kho(int kt_kho) {
        this.kho = new LinkedList();
        this.sl_conlai = kho.size();
        this.kt_kho = kt_kho;
    }
    
    public int conlai() {
        sl_conlai = kho.size();
        return sl_conlai;
    }
    
    public void add(int sp) {
        kho.add(sp);
    }
    
    public boolean isEmpty() {
        if(kho.size() == 0)
            return true;
        else return false;
    }
    
    public boolean isFull() {
        if(kho.size() == kt_kho)
            return true;
        else return false;
    }
    
    public int getElement() {
        return kho.element();
    }
    
    public void remove() {
        kho.remove();
    }
    
}
