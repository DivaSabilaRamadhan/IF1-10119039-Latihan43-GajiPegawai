/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deksripsi Program : Proram ini untuk menampilkan Gaji Pegawai dengan pendekatan objek 
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       GajiPegawai pegawai = new GajiPegawai();
       pegawai.setNama("Diva Sabila Ramadhan");
       pegawai.setAlamat("Komp Permata Biru");
       pegawai.setUangTransport(250000);
       pegawai.setUangTunjangan(300000);
       pegawai.setGajiPokok(45000000);
       pegawai.setTotalGaji(pegawai.getGajiPokok());
       pegawai.tampilData(pegawai.getNama(),
               pegawai.getAlamat(),
               pegawai.getUangTunjangan(),
               pegawai.getUangTransport(),
               pegawai.getGajiPokok(),
               pegawai.getTotalGaji()
       );
    }
    
}
