import java.util.Scanner;
public class IT24101157Lab5Q2{
    public static void main(String[] args){
        Scanner myKey=new Scanner(System.in);
        System.out.print("Enter the number of new members introduced : ");
        int numberOfMembers=myKey.nextInt();
        if(numberOfMembers>=0){
            switch (numberOfMembers){
                case 0:
                System.out.print("Prize is a : No Prize");
                break;
                case 1:
                System.out.print("Prize is a : Pen");
                break;
                case 2:
                System.out.print("Prize is a : Umbrella");
                break;
                case 3:
                System.out.print("Prize is a : Bag");
                break;
                case 4:
                System.out.print("Prize is a : Travelling chair");
                break;
                default:
                System.out.print("Prize is a : Headphone");
                }

            }
            else{
                System.out.print("Input must be a number 0 or greater");
            }
        }
    }