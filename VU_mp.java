/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vu_mp;

/**
 *
 * @author Shakur
 */
import java.util.Scanner;
public class VU_mp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);   
     
     System.out.println("Enter the room numner" );
     int roomNo=s.nextInt();
     
     System.out.println("Enter the status" );
     String status=s.nextLine();
     
     
     System.out.println("Enter the session" );
     String session=s.nextLine();
     
     
     rooms R= new rooms(roomNo, status, session);
     R.isEmpty();
    }
    
}
