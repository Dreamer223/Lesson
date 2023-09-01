package task3.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameNumbers extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        return numbers;
    }
}
