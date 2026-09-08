/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.tugas;

/**
 *
 * @author Inka Putri
 */
// atribut
public class Mahasiswa {
    String NIM;
    String Nama;
    String ProgramStudi;
    double IPK;

    // 1. Default Constructor (Tanpa parameter)
    public Mahasiswa() {
        this.NIM = "Belum terdaftar";
        this.Nama = "Belum terdaftar";
        this.ProgramStudi = "Belum terdaftar";
        this.IPK = 0.0;
    }

    // 2. Parameterized Constructor
    public Mahasiswa(String NIM, String Nama, String ProgramStudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
        this.IPK = 0.0;
    }

    // 3. all Constructor
    public Mahasiswa(String NIM, String Nama, String ProgramStudi, double IPK) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.ProgramStudi = ProgramStudi;
        this.IPK = IPK;
    }

    // Method cetakKHS
    public void cetakKHS() {
        System.out.println("=================================");
        System.out.println("         DATA MAHASISWA");
        System.out.println("=================================");
        System.out.println("NIM           : " + NIM);
        System.out.println("Nama          : " + Nama);
        System.out.println("Program Studi : " + ProgramStudi);
        System.out.println("IPK           : " + IPK);
        System.out.println("=================================");
    }
}

