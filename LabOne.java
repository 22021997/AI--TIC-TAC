
package tictac;
import java.util.Scanner;

public class LabOne 
{       //static Board b = new Board();

    public static void main(String args[])
    {
        Board b = new Board();
        System.out.println( "Welcome to my TicTac Toe");
        System.out.println("Select the Mode");
        System.out.println("Press 1)  1player Vs 2player  ");
        System.out.println("Press 2) VS Easy Computer");
        System.out.println("Press 3) To watch a game");
        System.out.println("Press 4) VS PRo Computer");
        //System.out.println("Write the coordinates to play-Eg= 0 1");
        
        Scanner in = new Scanner(System.in);
        
        int choice = in.nextInt();
        
        if(choice==1)
            
        {  
            System.out.println("Write the coordinates to play-Eg= 0 1");
            while (true){
            
            System.out.println("player one your move");
            int c1=in.nextInt();
            int c2=in.nextInt();
            char c3 ='O';
           // if(c1>=3 || c1 < 0 || c2 >=3 || c2 < 0 || c2 >= 3 )
            //{
                //System.out.println("Wrong Input");
              //  c1=in.nextInt();
                //c2=in.nextInt();
            //}
            b.Input(c1, c2, c3);

            System.out.println("player two your move");
            int d1=in.nextInt();
            int d2=in.nextInt();
            char d3 ='X';
            
            b.Input(d1, d2, d3);
       
        }
    }
        
        else if(choice==2)
    {   while(true)
    {
       System.out.println("player one your move");
       int c1=in.nextInt();
       int c2=in.nextInt();
       char c3 ='O';
       b.Input(c1, c2, c3);
       System.out.println("Computer's move");
       b.Game2();
       
       
       
       
       
    }
    }
    
    else if(choice==3)
    {
        b.AI();
    }
    else
    {
    b.AI1();
    }
        
        
}
}


