import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        String input = new Scanner(System.in).nextLine().trim();

        String alphabet = "- абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        boolean isValid = true;
        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
               spaceCount++;
            }
            if (!alphabet.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if(isValid && spaceCount == 2){
            System.out.println("Фамилия: " + input.substring(0,input.indexOf(' ')).trim());
            System.out.println("Имя: " + input.substring(input.indexOf(' '),input.lastIndexOf(' ')).trim());
            System.out.println("Отчество: " + input.substring(input.lastIndexOf(' ')).trim());
        } else System.out.println("Введенная строка не является ФИО");
    }

}