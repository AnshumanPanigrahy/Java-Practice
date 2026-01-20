
import java.util.*;

public class NamberGuss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int num=rand.nextInt(10);
        System.out.println("Welcome to the Gussing Game!!");
        System.out.println("you have to chooice between 1 TO 100 !!");
        int GussingNum=0;
        int count=0;
        while(GussingNum != num){
            System.out.println("Enter the your NO.: ");
            GussingNum=sc.nextInt();
            count++;

            if (GussingNum > num) {
                System.out.println("it is too high ,Guess the lower number!!");
            }
            else if(GussingNum<num){
                System.out.println("it is too low ,Guess the higher number !!");

            }
            else{
                System.out.println("your gussing number is correct "+count+" Number of the attempt you have Attempted!!");
            }
        }

    System.out.println("Thank You for playing the Game ,Try another  Time Playing!! ");

    }    
}