package les1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

@Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("playing music: " + music.getSong());
    }
}
