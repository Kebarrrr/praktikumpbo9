/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo9;

/**
 *
 * @author A S U S
 */
public class Mahasiswa {
private String NIM, Nama, Alamat;

public Mahasiswa(String NIM, String Nama, String Alamat) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
}

public String getAlamat() {
        return Alamat;
}

public String getNIM() {
        return NIM;
}

public String getNama() {
        return Nama;
 
}
}