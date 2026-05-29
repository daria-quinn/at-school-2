package Homework8;          // <-- тот же пакет, что и у Playlist


public class Winamp {
    public static void main(String[] args) {
        // Объект Playlist
        Playlist myPlaylist = new Playlist("Плейлист для vibe");

        // Вызов всех методов
        myPlaylist.addSong("Charli XCX -360");
        myPlaylist.addSong("Егор Кринж - Самая самая");
        myPlaylist.addSong("Лэйди Гага - Just Dance");

        myPlaylist.getSong(0);
        myPlaylist.updateSong(2, "Егор Кринж, темный принц и ещё куча новых реперов - 67 новых песен");
        myPlaylist.removeSong(1);

        // Вывод финального состояния
        System.out.println(myPlaylist);
    }
}