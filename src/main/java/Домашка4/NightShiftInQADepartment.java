package Домашка4;

public class NightShiftInQADepartment {
    public static void main (String[] args) {
        int [] numberOfTest = new int[100];
        int countOfFlaky = 0;    //для подсчета количества тестов Flaky
        int countOfBug = 0;      //для подсчета количества тестов Bug
        int countOfCritical = 0; //для подсчета количества тестов Critical
        int countOfPass = 0;     //для подсчета количества тестов Pass

        //заполнение массива данными
        for (int i = 0; i < numberOfTest.length; i++) {
            numberOfTest[i] = i + 1;
        }

        //проверка тестов
        for (int i = 0; i<numberOfTest.length; i++){

            if ((numberOfTest[i]% 3 ==0)&&(numberOfTest[i]% 5 ==0)){              //делится и на 3 и на 5
                System.out.println("Тест# " + numberOfTest[i] + " - Critical");
                countOfCritical++;
            } else if (numberOfTest[i] % 3==0) {                                  //делится на 3
                System.out.println("Тест# " + numberOfTest[i] + " - Flaky");
                countOfFlaky++;
            } else if (numberOfTest[i] % 5==0) {                                  //делится на 5
                System.out.println("Тест# " + numberOfTest[i] + " - Bug");
                countOfBug ++;
            }else {                                                               //остальные кейсы
                System.out.println("Тест# " + numberOfTest[i] + " - Pass ");
                countOfPass++;
            }

        }
        // Итоговый блок в точном виде
        System.out.println();
        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====");
        System.out.println("Всего тестов: 100");
        System.out.println("Pass:      " + countOfPass);
        System.out.println("Flaky:     " + countOfFlaky);
        System.out.println("Bug:       " + countOfBug);
        System.out.println("Critical:  " + countOfCritical);
    }
}
