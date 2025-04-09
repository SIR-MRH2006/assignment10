import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        float shir = 0;
        float khat = 0;
        for(int i = 1 ;i <=1000 ; i++){
                int partab = rand.nextInt(2);
                if(partab == 0){
                    shir++;
                }else{
                    khat++;
                }
        }
        System.out.println("shir : "  + shir/10+"%"+"\n"+"khat : " + khat/10 +"%");
    }
}
