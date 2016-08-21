
package tictac;

import java.util.Random;
public class Board 
{
static char [][]arr = new char[3][3];
	public Board()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]= '-' ;
			}
			//System.out.println();
		}
                Print();
	}
         int count =0;
        int flag=0;
  public void Print()
  {
      for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
  }
   public void Print1()
  {
      System.out.println("AI's Turn");
      for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
  }
  /*public int C(int c1,int c2,char a)
  {
      if(c1>=3 || c1 < 0 || c2 >=3 || c2 < 0 || c2 >= 3 )
            {   java.util.Scanner temp =new java.util.Scanner(System.in);
                System.out.println("Wrong Input");
                c1=temp.nextInt();
                c2=temp.nextInt();
            }
      
      
  }*/
  public void Input(int c1,int c2,char a)
  {         
      int t=1;
        while(t==1)
        {
          if(c1>=3 || c1 < 0 || c2 >=3 || c2 < 0 || c2 >= 3 || arr[c1][c2]!='-' )
            {   java.util.Scanner temp =new java.util.Scanner(System.in);
                //System.out.println("Wrong Input");
                System.out.println("Invalid Input.Please try again");
                c1=temp.nextInt();
                c2=temp.nextInt();
            }
          else 
          {
              t=0;
          }
        }
          
      {
      
          //C(c1,c2,a);
           
          arr[c1][c2]=a;
      
      

      
     Print()  ;  
     checkstate();
    }
      
  }
  
  public void Input1(int x , int y,char a )
  {
      arr[x][y]=a;
      Print();
      checkstate();
  }
   public void Input3(int c1,int c2,char a)
  {         
      int t=1;
        while(t==1)
        {
          if(c1>=3 || c1 < 0 || c2 >=3 || c2 < 0 || c2 >= 3 || arr[c1][c2]!='-' )
            {   java.util.Scanner temp =new java.util.Scanner(System.in);
                //System.out.println("Wrong Input");
                System.out.println("Invalid Input.Please try again");
                c1=temp.nextInt();
                c2=temp.nextInt();
            }
          else 
          {
              t=0;
          }
        }
          
      {
      
          //C(c1,c2,a);
           
          arr[c1][c2]=a;
      
      

      
     Print()  ;  
     checkstate();
    }
      
  }
  
public void  checkstate()
  {
      //Horizontal check
      flag=0;
      
      if(arr[0][0]==arr[0][1]&& arr[0][1]==arr[0][2] && arr[0][0]!='-')
      {
          System.out.println("The winner is " + arr[0][0]);
          System.exit(0);
          
      } 
      else if(arr[1][0]==arr[1][1]&& arr[1][1]==arr[1][2] && arr[1][0]!='-')
      {
          System.out.println("The winner is " + arr[1][0]);
          System.exit(0);
          //return arr[1][0];
      }
      else if(arr[2][0]==arr[2][1]&& arr[2][1]==arr[2][2] && arr[2][0]!='-')
      {
          System.out.println("The winner is " + arr[2][0]);
          System.exit(0);
          //return arr[2][0];
      }
       //-------------------------------------
      
      //Vertical check
      else if(arr[0][0]==arr[1][0]&& arr[1][0]==arr[2][0] && arr[0][0]!='-')
      {
          System.out.println("The winner is " + arr[0][0]);
          System.exit(0);
          //return arr[0][0];
      }
      
       else if(arr[0][1]==arr[1][1]&& arr[1][1]==arr[2][1] && arr[0][1]!='-')
      {
          System.out.println("The winner is " + arr[0][1]);
          System.exit(0);
          //return arr[0][1];
      }
      
      else if(arr[0][2]==arr[1][2]&& arr[1][2]==arr[2][2] && arr[0][2]!='-')
      {
          System.out.println("The winner is " + arr[0][2]);
          System.exit(0);
          //return arr[0][2];
      }
      
      //------------------------------------------
      
      //diagonal check
      
       else if(arr[0][0]==arr[1][1]&& arr[1][1]==arr[2][2] && arr[0][0]!='-')
      {
          System.out.println("The winner is " + arr[0][0]);
          System.exit(0);
          //return arr[0][0];
      }
       else if(arr[0][2]==arr[1][1]&& arr[1][1]==arr[2][0] && arr[0][2]!='-')
      {
          System.out.println("The winner is " + arr[0][2]);
          System.exit(0);
          //return arr[0][2];
      }
      
      for(int i =0;i<3;i++)
      {
          for(int j=0;j<3;j++)
          {
              if(arr[i][j]=='-')
              {
                  flag=1;
              }
          }
      }
      if(flag==0)
      {
          System.out.println("It is a tie");
          System.exit(0);
          
      }
      
      //return 0;
  }

