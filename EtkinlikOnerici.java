package Giris;
import java.util.Scanner;
public class EtkinlikOnerici {
    public static void main(String[] args) {
        int heat;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık Değerini Giriniz:");
        heat =inp.nextInt();
        if(heat<5){
            System.out.println("Kayağa gidebilirsiniz.");
        }else if(heat>=5 && heat<=25){
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }if(heat>=10){
                System.out.println("Pikniğe gidebilirsiniz.");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
