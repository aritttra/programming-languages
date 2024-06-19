import java.util.*;
import java.util.Random;
public class game1{
	public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       int uc,cc; //uc - user choice , cc - computer choice
       Random rd= new Random();
       int rock=0;
       int paper=1;
       int scissor=2;
       System.out.println("ROCK,PAPER,SCISSOR GAME!!!");
       System.out.println("Enter your choice 0=rock, 1=paper, 2=scissor"); //intro display

       uc=sc.nextInt(); //user input

       //User selection display

            if(uc==rock){
                System.out.println("User chooses ROCK!!");
            }  
            if(uc==paper){
                System.out.println("User chooses PAPER!!");
            }
            if(uc==scissor){
                System.out.println("User chooses SCISSORS!!");
            }


            cc= rd.nextInt(3); //computer input

            //Computer selection display

            if(cc==rock){
                System.out.println("Computer chooses ROCK!!");
            }
            if(cc==paper){
                System.out.println("Computer chooses PAPER!!");
            }
            if(cc==scissor){
                System.out.println("Computer chooses SCISSORS!!");
            }

            //Draw Case
                    while(uc==cc){
                          System.out.println("It's a draw!! Try Again");
                          uc = sc.nextInt();
                          while (uc > 2) {
                            System.out.println("Give number between 0 and 2");
                            uc = sc.nextInt();
                            }
                          cc= rd.nextInt(3);
                          if (uc == rock)
                            {
                                System.out.println("User chose ROCK");
                            }
                          else
                          {
                            if(uc== paper)
                            {
                                System.out.println("User chose PAPER");
                            }
                            else
                            {
                                System.out.println("User chose SCISSORS");
                            }
			              }      
                          if(cc == rock)
                            {
                                System.out.println("Computer chose ROCK");
                            }
                          else
                            {
                                if(cc == paper)
                                {
                                    System.out.println("Computer chose PAPER");
                                }
                                else
                                {
                                    System.out.println("Computer chose SCISSORS");
                                }
                            }
                        }

                        //Result of the Game 

                        if(cc==rock){
                            if(uc==paper){
                                System.out.println("User wins");
                            }
                            else{
                                 System.out.println("Computer wins");
                            }
                        }
                        if(cc==paper){
                            if(uc==scissor){
                                System.out.println("User wins");
                            }
                            else{
                                 System.out.println("Computer wins");
                            }
                        }
                        if(cc==scissor){
                            if(uc==rock){
                                System.out.println("User wins");
                            }
                            else{
                                 System.out.println("Computer wins");
                            }
                        }
                        sc.close();
       }
	}
