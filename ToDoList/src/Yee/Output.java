package Yee;

import java.util.ArrayList;

public class Output {

    public void done(ArrayList<String> done, ArrayList<String> Ndone) {
        if (done.size() == 0) {
            System.out.println("Belum ada task yang selesai");
        }else{
            for (int i = 0; i < done.size(); i++) {
                System.out.println((i + 1) + ". " + done.get(i));
            }
        }
        if(Ndone.size() == 0){
            System.out.println("Task yang sudah diselesaikan ada : " + done.size());
            System.out.println("Task selesai semua ");
        }else {
            System.out.println("Task yang sudah diselesaikan ada : " + done.size());
        }
    }

    public void Ndone(ArrayList<String> Ndone) {
        if(Ndone.size() == 0){
            System.out.println("Semua task sudah selesai");
        }else{
            for (int i = 0; i < Ndone.size(); i++) {
                System.out.println("Task ke " + (i + 1) + ". adalah = " + Ndone.get(i));
            }
            System.out.println("Task yang ada : " + Ndone.size());
        }
    }
}


