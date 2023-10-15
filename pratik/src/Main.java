import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.



    public static String TimeConvert(int num) {

        int minute = num % 60;
        int hour = num / 60;
        return hour + ":" + minute;
    }

    public static String TimeConvert2(int num) {

    }


private static void run(){
         System.out.print("Değer girin: ");
    Scanner input= new Scanner(System.in);
    System.out.print(TimeConvert(Integer.parseInt(input.nextLine())));

}
    }
