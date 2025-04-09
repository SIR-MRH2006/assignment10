import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("____________ please enter two number to calculation sumation of them ____________ ");
        String num1 = scan.nextLine();
        String num2 = scan.nextLine();
        String bigger = "";

        if(num1.length() > num2.length()){ 
            bigger = num1;
            while(num2.length() < num1.length()){
                num2 = "0" + num2;
            }
        }else if (num2.length() > num1.length()){
            bigger = num2;
            while (num1.length() < num2.length()){
                num1 = "0" + num1;
            }
        }

        int mainLen = bigger.length();
        int sumDigit = 0;
        int carry = 0;
        int mainDigit = 0;
        String result = "";
        for(int i = 1 ; i <= mainLen+1 ; i++){
            if(i == mainLen+1){
                if((carry != 0)){
                    result = result+(carry);
                }
                break;
            }
            sumDigit = Character.getNumericValue(num1.charAt(mainLen-i)) + Character.getNumericValue(num2.charAt(mainLen-i)) + carry;
            if(sumDigit >= 10) {
                carry = 1;
                mainDigit = 10-sumDigit;
            }else{
                mainDigit = sumDigit;
                carry = 0;
            }
            result = result+(mainDigit);
        }


        for(int j = result.length()-1 ;j >= 0 ; j-- ){
            if(!(result.charAt(j) == '-')){
                System.out.print(result.charAt(j));
            }
        }
    }
}
