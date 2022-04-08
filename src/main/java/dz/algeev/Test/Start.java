package dz.algeev.Test;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        while(true){
            str = sc.next();
            if(str.equals("exit")) break;
            System.out.println(Obr.doSomething(str));
        }
        System.out.println("end of session");
    }

}
