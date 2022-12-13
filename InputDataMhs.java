/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo9;
import java.util.ArrayList;
/**
 *
 * @author A S U S
 */
public class InputDataMhs {
ArrayList<Mahasiswa> listmahasiswa; 
 
public InputDataMhs() { 
listmahasiswa = new ArrayList (); 
}
 
  public void insertData(String NIM, String Nama, String Alamat) { 
     		   Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat); 
     		   listmahasiswa.add(mhs); 
}

 public ArrayList<Mahasiswa> getALL() { 
         return listmahasiswa; 
    	          }
          
          public void deleteData(int index) {
  		      listmahasiswa.remove(index);
          }    
}
