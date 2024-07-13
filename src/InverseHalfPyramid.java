public class InverseHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i>=0; i--){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //180 rotated pyramid
        for(int i =0; i<=n; i++){
            for(int j = 0; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("\n");
//        inverted pyramid with number
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
