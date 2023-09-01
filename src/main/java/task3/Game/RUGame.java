package task3.Game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RUGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> ru =new ArrayList<>();
        for (int i = 'а'; i < 'я' ; i++) {
            ru.add(String.valueOf((char)i));
        }
        ru.add("ё");
        return ru;
    }
}
