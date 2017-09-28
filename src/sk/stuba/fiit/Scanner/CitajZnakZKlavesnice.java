package sk.stuba.fiit.Scanner;


import java.util.Scanner;

public class CitajZnakZKlavesnice {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
                while (!sc.hasNext("z")){
                char ch = sc.next().charAt(0);
                System.out.print("[" + ch + "]");
        }
    }
}