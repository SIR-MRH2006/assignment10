import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your number");
        String numbers = scan.nextLine();
        float len = numbers.length();

        String part1 = numbers.substring(0, (int)Math.floor(len/2));
        String part2 = numbers.substring((int)Math.ceil(len/2), (int)len);
        System.out.println(part1 + " , " + part2);

        int sumationOfPart1 = 0;
        int sumationOfPart2 = 0;

        for(int i = 0 ; i<part1.length();i++){
                sumationOfPart1 += Integer.parseInt(part1.charAt(i)+"");
                sumationOfPart2 += Integer.parseInt(part2.charAt(i)+"");
        }
        System.out.println(sumationOfPart1 + " : " + sumationOfPart2);
        
        if(sumationOfPart1 == sumationOfPart2){
            System.out.println("(equal)");
        }else{
            System.out.println("(non equal)");
        }
    }
}
