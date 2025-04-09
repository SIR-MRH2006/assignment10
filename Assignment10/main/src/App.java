import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // این بخش جلسه پیش حل شده است در 
        Scanner scan = new Scanner(System.in);

        String[] condidas = {"ali", "reza", "mohammad", "saman", "babak"};
        int[] condidaNumbers = {0, 0, 0, 0, 0};

        // count of people
        int peopleCount = 2;

        for (int i = 0; i < peopleCount; i++) {
            System.out.println("Person " + (i + 1));

            for (int k = 0; k < 3; k++) { 
                System.out.print("Enter your candidate name: ");
                String userCondida = scan.nextLine();

                int index = -1;
                for(int j = 0; j < condidas.length; j++){
                    if(condidas[j].equalsIgnoreCase(userCondida)) {
                        index = j;
                        break;
                    }
                }

                if(index != -1) {
                    condidaNumbers[index] += 5 - k; 
                }else {
                    System.out.println("Invalid candidate. Please try again.");
                    k--; // get name again
                }
            }
        }

        // result : 
        System.out.println("\nFinal Results:");
        for(int n = 0; n < condidas.length; n++){
            System.out.println(condidas[n] + ": " + condidaNumbers[n]);
        }
        int max = condidaNumbers[0];
        int indexOfwinner = 0;
        for(int m = 1;m<condidas.length; m++){
            if (condidaNumbers[m] > max){
                max = condidaNumbers[m];
                indexOfwinner = m;
            }
        }
        System.out.println(condidas[indexOfwinner] + " is winner");
    }
}
