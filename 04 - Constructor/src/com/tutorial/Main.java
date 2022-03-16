package com.tutorial;

// class tanpa constructor / class polos
class Polos{
    String dataString ;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    String Nama;
    String Nim;
    String Jurusan;

    // ini adalah constructor saat object pertama kali dibuat
    // Mahasiswa(){
    //     System.out.println("ini adalah Constructor");
    // }

    //constructor dengan paramter
    Mahasiswa(String inputNama, String inputNim, String inputJurusan){
        Nama = inputNama;
        Nim = inputNim;
        Jurusan = inputJurusan;

        System.out.println("perkenalkan " + Nama);
        System.out.println(Nim);
        System.out.println(Jurusan);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup","1100","teknik");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong","110","Teknik Tel");
        

        
        
        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "polos";
        // objectPolos.dataInteger = 0;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

    }
}