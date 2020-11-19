/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan57.vehicle;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Vehicle
 */
public class PBOIF210119056Latihan57Vehicle {

    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : "+bicycle.getBrand());
        System.out.println("Model : "+bicycle.getModel());
        System.out.println("Jumlah Gear : "+bicycle.getMyGearCount());
        
        System.out.println();
        
        Skateboard skateboard=new Skateboard();
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        System.out.println("Brand : "+skateboard.getBrand());
        System.out.println("Model : "+skateboard.getModel());
        System.out.println("Panjangnya Board : "+skateboard.getMyBoardLength());
        
    }
    
}
