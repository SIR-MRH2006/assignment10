import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        boolean isOk = true;
        String arrayHolder = "";

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if((ch == '(') || (ch == '{') ||  (ch == '[')){
                arrayHolder += ch;
            } 
            else if((ch == ')') ||  (ch == '}') || (ch == ']')){
                if(arrayHolder.isEmpty()) {
                    isOk =  false;
                }
                char last = arrayHolder.charAt(arrayHolder.length() - 1);
                if((ch == ')' && last == '(') || (ch == '}' && last == '{') || (ch == ']' && last == '[')) {
                    arrayHolder = arrayHolder.substring(0, arrayHolder.length()-1);
                }else{
                    isOk =  false;
                }
            }
        }

        if(isOk){
            System.out.println("its ok");
        }else{
            System.out.println("its not ok");
        }   
    }
}




