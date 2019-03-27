//4156722
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 4156722
 */
public class Main{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayBag ab = new ArrayBag();

        Random rand = new Random();

        String s = rand.nextInt() + "";

        ab.remove(s);
        ab.add("999");
        for (int i = 0; i < 10; i++) {
            s = rand.nextInt() + "";
            ab.add(s);
        }
        ab.print();
        System.out.println(ab.count("999"));
        ab.remove(s);
        ab.remove("999");
        System.out.println(ab.count("999"));
    }

}
