package ru.davidlevi.GoF.behavioral.i11_templatemethod;

import ru.davidlevi.GoF.behavioral.i11_templatemethod.game.Chess;
import ru.davidlevi.GoF.behavioral.i11_templatemethod.game.Game;
import ru.davidlevi.GoF.behavioral.i11_templatemethod.game.GameCode;
import ru.davidlevi.GoF.behavioral.i11_templatemethod.game.Monopoly;

/**
 * Паттерн Template method (Шаблонный метод)
 * <p>
 * Назначение:
 * - определяет основу алгоритма и позволяющий наследникам переопределять некоторые шаги алгоритма, не изменяя его
 * структуру в целом.
 * Применимость:
 * - Однократное использование инвариантной части алгоритма, с оставлением изменяющейся части на усмотрение наследникам.
 * - Локализация и вычленение общего для нескольких классов кода для избегания дублирования.
 * - Разрешение расширения кода наследниками только в определенных местах.
 * Участники:
 * - Abstract class (абстрактный класс) - определяет абстрактные операции, замещаемые в наследниках для реализации шагов
 * алгоритма; реализует шаблонный метод, определяющий скелет алгоритма. Шаблонный метод вызывает замещаемые и другие,
 * определенные в Abstract class, операции.
 * - Concrete class (конкретный класс) - реализует замещаемые операции необходимым для данной реализации способом.
 * - Concrete class предполагает, что инвариантные шаги алгоритма будут выполнены в AbstractClass.
 */
public class MainClass {
    public static void main(String[] args) {
        // В зависимости какой выбран код игры, такой темплет и будет использован
        final GameCode gameCode = GameCode.CHESS;
        Game game;
        switch (gameCode) {
            case CHESS:
                game = new Chess(); // темплет 1
                break;
            case MONOPOLY:
                game = new Monopoly(); // темплет 2
                break;
            default:
                throw new IllegalStateException();
        }
        game.playOneGame(2);
    }
}
