package Домашка3;

import java.util.Arrays;
import java.util.Comparator;

public class Baskets {
   public static void main (String[] args) {
       // Часто покупаемые товары у Пети
       String[] arrayOfPiterBasket = {"курица", "бананы", "творог"};

       // Часто покупаемые товары у Коли
       String[] arrayOfNickBasket = {"курица", "бананы", "творог"};

       // Часто покупаемые товары у Терентия
       String[] arrayOfTerentiyBasket = {"пиво", "пельмени", "ласка магия черного"};

       //сравнение корзин Пети и Коли по колличеству товаров:
       int sizePetya = (int) Arrays.stream(arrayOfPiterBasket).count();
       int sizeKolya = (int) Arrays.stream(arrayOfNickBasket).count();

       System.out.println("Сравнение количества товаров Пети: " + sizePetya + " и Коли: " + sizeKolya + " Результат: " + (sizePetya==sizeKolya) );

       //сравнение корзин Пети и Терентия по колличеству товаров:
       int sizeTerentiy = (int) Arrays.stream(arrayOfTerentiyBasket).count();
       System.out.println("Сравнение количества товаров Пети: " + sizePetya + " и Терентия: " + sizeTerentiy + " Результат: " + (sizePetya==sizeTerentiy) );

       //сравнение между собой корзин по их составу
       System.out.println(" ");
       System.out.println ("Состав корзины Пети и Коли одинаковый? " + Arrays.equals(arrayOfPiterBasket,arrayOfNickBasket)); //Петя и Коля
       System.out.println ("Состав корзины Пети и Терентия одинаковый? " + Arrays.equals(arrayOfPiterBasket,arrayOfTerentiyBasket)); //Петя и Терентий

       //Привлекают ли пользователей товары с более длинными названиями?

       // Объединяем всех в один "супер-массив" для удобства исследования
       String[] allItems = {"курица", "бананы", "творог", "курица", "бананы", "творог", "пиво", "пельмени", "ласка магия черного"};

       // 1. Самое длинное (сортируем по длине и берем последний)
       String longest = Arrays.stream(allItems).max(Comparator.comparingInt(String::length)).orElse("");

       // 2. Самое короткое (берем первый после сортировки по длине)
       String shortest = Arrays.stream(allItems).min(Comparator.comparingInt(String::length)).orElse("");

       // 3. Средняя длина (используем специальный метод для чисел)
       double averageLength = Arrays.stream(allItems).mapToInt(String::length).average().orElse(0);

       System.out.println("Самое длинное: " + longest);
       System.out.println("Самое короткое: " + shortest);
       System.out.printf("Средняя длина названия: %.2f", averageLength);

   }
}
