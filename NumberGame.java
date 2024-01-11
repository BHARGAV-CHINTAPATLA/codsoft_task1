import java.util.*;
public class NumberGame{
    int score = 0;
    int maxattempts = 4;
    int a = 5*maxattempts;
    static Scanner sc = new Scanner(System.in);
    public void Game(){
       Random r = new Random();
       int m = r.nextInt(100);
       if (m >= 1 && m <= 100) {
           
       }  
       else {
           System.out.println("Invalid input. Please enter a number between 0 and 99.");
       }
       for(int i=1;i<=maxattempts;i++){
           System.out.println("Attempt:"+i);
           System.out.println("Enter the Number:");
           int j = sc.nextInt();
           if (j < 1 || j > 100) {
              System.out.println("Input should be between 1 and 100. Please re-enter:");
              j = sc.nextInt();
           }   
           int difference = j-m;
           if(j==m){
               System.out.println("Your guess is correct");
               score=a-5*(i-1);
               System.out.println("Score:"+score);
               break;
           }
           else if(difference>a){
               System.out.println("Your guess is too high");
           }
           else if((difference*(-1))>a){
               System.out.println("Your guess is too low");
           }
           else{
               System.out.println("Your guess is almost near to number");
           }
       }
       if(score==0){
           System.out.println("Number:"+m);
           System.out.println("Score:"+score);
       }   
    }
    public static void playGame() {
        NumberGame k = new NumberGame();
        k.Game();
        System.out.println("Do you want to play again? If yes, enter '1'.If not enter any number:");
        int b = sc.nextInt();
        if (b == 1) {
            playGame(); 
        } else {
            System.out.println("Thank you for playing!");
        }
    }
    public static void main(String []args){
        System.out.println("INFO: You can guess a random number within 4 chances.");
        System.out.println("If your guess is correct, you will get the score as follows:");
        System.out.println("For the first correct attempt: 20.");
        System.out.println("For the second correct attempt: 15.");
        System.out.println("For the third correct attempt: 10.");
        System.out.println("For the fourth correct attempt: 5.");
        System.out.println("If you are unable to guess the number within 4 chances: 0");
        playGame();
    } 
}