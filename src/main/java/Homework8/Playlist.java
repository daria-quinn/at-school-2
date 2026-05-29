package Homework8;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final String name;
    private final List<String> songs;

    //название плейлиста
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    //добавление песни
    public void addSong(String song) {
        songs.add(song);
        System.out.println("Добавлена песня: " + song);
    }

    //удаление песни по индексу
     public void removeSong (int index){
         if (index < 0 || index >= songs.size()) {
             System.out.println("Ошибка: индекс " + index + " вне диапазона.");
             return;
         }
         String removed = songs.remove(index);
         System.out.println("Удалена песня: " + removed);
     }

     //обновление названия песни по индексу
     public void updateSong (int index, String newSong){
         if (index < 0 || index >= songs.size()) {
             System.out.println("Ошибка: индекс " + index + " вне диапазона.");
             return;
         }
         String old = songs.set(index, newSong);
         System.out.println("Обновлена песня: \"" + old + "\" → \"" + newSong + "\"");
     }

     //получение названия песни по индексу
    public String getSong(int index) {
        if (index < 0 || index >= songs.size()) {
            System.out.println("Ошибка: индекс " + index + " вне диапазона.");
            return null;
        }
        String song = songs.get(index);
        System.out.println("Получена песня: " + song);
        return song;
    }

    //формирование строкового представления плейлиста
    @Override
    public String toString() {
        return "Playlist \"" + name + "\": " + songs;
    }
}
