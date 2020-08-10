package les1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//Lesson9

        Music music = applicationContext.getBean("classicalMusic",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Podcast podcast = applicationContext.getBean("itPodcast", Podcast.class);

        PodcastPlayer podcastPlayer = new PodcastPlayer(podcast);
        podcastPlayer.playPodcast();

//Lesson9



//Lesson6

//        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer",MusicPlayer.class);
//        musicPlayer.playMusic();
//
//        PodcastPlayer podcastPlayer = applicationContext.getBean("podcastPlayer", PodcastPlayer.class);
//        podcastPlayer.playPodcast();

//Lesson6
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
