import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr ={0,1,2,3,4,5,6,7,8,9};
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir değer girin  : ");
        int index = input.nextInt();
        try{
            checkArray( arr,index);
            System.out.println(" iNDEX DEĞERİ: "+arr[index]);
        }catch (Exception e){
            System.out.println(e.getMessage() + e.toString());
        }
        finally {
            System.out.println(" Program bitti");
        }
    }

    public static void checkArray( int[]a, int index) throws Exception{
        if( index>a.length && index>0){
          throw new Exception("Uygun aralıkta değil");

        }else {
          System.out.println("Uygun aralıkta");
      }
    }
      }