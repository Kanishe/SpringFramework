package les1;

import org.springframework.stereotype.Component;

@Component("itPodcast")
public class ITPodcast implements Podcast {
    @Override
    public String getPodcast() {
        return "ITPodcast";
    }
}
