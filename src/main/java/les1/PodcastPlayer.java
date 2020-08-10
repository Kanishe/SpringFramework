package les1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PodcastPlayer {
    private Podcast podcast;

    @Autowired
    public PodcastPlayer(Podcast podcast) {
        this.podcast = podcast;
    }

    public PodcastPlayer(){

    }

    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

    public void playPodcast(){
        System.out.println("Podcast play: " + podcast.getPodcast());
    }
}
