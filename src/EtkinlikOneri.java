import java.util.Scanner;

public class EtkinlikOneri {
    public static void main(String[] args) {
        int heat;

        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz : ");
        heat=input.nextInt();

        if (heat<5){
            System.out.println("Kayak yapılası bir hava.");
        }
        if(heat>=5 && heat<=15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        if (heat>=10 && heat<=25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        if (heat>25){
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
