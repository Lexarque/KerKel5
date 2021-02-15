package Yee;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        
        // Inisialisasi dan deklarasi variabel

        Output o = new Output();
        Input i = new Input();
        ArrayList<String> in = new ArrayList<>();
        ArrayList<String> in1 = new ArrayList<>();
        boolean c = true;
        
        // Memasukkan ada berapa tasks yang akan dilakukan
        // lalu memasukkan apa saja tasks yang akan dilakukan

        System.out.println("<><><><><><><><><><><><><><><><><><><><><>" +
                "\nSelamat datang di Prototype to-do list kami");
        System.out.print("Ada berapa task yang akan anda lakukan ? : ");
        int n2 = S.nextInt();
        S.nextLine();
        i.task(in, n2);

        System.out.println("Bagaimana saya bisa membantu anda ? ");
        
        // Memilih pilihan dari menu dibawah

        while(c){
            System.out.println("1. Membuat task baru" +
                    "\n2. Menampilkan Task yang belum selesai dan memasukkan task yang sudah diselesaikan" +
                    "\n3. Menampilkan task yang sudah selesai");
            System.out.print("Menu mana yang akan anda pilih ? : ");
            int n = S.nextInt();
            S.nextLine();

            if(n == 1){
                i.new_tasks(in);
            }
            else if(n == 2){
                o.Ndone(in);
                i.add_done(in1, in, true);
            }
            else if(n == 3){
                o.done(in1, in);
            }
            System.out.println("Apakah anda mau melakukan hal lain ?" + "\nY / N");
            String n1 = S.next();
            if(n1.equalsIgnoreCase("n")){
                c = false;
            }
        }
        // Program akan selesai jika user Menginput kan (" N ")
        // dan program bisa diulang jika user menginput kan (" Y ")
        
        System.out.println("Terimakasih telah menggunakan program kami :) ");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
    }
}
