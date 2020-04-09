import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        for (int i=1;i<1000;i++){
            if (checkSoNgTo(i)==true && i<100){
                System.out.print(i+"\t");
            }
        }
    }

    static  boolean checkSoNgTo(int n){
        int dem =0;
        if (n<2){
            return false;
        }else {
            for (int i=2;i<=n/2;i++){
                if (n%i ==0){
                    dem++;
                }
            }
            if (dem<1)
                return true;
            return false;
        }
    }
}
