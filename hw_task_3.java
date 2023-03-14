package Java_sem_2.java_hw_2;
// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение)

import java.util.Scanner;

public class hw_task_3 {
    public static boolean isPalindrome(String s) {
        String revstr = new StringBuilder(s).reverse().toString();
        return s.equals(revstr);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку для сравнения: ");
        String uinput = iScanner.next();
        if(isPalindrome(uinput)){
            System.out.printf("Строка %s является палиндромом", uinput);
        } else {
            System.out.printf("Строка %s не является палиндромом", uinput);
        }
    }
}
