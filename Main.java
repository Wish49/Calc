import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] arg){
        // char [] exept = new char [3];
      calc("");

    }
    public static String calc (String input){
        String str = sc.nextLine();
        String[] parts = str.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        if (num1 < 1 || num1 > 10){
            System.out.println("throws Exception");
            System.exit(0);
        }
        if (num2 < 1 || num2 > 10){
            System.out.println("throws Exception");
            System.exit(0);
        }
        String operStr = parts[1];
        char[] oper= operStr.toCharArray();
        int sum = 0;
        String str1 = new String(oper);
        int count = 0;
        for (int i = 0; i < str1.length(); i++){
            count++;
            if ( count > 1){
                System.out.println("throws Exception");
                System.exit(0);
            }

        }

        if (oper[0] == '+'){
            sum = num1 + num2;
        }else if (oper[0] == '-') {
            sum = num1 - num2;
        } else if (oper[0] == '*') {
            sum = num1 * num2;
        } else if (oper[0] == '/') {
            sum = num1 / num2;
        }
        System.out.println(sum);
        String str2 = String.valueOf(sum);


        return str2;
    }
}
