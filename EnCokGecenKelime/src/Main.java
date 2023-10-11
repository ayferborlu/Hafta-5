import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcının veri girebileceği Scanner sınıfını yazalım
        Scanner input = new Scanner(System.in);

        //İpucu 1: Öncelikle, metni kelimelere ayırmanız gerekecek. Bu işlemi yapmak için `String` sınıfının `split` metodunu kullanabilirsiniz.

        String str = input.nextLine();
        String[] kelimeDizisi = str.split(" ");

        // Kelimeleri saymak için bir veri yapısı kullanmanız gerekiyor : `HashMap`


        HashMap<String, Integer> kelimeTekrarMap = new HashMap<>();

        for (int i = 0; i < kelimeDizisi.length; i++) {
            int count = 0;
            for (int j = 0; j < kelimeDizisi.length; j++) {
                if (kelimeDizisi[i].equals(kelimeDizisi[j])) {
                    count++;
                }
                kelimeTekrarMap.put(kelimeDizisi[i], count);
            }
        }
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : kelimeTekrarMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
            }

        }

        ArrayList<String> enCokGecenKelimeler = getKeyByValue(kelimeTekrarMap, maxCount);

        System.out.println("En çok Tekrar eden kelimeler :");

        for (int i = 0; i < enCokGecenKelimeler.size(); i++) {
            System.out.println(enCokGecenKelimeler.get(i) + "\t Tekrar Sayısı :" + maxCount);
        }
    }

    public static ArrayList<String> getKeyByValue(HashMap<String, Integer> map, int maxCount) {
        ArrayList<String> result = new ArrayList<>();

        for (var entry : map.entrySet()) {
            if (entry.getValue().equals(maxCount)) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}

