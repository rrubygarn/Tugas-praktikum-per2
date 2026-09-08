/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1.tugas;

/**
 *
 * @author Inka Putri
 */
public class MainTugas {
    public static void main(String[] args) {
        // Initialisasi Object 1
        Mahasiswa mhs1 = new Mahasiswa();

        // Initialisasi Object 2
        Mahasiswa mhs2 = new Mahasiswa(
                "I0325075",
                "Fairuz",
                "Hukum",
                0.0
        );

        // Initialisasi Object 3
        Mahasiswa mhs3 = new Mahasiswa(
                "F0325087",
                "Inka",
                "Ilmu politik",
                3.85
        );

        // Memanggil method
        System.out.println("MAHASISWA 1");
        mhs1.cetakKHS();
        System.out.println();
        System.out.println("MAHASISWA 2");
        mhs2.cetakKHS();
        System.out.println();
        System.out.println("MAHASISWA 3");
        mhs3.cetakKHS();
    }
}