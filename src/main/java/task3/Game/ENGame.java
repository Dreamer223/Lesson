package task3.Game;

import java.util.ArrayList;
import java.util.List;

public class ENGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> en = new ArrayList<>();
        for (int i = 'a'; i < 'z'; i++) {
            en.add(String.valueOf((char) i));
        }
        return en;
    }
}
