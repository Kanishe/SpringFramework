package les1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;

@Autowired
    public MusicPlayer(@Qualifier ("rockMusic") Music music1,
                       @Qualifier("classicalMusic")Music music2 ){
        this.music = music1;
        this.music = music2;

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
