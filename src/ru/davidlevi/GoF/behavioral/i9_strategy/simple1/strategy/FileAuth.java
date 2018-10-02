package ru.davidlevi.GoF.behavioral.i9_strategy.simple1.strategy;

import java.io.File;

/**
 * Класс FileAuth имплементирует стратегию поведения интерфейса StrategyAuthentication
 */
public class FileAuth implements StrategyAuthentication {
    @Override
    public boolean checkLogin(String name, String password) {
        System.out.println("Checking with file...");
        return checkFromFile();
    }

    private File file;

    public FileAuth(File file) {
        this.file = file;
    }

    private boolean checkFromFile() {
        // Считывание из файла данных
        return true;
    }
}
