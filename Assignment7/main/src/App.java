import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {                                                                                                                                                                                                                      
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your first text: ");
        String text1 = scan.nextLine();
        System.out.print("Please enter your second text: ");
        String text2 = scan.nextLine();

        boolean isEqual = true;

        if(text1.length() == text2.length()){
            for(int i = 0; i < text1.length(); i++) {
                char ch = text1.charAt(i);
                int index = text2.indexOf(ch);
                if(index != -1) {
                    text2 = text2.substring(0, index) + text2.substring(index + 1);   // delete char from text2
                }else {
                    isEqual = false;
                    break;
                }
            }
        }else{
            isEqual = false;
        }

        if(isEqual){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
