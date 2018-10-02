package ru.davidlevi.GoF.behavioral.i11_templatemethod.game;

/**
 * Абстрактный класс, реализация абстрактных методов которого будет специфичной для каждого вида игры
 */
public abstract class Game {
    protected abstract void initializeGame();

    protected abstract void playGame();

    protected abstract void endGame();

    protected abstract void printWinner();

    // -------------------------------------------------
    private int playersAmount;

    public final void playOneGame(int playersAmount) {
        setPlayersAmount(playersAmount);
        //
        initializeGame();
        playGame();
        endGame();
        printWinner();
    }

    /**
     * Метод устанавливает очки игроку
     *
     * @param playersAmount int
     */
    private void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }

    /**
     * Методо возвращает количество очков у игрока
     *
     * @return int
     */
    public int getPlayersAmount() {
        return playersAmount;
    }
}
