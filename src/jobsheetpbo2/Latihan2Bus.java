/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetpbo2;

/**
 *
 * @author Tarishaulia
 */
public class Latihan2Bus {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Latihan2Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //methhod mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp ;
        temp = this.penumpang+penumpang;
        if(temp>=maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah "+penumpang);
        System.out.println("Penumpang maksimun seharusnya adalah "+ maxPenumpang);
    }
}
