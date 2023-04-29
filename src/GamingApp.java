
public class GamingApp {

    public static void main(String[] args) {

//        MarioGame game = new MarioGame();

//        SuperContraGame game = new SuperContraGame();

        GamingConsole game = new SuperContraGame();

        GameRunner runner = new GameRunner(game);

        runner.run();

    }

}