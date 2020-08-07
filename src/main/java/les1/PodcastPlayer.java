package les1;

public class PodcastPlayer {
    private Podcast podcast;

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
