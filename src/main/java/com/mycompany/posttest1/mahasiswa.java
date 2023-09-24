/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author HP
 */
public class mahasiswa {
    //Property untuk entitas mahasiswa
    public String nim;
    public String nama;
    
    public mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
}
