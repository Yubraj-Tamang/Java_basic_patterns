import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        int row;
        int column;
        //input taking object using scanner class
        Scanner input = new Scanner(System.in);
        //taking input
        System.out.println("Enter the row of square: ");
        row = input.nextInt();
        System.out.println("Enter the column of square: ");
        column = input.nextInt();
        //for row
        for(int i=0; i<=row; i++){
            //column
            for (int j=0; j<=column; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
