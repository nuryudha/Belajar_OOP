package com.tutorial;

class Mahasiswa{
    // data member
    String nama;
    String nim;

    //constructor
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    //method tanpa return dan tanpa parameter
     void show(){
         System.out.println("nama : " + this.nama);
         System.out.println("NIM : " + this.nim);
     }

     //method tanpa return dengan parameter
     void setNama(String nama){
         this.nama = nama;
     }

     //method dengan return tapi tak ada paramter
     String getNama(){
         return this.nama;
     }
     String getNim(){
         return this.nim;
     }

     //method dengan return dan paramter
     String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}


public class Main{
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("sandi", "1111");
        // System.out.println(mahasiswa1.nama);
        // System.out.println(mahasiswa1.nim);

        //method
        mahasiswa1.show();
        mahasiswa1.setNama("luar");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());

        String data = mahasiswa1.sayHi("Ganteng");
        System.out.println(data);
    
    }
}