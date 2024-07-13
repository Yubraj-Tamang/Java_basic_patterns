public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count+" ");
                count = count+1;
            }
            System.out.println();
        }
        System.out.print("\n");
        //0-1 triangle
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
