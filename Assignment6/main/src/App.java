import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
                System.out.print("Enter an array like this one (1 2 o 3 l 4 5 j): ");
                String[] arr = scan.nextLine().split(" ");
                int[] num1OfArr = new int[arr.length];
                int[] num2OfArr = new int[arr.length];

                System.out.print("please Enter first number: ");
                String num1 = scan.nextLine();
        
                System.out.print("please Enter your second number: ");
                String num2 = scan.nextLine();
    
        
                int m = 0;
                int n = 0;
                for(int i = 0; i<arr.length; i++){
                    if(arr[i].equals(num1)){
                        num1OfArr[m] = i;
                        m++;
                    }else if(arr[i].equals(num2)){
                        num2OfArr[n] = i;
                        n++;
                    }
                }

                int min = Integer.MAX_VALUE;
                for(int j = 0;j<m;j++){
                    for(int k = 0;k<n;k++){
                        if((Math.abs(num1OfArr[j]-num2OfArr[k]) < min) && (Math.abs(num1OfArr[j]-num2OfArr[k])) != 0){
                            min = Math.abs(num1OfArr[j]-num2OfArr[k]);
                            System.out.println("min is :" + min);
                        }
                    }
                }
                System.out.println("main min" + ":" +min);
    }
}
