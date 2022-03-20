/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statementslabel;

/**
 *
 * @author kiptim
 */
public class Statementslabel {

    public static void main(String[] args) {
        //unlabelled break statement
        for (int x = 0; x < 10; x++) {
            System.out.println(x);
            if (x == 7) {
                System.out.println("Found 7");
                break;
            }
        }

        //labelled break statement
        outerbreak:
        for (int x = 0; x < 10; x++) {
            System.out.println(x);

            for (int z = 0; z < 5; z++) {
                System.out.println(z + "inner loop");
                if (z == 3) {
                    System.out.println("Found 3");
                    break outerbreak;
                }
            }

        }
    }

}
