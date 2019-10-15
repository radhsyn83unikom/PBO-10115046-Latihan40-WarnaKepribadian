package com.radhsyn83;

import java.util.Scanner;

public class Warna {
    private String[] warnaText = {"\033[0;31m", "\033[0;32m", "\033[0;33m", "\033[0;34m", "\033[0;35m", "\033[0;36m"};
    private String[] warnaBackground = {"\033[0;101m", "\033[0;102m", "\033[0;103m", "\033[0;104m", "\033[0;105m", "\033[0;106m"};
    private String[] warnaNama = {"Merah", "Hijau", "Kuning", "Biru", "Ungu", "Cyan"};
    private String reset = "\033[0m";
    private String nama;
    private String pilihWarna;

    public void pilihWarnadanNama() {
        Scanner sc = new Scanner(System.in);

        System.out.println(warnaText[0] + "YUK" +
                warnaText[1] + " CEK" +
                warnaText[2] + " KEPRIBADIANMU" +
                warnaText[3] + " DARI" +
                warnaText[4] + " WARNA" +
                warnaText[5] + " FAVORITMU");

        System.out.println();
        System.out.println(warnaBackground[0] + "\t\t\t\t"+warnaNama[0]);
        System.out.println(warnaBackground[1] + "\t\t\t\t"+warnaNama[1]);
        System.out.println(warnaBackground[2] + "\t\t\t\t"+warnaNama[2]);
        System.out.println(warnaBackground[3] + "\t\t\t\t"+warnaNama[3]);
        System.out.println(warnaBackground[4] + "\t\t\t\t"+warnaNama[4]);

        System.out.println(reset );
        System.out.print("Pilih warna favoritmu : ");
        pilihWarna = sc.nextLine();
        System.out.print("Nama kamu : ");
        nama = sc.nextLine();

        String temu = "";
        for (int i = 0; i < warnaNama.length; i++) {
            if (pilihWarna.toLowerCase().equals(warnaNama[i].toLowerCase()))
                temu = warnaNama[i].toLowerCase();
        }

        if (!temu.equals("")) {
            System.out.println();
            System.out.println("======= Hasil tes kepribadian " + nama.toUpperCase() + "=======");
            switch (temu) {
                case "merah": pribadiMerah();
                    break;
                case "hijau": pribadiHijau();
                    break;
                case "kuning": pribadiKuning();
                    break;
                case "biru": pribadiBiru();
                    break;
                case "ungu": pribadiUngu();
                    break;
                default: empty();
                    break;
            }
        } else {
            empty();
        }
    }

    private void empty() {
        System.out.println("======= Hasil tes kepribadian " + nama.toUpperCase() + "=======");
        System.out.println("Belum teridentifikasi..");
    }

    private void pribadiMerah() {
        System.out.println("Warna Favoritmu adalah " + warnaText[0] + "Merah" + reset);
        System.out.println("1. Periang.");
        System.out.println("2. Pemberani.");
        System.out.println("3. Berani Ngambil Resiko dalam setiap langkah.");
        System.out.println("4. Menyukai tantangan.");
        System.out.println("5. Kurang sabar.");
        System.out.println("6. Dapat menahan amarah namun jika sudah tahap toleransi, kemarahan akan sulit di kontrol.");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }

    private void pribadiHijau() {
        System.out.println("Warna Favoritmu adalah " + warnaText[1] + "Hijau" + reset);
        System.out.println("1. Romantis.");
        System.out.println("2. Menyukai hal berbau alami dan keindahan.");
        System.out.println("3. Tegih pada prinsip.");
        System.out.println("4. Menginginkan kesmpurnaan.");
        System.out.println("5. Mudah Cemburu.");
        System.out.println("6. Mudah merasa iri.");
        System.out.println("7. Menjungjung tinggi nilai toleransi dan kepercayaan");
    }

    private void pribadiKuning() {
        System.out.println("Warna Favoritmu adalah " + warnaText[3] + "Kuning" + reset);
        System.out.println("1. Optimis.");
        System.out.println("2. Suka Bergaul.");
        System.out.println("3. Periang.");
        System.out.println("4. Senang Menolong.");
        System.out.println("5. Lincah dan Aktif.");
        System.out.println("6. Tidak suka meremehkan orang lain");
        System.out.println("7. Loyal");
        System.out.println("8. Hangat");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringa sekali goyah dan tidak stabil");
        System.out.println("10. Cenderung penakut");
    }

    private void pribadiBiru() {
        System.out.println("Warna Favoritmu adalah " + warnaText[4] + "Biru" + reset);
        System.out.println("1. Menyenangkan.");
        System.out.println("2. Bijaksana.");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah.");
        System.out.println("4. Dinamis.");
        System.out.println("5. Senang berbagi.");
        System.out.println("6. Bersahabat");
        System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang");
        System.out.println("8. Menyembunyikan karakter karena dirinya cenderung mencari jalan damai");
    }

    private void pribadiUngu() {
        System.out.println("Warna Favoritmu adalah " + warnaText[5] + "Ungu" + reset);
        System.out.println("1. Optimis.");
        System.out.println("2. Tidak pernah ragu.");
        System.out.println("3. Menurutnya pasangan yang ideal ialah pasangan yang memiliki mental kuat");
        System.out.println("4. Memiliki ambisi yang besar.");
        System.out.println("5. Memiliki Empati yang besar.");
        System.out.println("6. Memiliki sisi misterius sebab seingkali menutupi perasaannya");
        System.out.println("7. Terkadang bersikap keras kepala dan angkuh");
    }

}
