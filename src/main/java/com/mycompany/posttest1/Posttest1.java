/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Posttest1 {

    public static void main(String[] args) {
        //variabel bertibe ArrayList
        ArrayList<mahasiswa> students = new ArrayList();
        
        //Mengisi Array List dengan objek dari class mahasiswa
        students.add(new mahasiswa("2209116007","Vera Santi"));
        students.add(new mahasiswa("2209116030","Allyya Azizah"));
        students.add(new mahasiswa("2209116001","Muthmainnah"));
        students.add(new mahasiswa("2209116003","Sandrina Aulia"));
        students.add(new mahasiswa("22091160035","Farren Lyrananda"));
        
        //Perulangan untuk menampilkan list
        for (mahasiswa mhs : students) {
            String kalimat = "Mahasiswa UNMUL dengan NIM " + mhs.getNim()+ " adalah milik " + mhs.getNama();
            System.out.println(kalimat);
        }
    }
}
