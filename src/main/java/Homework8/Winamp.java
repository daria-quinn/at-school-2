package Homework8;          // <-- тот же пакет, что и у Playlist


public class Winamp {
    public static void main(String[] args) {
        // Создаем плейлист
        Playlist myPlaylist = new Playlist("Плейлист для vibe");

        // Добавляем песни
        myPlaylist.addSong("Charli XCX -360");
        myPlaylist.addSong("Егор Кринж - Самая самая");
        myPlaylist.addSong("Лэйди Гага - Just Dance");

        //Получаем первую песню в плейлисте
        myPlaylist.getSong(0);

        //Обновляем песню
        myPlaylist.updateSong(2, "Егор Кринж, темный принц и ещё куча новых реперов - 67 новых песен");

        //Удаляем вторую песню
        myPlaylist.removeSong(1);

        // Вывод финального состояния
        System.out.println(myPlaylist);
    }
}