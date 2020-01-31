package Partaker;

public class Man implements Partaker{
    String name;
    int maxRun;
    int maxJump;
    boolean exit;

    public Man(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        boolean exit = true;
    }
    public void run() {
        System.out.println(this.name + " Бежит");
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRun) {
            System.out.println(name + " успешно проплыл");
        } else {
            System.out.println(name + " провалил тест на плавание");
            exit = false;
        }
    }

    @Override
    public void jump(int height) {

        System.out.println(this.name + " Прыгает");
    }

    @Override
    public boolean isDistance() {
        return exit;
    }

    @Override
    public void info() {
        System.out.println(name + " "+ exit);
    }


}
