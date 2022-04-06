import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 1);
        map.put('E', 1);
        map.put('I', 1);
        map.put('O', 1);
        map.put('U', 1);
        map.put('L', 1);
        map.put('N', 1);
        map.put('R', 1);
        map.put('S', 1);
        map.put('T', 1);
        map.put('D', 2);
        map.put('G', 2);
        map.put('B', 3);
        map.put('C', 3);
        map.put('M', 3);
        map.put('P', 3);
        map.put('F', 4);
        map.put('H', 4);
        map.put('V', 4);
        map.put('W', 4);
        map.put('Y', 4);
        map.put('K', 5);
        map.put('J', 8);
        map.put('X', 8);
        map.put('Q', 10);
        map.put('Z', 10);

//        Scanner sc = new Scanner(System.in);
//        String palavra = sc.next().toUpperCase();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("DIGITE A PALAVRA QUE DESEJA SABER A PONTUACÃO:");
        String palavra = myObj.nextLine();
        int soma = 0;
        for (int i = 0; i < palavra.length(); i++) {
            soma += map.get(palavra.charAt(i));
        }
        System.out.println(soma);
    }
}
