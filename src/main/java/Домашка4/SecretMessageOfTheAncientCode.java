package Домашка4;

import java.util.Scanner;

public class SecretMessageOfTheAncientCode {
    public static void main (String[] args) {
        int parts = 5;// количество частей
        String[] partsOfMessage = new String[parts];// массив с введенными данными
        String[] resultOfCheck = new String[parts]; // массив с проверенными данными


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательно 5 частей сообщения");
        for (int i = 0; i < parts; i++) {
            System.out.println("Введите часть сообщения №" + (i + 1) + ":");
            partsOfMessage[i] = scanner.nextLine();

            //проверка на NULL
            boolean isValid = partsOfMessage[i].equalsIgnoreCase("NULL");
            if (isValid) { // повреждённая часть
                System.out.println(
                        "Часть сообщения повреждена! Используем резервный фрагмент..."); //выводим сообщение по повреждении
                resultOfCheck[i] = "XX"; //присваиваем вместо NULL "ХХ" и складываем в массив с результатом проверки
            } else {
                resultOfCheck[i] = partsOfMessage[i]; // складываем все в массив с результатом проверки значения без NULL
            }
        }
        // Выводим полученное сообщение (склеиваем все части)
        System.out.println("\nИтоговое сообщение:");
        StringBuilder finalMessage = new StringBuilder(); // вызываем для формирования итогового массива для вывода
        for (int i = 0; i < parts; i++) {
            finalMessage.append(resultOfCheck[i]);          // добавляем текущую часть
            if (i < parts - 1) {                     // после каждой, кроме последней,
                finalMessage.append('#');            // вставляем разделитель #
            }
        }
        System.out.println("\nРасшифрованное послание:");
        System.out.println(finalMessage.toString());

        scanner.close();
    }
}
