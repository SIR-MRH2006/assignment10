import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("_______________ please enter yout text _______________");
        String userWord = scan.nextLine();
        String temp = "";
        
        for(int i = 0;i<userWord.length(); i++) {
            char ch = userWord.charAt(i);
            boolean bool = false;
            
            for(int j = 0;j<temp.length();j++){
                if(temp.charAt(j) == ch){
                    bool = true;
                }
            }
            if(!bool){
                temp += ch;
            }
        }
        
        System.out.println(temp+"  "+userWord);
    }
}
