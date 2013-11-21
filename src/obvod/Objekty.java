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
public class Objekty {
    
    Scanner sc = new Scanner(System.in, "Windows-1250");
    String strana_a  ;
    int strana_a_promena;
    String strana_b  ;
    int strana_b_promena;
    String strana_c  ;
    int strana_c_promena;
    int vysledek;
    
    public void  ctverec(){
    
        System.out.println("Zadejte stranu a . ");
        strana_a = sc.nextLine();
        strana_a_promena = Integer.parseInt(strana_a);
        vysledek = 4 * strana_a_promena;
        System.out.println("Obvod čtverce je " + vysledek + "\n");
        
    }
    
    public void  obdelnik(){
        
        System.out.println("Zadejte stranu a . ");
        strana_a = sc.nextLine();
        System.out.println("Zadejte stranu b . ");
        strana_b = sc.nextLine();
        strana_a_promena = Integer.parseInt(strana_a);
        strana_b_promena = Integer.parseInt(strana_b);
        vysledek = 2 * (strana_a_promena + strana_b_promena);
        System.out.println("Obvod čtverce je " + vysledek + "\n");
        
    }
    
    public void  trojuhelnik(){
        
        System.out.println("Zadejte stranu a . ");
        strana_a = sc.nextLine();
        System.out.println("Zadejte stranu b . ");
        strana_b = sc.nextLine();
        System.out.println("Zadejte stranu c . ");
        strana_c = sc.nextLine();
        strana_a_promena = Integer.parseInt(strana_a);
        strana_b_promena = Integer.parseInt(strana_b);
        strana_c_promena = Integer.parseInt(strana_b);
        vysledek = strana_a_promena + strana_b_promena + strana_c_promena ;
        System.out.println("Obvod trojúhelníku je " + vysledek + "\n");
        
    }
    
    public void  ukonceni(){
        
        System.out.println("Ukončení aplikace .\n");
      
    }
    
}
