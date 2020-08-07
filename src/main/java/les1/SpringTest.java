package les1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusic();

        PodcastPlayer podcastPlayer = applicationContext.getBean("podcastPlayer", PodcastPlayer.class);
        podcastPlayer.playPodcast();

//        Music music = applicationContext.getBean("musicBean",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//


//        Podcast podcast = applicationContext.getBean("podcastBean",Podcast.class);

//        PodcastPlayer podcastPlayer = new PodcastPlayer(podcast);
//        podcastPlayer.playPodcast();

        applicationContext.close();
    }
}
