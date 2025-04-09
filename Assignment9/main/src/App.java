import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // این بخش در دوجلسه پیش داخل کلاس انجام شده است

        String[] candidates = {"ahmad", "ali", "saman", "mahdi", "reza"};
        int[] people = new int[candidates.length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("--------------");
            System.out.println("person" + ":" + i);
            for (int j = 0; j < candidates.length; j++) {
                System.out.println((j + 1) + ") " + candidates[j]);
            }
            int ray = scanner.nextInt();
            if (ray >= 1 && ray <= candidates.length) {
                people[ray - 1]++;
            }
        }

        System.out.println("result:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + " : " + people[i]);
        }
        
    }
}
