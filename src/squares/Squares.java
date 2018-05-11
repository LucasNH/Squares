/*
Squares.java 
Created by: Lucas N-H
Created on: April 20, 2018
Last edited on: May 8, 2018
*/
package squares;
import java.util.*;
public class Squares {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> squares = new ArrayList();
        System.out.println("Squares ArrayList"+"\n*****************");
        for(int i = 0; i < 10; i++) {
            squares.add(i, i * i);
            System.out.println("Number: "+i+" Square: "+squares.get(i));
        }
    }
}
