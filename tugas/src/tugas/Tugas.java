/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email,pass;
        System.out.print("Email    :");
        email = in.nextLine();
        System.out.print("Password :");
        pass = in.nextLine();
        data user = new data (email,pass);
        user.login();
        
        
    }
    
}
