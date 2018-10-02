package ru.davidlevi.GoF.structural.i6_facade.simple2;

import ru.davidlevi.GoF.structural.i6_facade.simple2.modules.CPU;
import ru.davidlevi.GoF.structural.i6_facade.simple2.modules.HardDrive;
import ru.davidlevi.GoF.structural.i6_facade.simple2.modules.Memory;

/**
 * Фасад
 */
class Computer {
    private static final long BOOT_ADDRESS = 100000L;
    private static final long BOOT_SECTOR = 0L;
    private static final int SECTOR_SIZE = 32;
    //
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    void startComputer() {
        cpu.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }
}
