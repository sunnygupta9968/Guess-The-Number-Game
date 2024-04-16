import java.awt.*;

import java.util.Scanner;
public class Main {
    
    pu
    
    
    
    
    
    
    
    public static void gameStart(){
        System.out.println("-----------WELLCOME TO GUESS THE NUMBER GAME---------");
        System.out.println("Select the Difficulty Level : \n1.Easy\n2.Medium\n3.Hard");
        
    }
    public static void game(int lvl){
        int max,min=0;
        max=50+(lvl-1)*20;
        System.out.println(max);
        
    }
    public static void main(String[] args) {
        gameStart();
        Scanner sc=new Scanner(System.in);
       int lvl=sc.nextInt();
        game(lvl);
      
    }
    
}