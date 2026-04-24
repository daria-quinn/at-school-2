package Домашка3;

import java.util.Arrays;

public class Baskets {
   public static void main (String[] args) {
       // Часто покупаемые товары у Пети
       String[] arrayOfPiterBasket = {"курица", "бананы", "творог"};

       // Часто покупаемые товары у Коли
       String[] arrayOfNickBasket = {"курица", "бананы", "творог"};

       // Часто покупаемые товары у Терентия
       String[] arrayOfTerentiyBasket = {"пиво", "пельмени", "ласка магия черного"};

       //сравнение корзин Пети и Коли по колличеству товаров:
       int sizePetya = arrayOfPiterBasket.length;
       int sizeKolya = arrayOfNickBasket.length;

       System.out.println("Сравнение количества товаров Пети: " + sizePetya + " и Коли: " + sizeKolya + " Результат: " + (sizePetya==sizeKolya) );

       //сравнение корзин Пети и Терентия по количеству товаров:
       int sizeTerentiy = arrayOfTerentiyBasket.length;
       System.out.println("Сравнение количества товаров Пети: " + sizePetya + " и Терентия: " + sizeTerentiy + " Результат: " + (sizePetya==sizeTerentiy) );

       //сравнение между собой корзин по их составу
       System.out.println(" ");
       System.out.println ("Состав корзины Пети и Коли одинаковый? " + Arrays.equals(arrayOfPiterBasket,arrayOfNickBasket)); //Петя и Коля
       System.out.println ("Состав корзины Пети и Терентия одинаковый? " + Arrays.equals(arrayOfPiterBasket,arrayOfTerentiyBasket)); //Петя и Терентий

       //Привлекают ли пользователей товары с более длинными названиями?

       // Объединяем всех в один "супер-массив" для удобства исследования
       String[] allItems = {"курица", "бананы", "творог", "курица", "бананы", "творог", "пиво", "пельмени", "ласка магия черного"};

       // Создаем переменные-хранилища
       String shortestName = allItems[0]; // Считаем первое слово самым коротким для начала
       String longestName = allItems[0];  // И его же самым длинным
       double totalLength = 0;        // Сумма длин всех слов

       // Проходим по каждому товару
       for (int i = 0; i < allItems.length; i++) {
           String currentItem = allItems[i];
           int currentLength = currentItem.length();

           // 1. Ищем самое длинное слово
           if (currentLength > longestName.length()) {
               longestName = currentItem;
           }

           // 2. Ищем самое короткое слово
           if (currentLength < shortestName.length()) {
               shortestName = currentItem;
           }

           // 3. Складываем длину текущего слова в общую копилку
           totalLength = totalLength + currentLength;
       }

       // Вычисляем среднее
       double averageLength = totalLength / allItems.length;

       System.out.println("Самое короткое: " + shortestName);
       System.out.println("Самое длинное: " + longestName);
       System.out.printf("Средняя длина: %.2f", averageLength);

   }
}
