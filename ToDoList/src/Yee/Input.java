package Yee;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    
    //Inisialisasi dan deklarasi variabel instance
    //Membuat Scanner

    Scanner S = new Scanner(System.in);
    int choose = 0;
    
    // Method untuk membuat to-do list awal

    public void task(ArrayList<String> tasks, int a){
       for(int i = 0; i < a; i++){
           System.out.println("Task ke " + (i + 1) + " adalah : ");
           String s = S.nextLine();
           tasks.add(i, s);
       }
    }
    
    // Method untuk menambahkan tasks kedalam arraylist
    
    public void new_tasks(ArrayList<String> new_tasks){
        System.out.print("Apa task baru yang mau anda masukkan ? " + "\n: ");
        String s = S.nextLine();
        new_tasks.add(s);
    }
    
    // Method untuk menambahkan counter dan apa saja tasks yang sudah selesai
    
    public void add_done(ArrayList<String> done,ArrayList<String> in, boolean c){
        while(c){
            System.out.println("Apa task yang sudah anda lakukan ? : " +
                    "\nPilih Sesuai Nomor (0 jika tidak ada) : ");
            choose = S.nextInt();
            int a = choose - 1;
            S.nextLine();
            if(choose == 0){
                System.out.print("");
            }else {
                done.add(in.get(a));
                in.remove(a);
            }
            for (int i = 0; i < in.size(); i++) {
                System.out.println("Task ke " + (i + 1) + ". adalah = " + in.get(i));
            }
            System.out.println("Task yang ada : " + in.size());
            System.out.print("Apakah anda sudah menyelesaikan task lain ? : " + "\nY / N : ");
            String ran = S.next();
            if(ran.equalsIgnoreCase("n")){
                c = false;
            }
        }
    }
}

