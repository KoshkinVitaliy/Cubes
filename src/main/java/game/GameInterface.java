package game;

import java.util.Scanner;

public class GameInterface {
    private String playerName;
    private CubeGame cubeGame;

    public String getPlayerName() {
        return playerName;
    }

    public void startGame() {
        playerName = getScannerData("Введите имя игрока:");
        cubeGame = new CubeGame();
        showTurn();
    }

    private void showTurn() {
        cubeGame.getCubeDots();
        System.out.println("Ваши кубики:");
        generateCubes(cubeGame.getFirstCubeDots());
        generateCubes(cubeGame.getSecondCubeDots());
        getPlayerChoice();
    }

    private void getPlayerChoice() {
        String answer = getScannerData("Сумма кубиков с компьютером больше 15? да/нет");
        if (answer.equals("да")) {
            checkTurnResult(true);
        } else if (answer.equals("нет")) {
            checkTurnResult(false);
        } else {
            System.out.println("Неккоректный ответ. попробуйте ещё раз.");
            getPlayerChoice();
        }
    }

    private void checkTurnResult(boolean choice) {
    }

    private void generateCubes(int cubeDots) {
        switch (cubeDots) {
            case 1 -> generateOneDot();
            case 2 -> generateTwoDots();
            case 3 -> generateThreeDots();
            case 4 -> generateFourDots();
            case 5 -> generateFiveDots();
            case 6 -> generateSixDots();
        }
    }

    private void generateSixDots() {
        System.out.println("Cube:");
        System.out.println("● ● ●");
        System.out.println("● ● ●");
    }

    private void generateFiveDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
        System.out.println(" ●");
        System.out.println("● ●");
    }

    private void generateFourDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
        System.out.println("● ●");
    }

    private void generateThreeDots() {
        System.out.println("Cube:");
        System.out.println("● ● ●");
    }

    private void generateTwoDots() {
        System.out.println("Cube:");
        System.out.println("● ●");
    }

    private void generateOneDot() {
        System.out.println("Cube:");
        System.out.println("●");
    }

    private String getScannerData(String message) {
        System.out.println(message);
        return new Scanner(System.in).nextLine();
    }
}
