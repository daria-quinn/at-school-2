package Homework9;
import net.datafaker.Faker;
import com.github.lalyos.jfiglet.FigletFont;

import java.util.Random;

public class CompanyLogoGenerator {
    // массив фамилий
    private static final String[] SURNAMES = {
            "Ernst", "Young", "Dolce", "Gabanna"
    };

    // генератор случайных чисел
    private static final Random RANDOM = new Random();

    // объект Faker для получения случайных фамилий
    private static final Faker FAKER = new Faker();

    /** Возвращает случайную фамилию из массива SURNAMES */
    private static String randomSurnameFromArray() {
        int index = RANDOM.nextInt(SURNAMES.length);
        return SURNAMES[index];
    }

    /** Возвращает случайную фамилию, полученную из Faker */
    private static String randomSurnameFromFaker() {
        return FAKER.name().lastName();
    }

    /** Преобразует обычную строку в ASCII‑арт и выводит её */
    private static void printAscii(String text) {
        try {
            String ascii = FigletFont.convertOneLine(text);
            System.out.println(ascii);
        } catch (Exception e) {
            // в случае ошибки выводим оригинальный текст
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        // первая часть логотипа
        String part1 = randomSurnameFromArray();

        // фиксированная часть
        String part2 = "&";

        // третья часть логотипа
        String part3 = randomSurnameFromFaker();

        // выводим каждую строку в виде ASCII‑арт
        printAscii(part1);
        printAscii(part2);
        printAscii(part3);

        // ---------- Генерируем юридические данные ----------
        String fullName   = FAKER.name().fullName();       // полное ФИО
        String phone      = FAKER.phoneNumber().phoneNumber(); // телефон
        String address    = FAKER.address().fullAddress(); // полный адрес

        System.out.println(); // пустая строка для визуального разделения
        System.out.println("=== Регистрационные данные ===");
        System.out.println("ФИО:      " + fullName);
        System.out.println("Телефон:  " + phone);
        System.out.println("Адрес:    " + address);
    }
}
