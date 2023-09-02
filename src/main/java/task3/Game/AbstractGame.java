package task3.Game;

import task3.Game.Answer;
import task3.Game.Game;
import task3.Game.GameStatus;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    String word;
    GameStatus gameStatus = GameStatus.INIT;


    /**
     * @return слово для угадывания
     * @apiNote метод предзаполняет слово компьютера
     */
    public String generateWord() {
        List<String> words = generateCharList();
        Random a = new Random();
        String result="";
        for (int i = 0; i < sizeWord; i++) {
            int index = a.nextInt(words.size());
            result = result.concat(words.get(a.nextInt(index)));
            words.remove(index);
        }
        return result;
    }

    abstract List<String> generateCharList();

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.word = generateWord();
        gameStatus = GameStatus.START;
        System.out.println("подсказка: " + word);
    }

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==value.charAt(i)){
                bulls++;
                cows++;
            }
            else {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == value.charAt(i)){
                        cows++;
                    }
                }

            }

        }
        if (maxTry ==0){
            gameStatus = GameStatus.GAME_OVER;
            System.out.println("Вы проиграли загаданное слово было" + word + " вы заработали быков" + bulls);
            return new Answer();
        }
        if (word.length() == bulls){
            gameStatus = GameStatus.WINNER;
        }



        return new Answer(value,bulls,cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}