/*4156722
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 4156722
 */
public class ArrayBag implements Bag {

    private int size;
    private String[] s;
    private int count;
    private boolean found = false;

    public ArrayBag() {
        size = 10;
        this.s = new String[size];
        count = 0;
    }

    public ArrayBag(int s) {
        size = s;
        this.s = new String[size];
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println("");
    }

    public void add(String s) {
        if (count != size) {
            this.s[count] = s;
            count++;
        } else {
            System.out.println("THE BAG IS FULL. Could not add " + s);
        }
    }

    public void remove(String s) {
        int j = 0;
        //found = false;
        if (!isEmpty()) {
            for (int i = 0; i < count; i++) {
                if (this.s[i].equals(s)) {
                    this.s[i] = "";
                    //found = true;
                    count--;
                }
            }

        } else {
            System.out.println("THE BAG IS EMPTY.");
        }
    }

    public int count(String s) {
        int j = 0;
        for (int i = 0; i < count; i++) {
            if (this.s[i].equals(s)) {
                j++;
            }
        }
        return j;
    }

}
