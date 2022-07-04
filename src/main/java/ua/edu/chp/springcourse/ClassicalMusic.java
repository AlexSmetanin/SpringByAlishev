package ua.edu.chp.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {} // приватный конструктор, чтоб нельзя было создать объект командой new, а только через фабричный метод

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Do my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Do my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
