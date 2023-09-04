package task3.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String restart = "1";
        String answer2 = null;
        int otv;
        List<String> statistic = new ArrayList<>();
        while (restart.equals("1")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите режим игры:" +
                    "\n Русские слова - 1" +
                    "\n Англиские слова - 2" +
                    "\n Числа - 3");
            int gameMode = Integer.parseInt(scanner.nextLine());
            Game game = null;
            switch (gameMode) {
                case 1 -> game = new RUGame();
                case 2 -> game = new ENGame();
                case 3 -> game = new GameNumbers();
                default -> System.out.println("Ошибка!!!\n" +
                        "Вы не выбрали режим игры");
            }
            game.start(4,5);

            while (!game.getGameStatus().equals(GameStatus.WINNER)
                    && !game.getGameStatus().equals(GameStatus.GAME_OVER)){
                String scanWord = scanner.nextLine();
                Answer answer = game.inputValue(scanWord);
                statistic.add(String.valueOf(answer));
            }
            System.out.println(game.getGameStatus());
            System.out.println("Хотите посмотреть свою статистику за эту игру?" +
                    "Да - 1\t" + "Нет - 0\n");
            otv = scanner.nextInt();
            if (otv == 1){
                System.out.println(statistic);
//                    TimeUnit.SECONDS.sleep(5);
            }
            System.out.println("Вы хотите начать игру занова\n" +
                    "Да - 1\t" + "Нет - 0\n");
            restart = scanner.nextLine();
            if (restart == "0"){
                System.exit(0);
            }
        }

    }
}
