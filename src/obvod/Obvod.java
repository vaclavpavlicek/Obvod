/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package obvod;

import java.util.Scanner;

/**
 *
 * @author Venda
 */
public class Obvod {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String volba = "";
        Objekty objekty = new Objekty();
        
        System.out.println("Vítejte!");
        while (!volba.equals("4"))
        {        
        System.out.println("Tato aplikace slouží k výpočtu obvodu.");
        System.out.println("Chci výpočítat obvod:");
        System.out.println("1 - Čtverec");
        System.out.println("2 - Obdelník");
        System.out.println("3 - Trojúhelník");
        System.out.println("4 - Ukončit aplikaci");
        volba = sc.nextLine();
        System.out.println();
                // reakce na volbu
                switch (volba)
                {
                        case "1":       
                                        objekty.ctverec();
                                        break;
                        case "2":
                                        objekty.obdelnik();
                                        break;
                        case "3":
                                        objekty.trojuhelnik();
                                        break;
                        case "4":       
                                        objekty.ukonceni();
                                        break;
                        default:
                                        System.out.println("Ani neumíš stisnout klávesu od 1 do 4.Seš lama.\n");
                                        break;
                }
                
            }
                
        }
        
    }
    

