package task3.Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String restart = "1";
        while (restart.equals("1")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите режим игры:" +
                    "\n Русские слова - 1" +
                    "\n Англиские слова - 2" +
                    "\n Числа - 3");
            int gameMode = Integer.parseInt(scanner.nextLine());
            Game game = null;
            switch (gameMode)
            {
                case 1:
                    game = new RUGame();
                    break;
                case 2:
                    game = new ENGame();
                    break;
                case 3:
                    game = new GameNumbers();
                    break;
                default:
                    System.out.println("Ошибка!!!\n"+
                            "Вы не выбрали режим игры");
            }
            game.start(4,5);

            while (!game.getGameStatus().equals(GameStatus.WINNER)
                    && !game.getGameStatus().equals(GameStatus.GAME_OVER)){
                String scanWord = scanner.nextLine();
                Answer answer = game.inputValue(scanWord);
                System.out.println("answer = " + answer);
            }
            System.out.println(game.getGameStatus());
            System.out.println("Вы хотите начать игру занова\n" +
                    "Да - 1\t" + "Нет - 0\n");
            restart = scanner.nextLine();

            if (restart == "0"){
                break;
            }
        }
    }
}
