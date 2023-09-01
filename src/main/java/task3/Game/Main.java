package task3.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            Game game = new GameNumbers();
            game.start(4,5);
            Scanner scanner = new Scanner(System.in);
            while (!game.getGameStatus().equals(GameStatus.WINNER)
                    && !game.getGameStatus().equals(GameStatus.GAME_OVER)){
                String scanWord = scanner.nextLine();
                Answer answer = game.inputValue(scanWord);
                System.out.println("answer = " + answer);


            }
            System.out.println(game.getGameStatus());
            String restart = scanner.nextLine();
            System.out.println("Вы хотите начать игру занова\n" +
                    "Да - 1\t" + "Нет - 0\n");
            if (restart == "0"){
                break;
            }
        }
    }
}
