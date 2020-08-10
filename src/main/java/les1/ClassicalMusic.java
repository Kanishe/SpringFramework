package les1;

import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }
}
