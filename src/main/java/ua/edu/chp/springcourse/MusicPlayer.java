package ua.edu.chp.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    // Для проигрывания не одного произведения, а целого списка, надо создать список, сеттер и метод
    private List<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;

    // Inversion of Control
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Сеттер для списка воспроизведения
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    // Метод воспроизведения списка музыки
    public void playMusicList() {
        // playing music list
    }
}
