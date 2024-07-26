import java.util.Scanner;

public class keprekarNumber {
    public static boolean isKeprekar(int n){
        if(n == 1){
            return true;
        }
        int square = n*n;
        int count_digits = 0;
        while(square>0){
            count_digits++;
            square/=10;
        }
        square = n*n;
        for(int i=1;i<=count_digits;i++){
            int no_power = (int) Math.pow(10,i);
            int sum = square/no_power + square%no_power;
            if(sum == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
    for(int i=1;i<n;i++){
        if(isKeprekar(i)){
            System.out.print(i + " ");
        }
    }
    }
}
