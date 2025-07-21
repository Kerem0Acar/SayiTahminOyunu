import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int randomNumber = random.nextInt(1,100);
        int guesses = 4;
        long startTime = System.currentTimeMillis();
        System.out.println("------------Sınırlı Sürede Sayı Tahmin Etme Oyunu------------");
        System.out.println("Eğer toplam tahmmin süreniz 10 saniyeyi geçerse doğru tahmin etseniz bile oyun sonlanır.");

         while(true){
             long remainingTime = (System.currentTimeMillis() - startTime)/1000;
             System.out.println("Kalan süreniz: "+(10-remainingTime)+" saniye");
             if(guesses == 0){
                 System.out.println("Tahmin etme hakkınız bitmiştir!!!");
                 System.out.println("Asıl değer: "+randomNumber);
                 System.out.println("Oyun sonlandırılıyor...");
                 break;

             }else{

                 System.out.print("1 ile 10 arasında bir sayı tahmin ediniz: ");
                 int userGuess = scan.nextInt();
                 long lastGuessTime = (System.currentTimeMillis() - startTime)/1000;
                 if(lastGuessTime > 10) {
                     System.out.println("Süreniz bitmiştir!!!");
                     break;
                 }
                 if(userGuess<1||userGuess>100){
                     System.out.println("Tahmininiz 1 ile 10 arasında değil!!!");
                 }else{

                     if(userGuess>randomNumber){
                         System.out.println("Tahmininiz asıl sayıdan yüksek!!!");
                     }else if (userGuess<randomNumber){
                         System.out.println("Tahmininiz asıl sayıdan düşük!!!");
                     }else{
                         System.out.println("Doğru tahmin ettiniz...");
                         System.out.println("Asıl değer: "+randomNumber);
                         break;
                     }

                     guesses--;
                     System.out.println("Kalan tahmin hakkınız: "+guesses);
                 }
             }
         }

    }

}
