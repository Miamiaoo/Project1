package TicTacToe;

import java.util.Scanner;

////define the human player
public class Human extends Player{
    public Scanner input = new Scanner(System.in);
    
    public Human(int player){
        super(player);
        this.player = player;
        System.out.println("Here is the human player");
    }
    
    @Override
    public void play(Board board){
        Try(board);
        board.setPosition(attempt, player);
    }
    
    @Override
    public void Try(Board board){
        do{
            do{
                System.out.print("Please input the line: ");
                attempt[0] = input.nextInt();
                
                //corner case of the input of line
                if( attempt[0] > 3 ||attempt[0] < 1)
                    System.out.println("Oops! Invalid line. You could only input 1, 2 or 3");
                
            }while( attempt[0] > 3 ||attempt[0] < 1);
            
            do{
                System.out.print("Please input the column: ");
                attempt[1] = input.nextInt();               

                //corner case of the input of column
                if(attempt[1] > 3 ||attempt[1] < 1)
                    System.out.println("Oops! Invalid column. You could only input 1, 2 or 3");
                
            }while(attempt[1] > 3 ||attempt[1] < 1);
            
            attempt[0]--; 
            attempt[1]--;
            
            if(!checkTry(attempt, board))
                System.out.println("It is not empty. Please try other one.");
        }while( !checkTry(attempt, board) );
    }
}