public void Game2()
{    
    Random rn = new Random();
    int r1=0 ,r2=0;
    int t=1;
    //char ab='X';
    while(t==1)
    {
    r1= rn.nextInt(3);
    r2 = rn.nextInt(3);
    if(arr[r1][r2]=='-')
    {   arr[r1][r2]='X';
        t=0;
        
    }
    
    
    }
   // System.out.println(r1 + " "+ r2 );
    Input(r1,r2,'X');
    
    
}

public void Game1()
{   System.out.println("Computer's move");
    Random rn = new Random();
    int r1=0 ,r2=0;
    int t=1;
    //char ab='X';
    while(t==1)
    {
    r1= rn.nextInt(3);
    r2 = rn.nextInt(3);
    if(arr[r1][r2]=='-')
    {   arr[r1][r2]='O';
        t=0;
        
    }
    
    
    }
    
   // System.out.println(r1 + " "+ r2 );
    Input1(r1,r2,'O');
    //System.out.println("AI's Turn now");
    
    
}

public void AI()
{   Game1();
    if(arr[0][0]=='O' || arr[2][0]=='O' || arr[0][2] =='O' || arr[2][2]=='O' || arr[0][1]=='O' || arr[1][2]=='O' || arr[2][1]=='O' || arr[1][0]=='O')
    {
        arr[1][1]='X';
        Print1();
        Game1();
        //adjacent---
        if(arr[0][0]=='O' && arr[0][1]=='O')
        {
            arr[0][2]='X';
            Print1();
            Game1();
            if(arr[2][0]!='O')
            {
                arr[2][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][1]='X';
                Print1();
                Game1();
                if(arr[1][2]!='O')
                {
                    arr[1][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {   Print1();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
             
        }
        //adjacent=---------
        else if(arr[0][0]=='O' && arr[1][0]=='O')
        {
            arr[2][0]='X';
            Print1();
            Game1();
            if(arr[0][2]!='O')
            {   arr[0][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][1]='X';
                Print1();
                Game1();
                if(arr[2][1]!='O')
                {
                    arr[2][1]='X';
                    Print1();
                    System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   Print1();
                    System.out.println("Its a Draw");
                System.exit(0);
                }
            }
            
        }
        //Corner -----------
        else if(arr[0][0]=='O' && arr[0][2]=='O')
        {
            arr[0][1]='X';
            Print1();
            Game1();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                
            }
            else
            {
                arr[1][2]='X';
                Print1();
                Game1();
                if(arr[1][0]!='O')
                {
                    arr[1][0]='X';
                    Print1();
                     System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   
                   arr[2][2]='X';
                   Print1();
                   Game1();
                 System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //corner -----------
        else if(arr[0][0]=='O' && arr[2][0]=='O')
        {
            arr[1][0]='X';
            Print1();
            Game1();
            if(arr[1][2]!='O')
            {
                arr[1][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[0][1]='X';
                     Print1();
                     Game1();
                     if(arr[2][1]!='O')
                     {
                         arr[2][1]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         arr[0][2]='X';
                         Print1();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
            
        }
        //corner----------
        else if(arr[0][0]=='O' && arr[2][2]=='O')
        {
            arr[0][1]='X';
            Print1();
            Game1();
            if(arr[2][1]!='O' )
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][0]='X';
                Print1();
                Game2();
                if(arr[0][2]!='O')
                {
                    arr[0][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[1][2]='X';
                    Print1();
                    Game1();
                    System.out.println("Its a draw");
                System.exit(0);
                }
               
            }
            
            
            
        }
        
        //farther=----
        else if(arr[0][0]=='O' && arr[2][1]=='O')
        {
            arr[1][2]='X';
            Print1();
            Game1();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                
            }
            else
            {
                arr[2][0]='X';
                Print1();
                Game1();
                if(arr[0][2]!='O')
                {
                    arr[0][2]='X';
                  Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                  else
                {
                    arr[0][1]='X';
                    Print1();
                    Game1();
                       
                System.out.println("ITs a Draw");
                System.exit(0);
                }
            
        }
        
        }
        //Farther-----
        else if(arr[0][0]=='O' && arr[1][2]=='O')
        {
            arr[2][1]='X';
            Print1();
            Game1();
            if(arr[0][1]!='O')
            {
                arr[0][1]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                Game1();
                if(arr[2][0]!='O')
                {   arr[2][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[2][2]='X';
                    Print1();
                    Game1();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[2][0]=='O' && arr[1][0]=='O')
        {
             arr[0][0]='X';
            Print1();
            Game1();
            if(arr[2][2]!='O')
            {
                arr[2][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][1]='X';
                Print1();
                Game1();
                if(arr[0][1]!='O')
                {
                    arr[0][1]='X';
                    Print1();
                    
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                    
                {   arr[2][2]='X';
                    Print1();
                    Game2();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        //adjacent
        
        else if(arr[2][0]=='O' && arr[2][1]=='O')
        {
             arr[2][2]='X';
            Print1();
            Game1();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[1][0]='X';
                Print1();
                Game1();
                if(arr[1][2]!='O')
                {
                    arr[1][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {   //arr[0][2]='X';
                
                    Print1();
                    Game2();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        //corner
        else if(arr[2][0]=='O' && arr[2][2]=='O')
        {
            arr[2][1]='X';
            Print1();
            Game1();
            if(arr[0][1]!='O')
            {
                arr[0][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[1][2]='X';
                     Print1();
                     Game1();
                     if(arr[1][0]!='O')
                     {
                         arr[1][0]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         arr[0][0]='X';
                         Print1();
                         Game1();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
        }
        //corner
        else if(arr[2][0]=='O' && arr[0][2]=='O')
        {
            arr[0][1]='X';
            Print1();
            Game1();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[2][2]='X';
                     Print1();
                     Game1();
                     if(arr[0][0]!='O')
                     {
                         arr[0][0]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         if(arr[1][0]=='-')
                         {
                             arr[1][0]='X';
                             System.out.println("Its a draw");
                         }
                         Print1();
                         Game1();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
        }
        //farther
        else if(arr[2][0]=='O' && arr[0][1]=='O')
        {
            arr[2][2]='X';
            Print1();
            Game1();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                Game1();
                if(arr[1][2]!='O')
                {   arr[1][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[1][0]='X';
                    Print1();
                    Game1();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[2][0]=='O' && arr[1][2]=='O')
        {
            arr[0][0]='X';
            Print1();
            Game1();
            if(arr[2][2]!='O')
            {
                arr[2][2]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                Game1();
                if(arr[0][1]!='O')
                {   arr[0][1]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[0][1]='X';
                    Print1();
                    Game1();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent 
        else if(arr[0][2]=='O' && arr[1][2]=='O')
        {
            arr[2][2]='X';
            Print1();
            Game1();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][1]='X';
                Print1();
                Game1();
                if(arr[2][1]!='O')
                {
                    arr[2][1]='X';
                    Print1();
                    
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                    
                {   //arr[2][2]='X';
                    Print1();
                    //Game2();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[0][2]=='O' && arr[0][1]=='O')
        {
            arr[0][0]='X';
            Print1();
            Game1();
            if(arr[2][2]!='O')
            {
                arr[2][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[1][2]='X';
                Print1();
                Game1();
                if(arr[1][0]!='O')
                {
                    arr[1][0]='X';
                    Print1();
                    
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                    
                {   //arr[2][2]='X';
                    Print1();
                    //Game2();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        
        //corner
        else if(arr[0][2]=='O' && arr[2][2]=='O')
        {
            arr[1][2]='X';
            Print1();
            Game1();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[0][1]='X';
                     Print1();
                     Game1();
                     if(arr[2][1]!='O')
                     {
                         arr[0][0]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         //if(arr[1][0]=='-')
                         //{
                            // arr[1][0]='X';
                           //  System.out.println("Its a draw");
                         //}
                         Print1();
                         Game1();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
        }
        //farther
        else if(arr[0][2]=='O' && arr[1][0]=='O')
        {
            arr[2][1]='X';
            Print1();
            Game1();
            if(arr[0][1]!='O')
            {
                arr[0][1]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][0]='X';
                Print1();
                Game1();
                if(arr[2][2]!='O')
                {   arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[2][2]='X';
                    Print1();
                    //Game1();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[0][2]=='O' && arr[2][1]=='O')
        {
            arr[1][0]='X';
            Print1();
            Game1();
            if(arr[1][2]!='O')
            {
                arr[1][2]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][2]='X';
                Print1();
                Game1();
                if(arr[0][0]!='O')
                {   arr[0][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[2][2]='X';
                    Print1();
                   // Game1();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[2][2]=='O' && arr[1][2]=='O')
        {
            arr[0][2]='X';
            Print1();
            Game1();
            if(arr[2][0]!='O')
            {   arr[2][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][1]='X';
                Print1();
                Game1();
                if(arr[0][1]!='O')
                {
                    arr[0][1]='X';
                    Print1();
                    System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   Print1();
                    System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[2][2]=='O' && arr[2][1]=='O')
        {
        
            arr[2][0]='X';
            Print1();
            Game1();
            if(arr[0][2]!='O')
            {   arr[0][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[1][2]='X';
                Print1();
                Game1();
                if(arr[1][0]!='O')
                {
                    arr[1][0]='X';
                    Print1();
                    System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   Print1();
                    System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[2][2]=='O' && arr[0][1]=='O')
        {
            arr[1][2]='X';
            Print1();
            Game1();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][0]='X';
                Print1();
                Game1();
                if(arr[0][2]!='O')
                {   arr[0][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[0][1]='X';
                    Print1();
                    //Game1();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[2][2]=='O' && arr[1][0]=='O')
        {
            arr[0][2]='X';
            Print1();
            Game1();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][0]='X';
                Print1();
                Game1();
                if(arr[0][2]!='O')
                {   arr[0][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[0][1]='X';
                    Print1();
                    //Game1();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        
       if(arr[0][1]=='O' && arr[1][0] == 'O')
      {
          arr[0][0]='X';
          Print1();
          Game1();
          if(arr[2][2]!='O')
          {
            arr[2][2]='X';
            Print1();
            System.out.println("THE AI wins");
            System.exit(0);
          }
          else
          {
              arr[2][0]='X';
              Print1();
              Game1();
              if(arr[0][2]!='O')
              {
                  arr[0][2]='X';
             Print1();
            System.out.println("THE AI wins");
            System.exit(0);
                  
              }
              else 
              {
                  
                  
                  Print1();
            System.out.println("Its a Draw");
            System.exit(0);
              }
          }
      }
      
      else if(arr[0][1]=='O' && arr[1][2]=='O')
      {
         arr[0][2]='X';
            Print1();
            Game1();
            if(arr[2][0]!='O')
            {
                arr[2][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][0]='X';
                Print1();
                Game1();
                if(arr[2][2]!='O')
                {
                    arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[2][1]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      else if(arr[1][2]=='O' && arr[2][1]=='O')
      {
          arr[2][2]='X';
            Print1();
            Game1();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                Game1();
                if(arr[2][0]!='O')
                {
                    arr[2][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[1][0]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      else if(arr[2][1]=='O' && arr[1][0]=='O')
      {
          arr[2][0]='X';
            Print1();
            Game1();
            if(arr[0][2]!='O')
            {
                arr[0][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][0]='X';
                Print1();
                Game1();
                if(arr[2][2]!='O')
                {
                    arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[2][1]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      
      else if(arr[0][1]== 'O' && arr[2][1]=='O')
      {
          arr[1][2]='X';
            Print1();
            Game1();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                Game1();
                if(arr[2][2]!='O')
                {
                    arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[0][0]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      else if(arr[1][0] =='O' && arr[1][2]=='O')
      {
          arr[0][1]='X';
            Print1();
            Game1();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][2]='X';
                Print1();
                Game1();
                if(arr[0][0]!='O')
                {
                    arr[0][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[2][0]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
        
    }
    else 
    {
        arr[0][0]='X';
        Game1();
        Oit();
        Xit();
        Game1();
        Oit();
        Xit();
        Game1();
    }    
}

public void Xit()
{
    for(int i=0;i<3;i++)
    {
        if(arr[i][0]==arr[i][1] && arr[i][0]=='X' && arr[i][2]=='-' )
        {
            arr[i][2]='X';
        }
        else if(arr[i][1]==arr[i][2] && arr[i][1]=='X' && arr[i][0]=='-')
        {
            arr[i][0]='X';
        }
        else if(arr[i][0]==arr[i][2] && arr[i][0]=='X' && arr[i][1]=='-' )
        {
            arr[i][1]='X';
        }
        
        
        
            
        
    }
    for(int i=0;i<3;i++)
    {
        if(arr[0][i]==arr[1][i] && arr[0][i]=='X' && arr[2][i]=='-' )
        {
            arr[2][i]='X';
        }
        else if(arr[1][i]==arr[2][i] && arr[1][i]=='X' && arr[0][i]=='-')
        {
            arr[0][i]='X';
        }
        else if(arr[0][i]==arr[2][i] && arr[0][i]=='X' && arr[1][i]=='-' )
        {
            arr[1][i]='X';
        }
        
            
        
    }
}

public void Oit()
{
    if(arr[0][1]=='O' && arr[1][1]=='O' && arr[2][1]=='-')
    {
        arr[2][1]='X';
        checkstate();
    }
    else if(arr[2][1]=='O' && arr[1][1]=='O' && arr[0][1]=='-')
    {
        arr[0][1]='X';
        checkstate();
    }
    else if(arr[1][1]=='O' && arr[1][0]=='O' && arr[1][2]=='-')
    {
        arr[1][2]='X';
        checkstate();
    }
    else if(arr[1][1]=='O' && arr[1][2]=='O' && arr[1][0]=='-')
    {
        
        arr[1][0]='X';
        checkstate();
    }
    else if(arr[0][2]=='O' && arr[1][1]=='O' && arr[2][0]=='-')
    {
        arr[2][0]='X';
        checkstate();
    }
    else if(arr[2][0]=='O'&& arr[1][1]=='O' && arr[0][2]=='-')
    {
        arr[0][2]='X';
        checkstate();
        
    }
    
}


public void User()
{   System.out.println("User your turn");
    java.util.Scanner p= new java.util.Scanner(System.in);
    int U1=0,U2=0;
    U1=p.nextInt();
    U2=p.nextInt();
    Input3(U1,U2,'O');
}



public void AI1()

{   User();
    if(arr[0][0]=='O' || arr[2][0]=='O' || arr[0][2] =='O' || arr[2][2]=='O' || arr[0][1]=='O' || arr[1][2]=='O' || arr[2][1]=='O' || arr[1][0]=='O')
    {
        arr[1][1]='X';
        Print1();
        User();
        //adjacent---
        if(arr[0][0]=='O' && arr[0][1]=='O')
        {
            arr[0][2]='X';
            Print1();
            User();
            if(arr[2][0]!='O')
            {
                arr[2][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][1]='X';
                Print1();
                User();
                if(arr[1][2]!='O')
                {
                    arr[1][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {   Print1();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
             
        }
        //adjacent=---------
        else if(arr[0][0]=='O' && arr[1][0]=='O')
        {
            arr[2][0]='X';
            Print1();
            User();
            if(arr[0][2]!='O')
            {   arr[0][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][1]='X';
                Print1();
                User();
                if(arr[2][1]!='O')
                {
                    arr[2][1]='X';
                    Print1();
                    System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   Print1();
                    System.out.println("Its a Draw");
                System.exit(0);
                }
            }
            
        }
        //Corner -----------
        else if(arr[0][0]=='O' && arr[0][2]=='O')
        {
            arr[0][1]='X';
            Print1();
            User();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                
            }
            else
            {
                arr[1][2]='X';
                Print1();
                User();
                if(arr[1][0]!='O')
                {
                    arr[1][0]='X';
                    Print1();
                     System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   
                   arr[2][2]='X';
                   Print1();
                   User();
                 System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //corner -----------
        else if(arr[0][0]=='O' && arr[2][0]=='O')
        {
            arr[1][0]='X';
            Print1();
            User();
            if(arr[1][2]!='O')
            {
                arr[1][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[0][1]='X';
                     Print1();
                     User();
                     if(arr[2][1]!='O')
                     {
                         arr[2][1]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         arr[0][2]='X';
                         Print1();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
            
        }
        //corner----------
        else if(arr[0][0]=='O' && arr[2][2]=='O')
        {
            arr[0][1]='X';
            Print1();
            User();
            if(arr[2][1]!='O' )
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][0]='X';
                Print1();
                User();
                if(arr[0][2]!='O')
                {
                    arr[0][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[1][2]='X';
                    Print1();
                    User();
                    System.out.println("Its a draw");
                System.exit(0);
                }
               
            }
            
            
            
        }
        
        //farther=----
        else if(arr[0][0]=='O' && arr[2][1]=='O')
        {
            arr[1][2]='X';
            Print1();
            User();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                
            }
            else
            {
                arr[2][0]='X';
                Print1();
                User();
                if(arr[0][2]!='O')
                {
                    arr[0][2]='X';
                  Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                  else
                {
                    arr[0][1]='X';
                    Print1();
                    User();
                       
                System.out.println("ITs a Draw");
                System.exit(0);
                }
            
        }
        
        }
        //Farther-----
        else if(arr[0][0]=='O' && arr[1][2]=='O')
        {
            arr[2][1]='X';
            Print1();
            User();
            if(arr[0][1]!='O')
            {
                arr[0][1]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                User();
                if(arr[2][0]!='O')
                {   arr[2][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[2][2]='X';
                    Print1();
                    User();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[2][0]=='O' && arr[1][0]=='O')
        {
             arr[0][0]='X';
            Print1();
            User();
            if(arr[2][2]!='O')
            {
                arr[2][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][1]='X';
                Print1();
                User();
                if(arr[0][1]!='O')
                {
                    arr[0][1]='X';
                    Print1();
                    
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                    
                {   arr[2][2]='X';
                    Print1();
                    User();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        //adjacent
        
        else if(arr[2][0]=='O' && arr[2][1]=='O')
        {
             arr[2][2]='X';
            Print1();
            User();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[1][0]='X';
                Print1();
                User();
                if(arr[1][2]!='O')
                {
                    arr[1][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {   //arr[0][2]='X';
                
                    Print1();
                    User();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        //corner
        else if(arr[2][0]=='O' && arr[2][2]=='O')
        {
            arr[2][1]='X';
            Print1();
            User();
            if(arr[0][1]!='O')
            {
                arr[0][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[1][2]='X';
                     Print1();
                     User();
                     if(arr[1][0]!='O')
                     {
                         arr[1][0]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         arr[0][0]='X';
                         Print1();
                         User();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
        }
        //corner
        else if(arr[2][0]=='O' && arr[0][2]=='O')
        {
            arr[0][1]='X';
            Print1();
            User();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[2][2]='X';
                     Print1();
                     User();
                     if(arr[0][0]!='O')
                     {
                         arr[0][0]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         if(arr[1][0]=='-')
                         {
                             arr[1][0]='X';
                             System.out.println("Its a draw");
                         }
                         Print1();
                         User();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
        }
        //farther
        else if(arr[2][0]=='O' && arr[0][1]=='O')
        {
            arr[2][2]='X';
            Print1();
            User();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                User();
                if(arr[1][2]!='O')
                {   arr[1][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[1][0]='X';
                    Print1();
                    User();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[2][0]=='O' && arr[1][2]=='O')
        {
            arr[0][0]='X';
            Print1();
            User();
            if(arr[2][2]!='O')
            {
                arr[2][2]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                User();
                if(arr[0][1]!='O')
                {   arr[0][1]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    arr[0][1]='X';
                    Print1();
                    User();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent 
        else if(arr[0][2]=='O' && arr[1][2]=='O')
        {
            arr[2][2]='X';
            Print1();
            User();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][1]='X';
                Print1();
                User();
                if(arr[2][1]!='O')
                {
                    arr[2][1]='X';
                    Print1();
                    
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                    
                {   //arr[2][2]='X';
                    Print1();
                    //User();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[0][2]=='O' && arr[0][1]=='O')
        {
            arr[0][0]='X';
            Print1();
            User();
            if(arr[2][2]!='O')
            {
                arr[2][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[1][2]='X';
                Print1();
                User();
                if(arr[1][0]!='O')
                {
                    arr[1][0]='X';
                    Print1();
                    
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                    
                {   //arr[2][2]='X';
                    Print1();
                    //User();
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
            }
        }
        
        //corner
        else if(arr[0][2]=='O' && arr[2][2]=='O')
        {
            arr[1][2]='X';
            Print1();
            User();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else 
                 {
                     arr[0][1]='X';
                     Print1();
                     User();
                     if(arr[2][1]!='O')
                     {
                         arr[0][0]='X';
                         Print1();
                     System.out.println("THE AI wins");
                     System.exit(0);
                                 
                     }
                     else
                     {
                         //if(arr[1][0]=='-')
                         //{
                            // arr[1][0]='X';
                           //  System.out.println("Its a draw");
                         //}
                         Print1();
                         User();
                         System.out.println("Its a draw");
                          System.exit(0);
                     }
                  }
        }
        //farther
        else if(arr[0][2]=='O' && arr[1][0]=='O')
        {
            arr[2][1]='X';
            Print1();
            User();
            if(arr[0][1]!='O')
            {
                arr[0][1]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][0]='X';
                Print1();
                User();
                if(arr[2][2]!='O')
                {   arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[2][2]='X';
                    Print1();
                    //User();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[0][2]=='O' && arr[2][1]=='O')
        {
            arr[1][0]='X';
            Print1();
            User();
            if(arr[1][2]!='O')
            {
                arr[1][2]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][2]='X';
                Print1();
                User();
                if(arr[0][0]!='O')
                {   arr[0][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[2][2]='X';
                    Print1();
                   // User();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[2][2]=='O' && arr[1][2]=='O')
        {
            arr[0][2]='X';
            Print1();
            User();
            if(arr[2][0]!='O')
            {   arr[2][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][1]='X';
                Print1();
                User();
                if(arr[0][1]!='O')
                {
                    arr[0][1]='X';
                    Print1();
                    System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   Print1();
                    System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //adjacent
        else if(arr[2][2]=='O' && arr[2][1]=='O')
        {
        
            arr[2][0]='X';
            Print1();
            User();
            if(arr[0][2]!='O')
            {   arr[0][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[1][2]='X';
                Print1();
                User();
                if(arr[1][0]!='O')
                {
                    arr[1][0]='X';
                    Print1();
                    System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {   Print1();
                    System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[2][2]=='O' && arr[0][1]=='O')
        {
            arr[1][2]='X';
            Print1();
            User();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][0]='X';
                Print1();
                User();
                if(arr[0][2]!='O')
                {   arr[0][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[0][1]='X';
                    Print1();
                    //User();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        //farther
        else if(arr[2][2]=='O' && arr[1][0]=='O')
        {
            arr[0][2]='X';
            Print1();
            User();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                 Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][0]='X';
                Print1();
                User();
                if(arr[0][2]!='O')
                {   arr[0][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                }
                else
                {
                    //arr[0][1]='X';
                    Print1();
                    //User();
                       
                System.out.println("Its a Draw");
                System.exit(0);
                }
            }
        }
        
       if(arr[0][1]=='O' && arr[1][0] == 'O')
      {
          arr[0][0]='X';
          Print1();
          User();
          if(arr[2][2]!='O')
          {
            arr[2][2]='X';
            Print1();
            System.out.println("THE AI wins");
            System.exit(0);
          }
          else
          {
              arr[2][0]='X';
              Print1();
              User();
              if(arr[0][2]!='O')
              {
                  arr[0][2]='X';
             Print1();
            System.out.println("THE AI wins");
            System.exit(0);
                  
              }
              else 
              {
                  
                  
                  Print1();
            System.out.println("Its a Draw");
            System.exit(0);
              }
          }
      }
      
      else if(arr[0][1]=='O' && arr[1][2]=='O')
      {
         arr[0][2]='X';
            Print1();
            User();
            if(arr[2][0]!='O')
            {
                arr[2][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][0]='X';
                Print1();
                User();
                if(arr[2][2]!='O')
                {
                    arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[2][1]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      else if(arr[1][2]=='O' && arr[2][1]=='O')
      {
          arr[2][2]='X';
            Print1();
            User();
            if(arr[0][0]!='O')
            {
                arr[0][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                User();
                if(arr[2][0]!='O')
                {
                    arr[2][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[1][0]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      else if(arr[2][1]=='O' && arr[1][0]=='O')
      {
          arr[2][0]='X';
            Print1();
            User();
            if(arr[0][2]!='O')
            {
                arr[0][2]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][0]='X';
                Print1();
                User();
                if(arr[2][2]!='O')
                {
                    arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[2][1]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      
      else if(arr[0][1]== 'O' && arr[2][1]=='O')
      {
          arr[1][2]='X';
            Print1();
            User();
            if(arr[1][0]!='O')
            {
                arr[1][0]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[0][2]='X';
                Print1();
                User();
                if(arr[2][2]!='O')
                {
                    arr[2][2]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[0][0]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
      else if(arr[1][0] =='O' && arr[1][2]=='O')
      {
          arr[0][1]='X';
            Print1();
            User();
            if(arr[2][1]!='O')
            {
                arr[2][1]='X';
                Print1();
                System.out.println("THE AI wins");
                System.exit(0);
            }
            else
            {
                arr[2][2]='X';
                Print1();
                User();
                if(arr[0][0]!='O')
                {
                    arr[0][0]='X';
                    Print1();
                System.out.println("THE AI wins");
                System.exit(0);
                    
                }
                else
                {  
                    arr[2][0]='X';
                    Print1();
                }
                    System.out.println("Its a Tie");
                    System.exit(0);
                }
      }
        
    }
    else 
    {
        arr[0][0]='X';
        User();
        Oit();
        Xit();
        User();
        Oit();
        Xit();
        User();
    }    
}



/*public void Game1(int a1, int a2 ,int b1, int b2,char a3,char b3)
{
    Input(a1,a2,a3);
    Input(b1,b2,b3);
    char Win='*' ;
    Win=checkstate();
    if(Win!='*')
    {
        System.out.println("The winner is " + Win);
    }
    
    
}*/
  
}
  
  
  

 
