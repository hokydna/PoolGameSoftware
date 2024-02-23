package PoolGame;

import PoolGame.config.*;

import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;

/** Main application entry point. */
public class App extends Application {
    /**
     * @param args First argument is the path to the config file
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    /**
     * Starts the application.
     * 
     * @param primaryStage The primary stage for the application.
     */
    public void start(Stage primaryStage) {
        // READ IN CONFIG
        List<String> args = getParameters().getRaw();
        newStartLevel(primaryStage, args);
    }

    /**
     * Checks if the config file path is given as an argument.
     * 
     * @param args
     * @return config path.
     */
    private static String checkConfig(List<String> args) {
        String configPath;
        if (args.size() > 0) {
            configPath = args.get(0);
        } else {
            configPath = "src/main/resources/config_easy.json";
        }
        return configPath;
    }

    public void newStartLevel (Stage primaryStage, List<String> args){ // ADDED
        GameManager gameManager = new GameManager();

        String configPath = checkConfig(args);

        ReaderFactory tableFactory = new TableReaderFactory();
        Reader tableReader = tableFactory.buildReader();
        tableReader.parse(configPath, gameManager);

        ReaderFactory ballFactory = new BallReaderFactory();
        Reader ballReader = ballFactory.buildReader();
        ballReader.parse(configPath, gameManager);

        ReaderFactory pocketFactory = new PocketReaderFactory(); // ADDED
        Reader pocketReader = pocketFactory.buildReader(); // ADDED
        pocketReader.parse(configPath, gameManager); // ADDED

        gameManager.buildManager(primaryStage);

        // START GAME MANAGER
        gameManager.run();
        primaryStage.setTitle("Pool");
        primaryStage.setScene(gameManager.getScene());
        primaryStage.show();
        gameManager.run();

    }
}
