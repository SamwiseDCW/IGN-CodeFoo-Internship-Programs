import java.util.*; import java.lang.*; import java.math.*;
public class Scrabble
{
    public static void main(String [] args)
    {
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final int N = alphabet.length();
        Random r = new Random();
        
        for (int i =0; i< 50; i++)  {
            System.out.print(alphabet.charAt(r.nextInt(N)));
        }
        
       String = "A,E,I,O,U,L,N,S,T,R" = 1;
        
        "D,G" = 2;
        
        "B,C,M,P" = 3;
        
        "F,H,V,W,Y" = 4;
        
        "K" = 5;
        
        "J,X" = 8;
        
        "Q,Z" = 10;
        
    }
}