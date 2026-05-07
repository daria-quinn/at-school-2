package Домашка5;

import java.time.LocalDate;
import java.util.Random;

public class DarkServerProtocols {
    public static void main(String[] args) {
        //1. Сгенерировать код доступа через generateAccessCode() и сохранить в переменную
        String accessCode = generateAccessCode();
        System.out.println("Сгенерированный код доступа: " + accessCode);

        //2. Проверить его через isValidCode(code, 8) и вывести результат
        System.out.println ("Результат проверки кода доступа: " + isValidCode(accessCode, 8));

        //3. Записать в лог событие "Server protection activated"
        logEvent("Server protection activated");

        //4. Записать критическое событие "Intrusion attempt detected" (isCritical = true)
        logEvent("Intrusion attempt detected", true);

        //5. Сгенерировать три ID агентов: prefix "AGENT", seed 42, 77 и 13 - вывести каждый
        System.out.println ("ID агент 1: " + generateAgentId("AGENT",42));
        System.out.println ("ID агент 2: " + generateAgentId("AGENT",77));
        System.out.println ("ID агент 3: " + generateAgentId("AGENT",13));
    }

    //1. Протокол ГЕНЕРАТОР
    public static String generateAccessCode() {
        int year = LocalDate.now().getYear();   //получаем текущий год
        String separator = "-";                 //разделитель
        int powResult = (int) Math.pow(3, 7);   //генераций последних 4 символов кода доступа
        return year + separator + powResult;    //сборка кода через конкатенацию
    }

    //2. Протокол ВАЛИДАТОР
    private static boolean isValidCode(String code, int minLength) {
        if (code == null) {                     //code не должен быть null
            return false;
        }

        if (code.length() < minLength) {        //длина кода должна быть не меньше minLength
            return false;
        }

        return code.contains("-");              //код обязан содержать символ '-'
    }

    //3. Протокол ЛОГГЕР - 1
    public static void logEvent(String message) {
        System.out.println("[INFO] " + message);
    }

    //3. Протокол ЛОГГЕР - 2
    public static void logEvent(String message, boolean isCritical) {
        if (isCritical) {
            System.out.println("[CRITICAL] " + message);
        } else {
            logEvent(message);                  //Переиспользуем первую версию, чтобы не дублировать вывод
        }
    }

    //4. Протокол РАНДОМАЙЗЕР
    public static String generateAgentId(String prefix, int seed){
        Random rnd = new Random(seed);          //Создаём генератор случайных чисел

        //Случайное число от 1000 до 9999 включительно
        int rawNumber = rnd.nextInt(9000) + 1000;

        //На случай отрицательных значений
        int number = Math.abs(rawNumber);

        //Формируем итоговую строку
        return prefix + "-" + number;
    }
}
