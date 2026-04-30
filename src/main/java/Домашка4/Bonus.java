package Домашка4;

public class Bonus {
    public static void main(String[] args) {

        int countOfFlaky    = 0;
        int countOfBug      = 0;
        int countOfCritical = 0;
        int countOfPass     = 0;
        boolean showOnlyIssues = false;
        boolean stopOnCritical = false;

        // Проходим по номерам тестов от 1 до 100 без лишнего массива
        for (int i = 1; i <= 100; i++) {
            String status;

            if (i % 3 == 0 && i % 5 == 0) {          // 3. совместная делимость проверяется первой
                status = "Critical!";
                countOfCritical++;
            } else if (i % 3 == 0) {
                status = "Flaky";
                countOfFlaky++;
            } else if (i % 5 == 0) {
                status = "Bug";
                countOfBug++;
            } else {
                status = "Pass";
                countOfPass++;
            }

            // вывод с учетом флага
            if (!showOnlyIssues || !"Pass".equals(status)) {
                System.out.println("Тест #" + i + ": " + status);
            }
            // 3) Проверка «стоп‑сигнала»
            if (stopOnCritical && countOfCritical >= 3) {
                System.out.println();
                System.out.println("=== СТОП-СИГНАЛ ===");
                System.out.println("Найдено 3 теста со статусом Critical! "
                        + "Прерывание обработки.");
                // Выходим из цикла, но сохраняем уже посчитанные результаты
                break;
            }
        }

        // 5. Итоговый блок в точном виде
        System.out.println();
        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====");
        System.out.println("Всего тестов: 100");
        System.out.println("Pass:      " + countOfPass);
        System.out.println("Flaky:     " + countOfFlaky);
        System.out.println("Bug:       " + countOfBug);
        System.out.println("Critical:  " + countOfCritical);
    }
}