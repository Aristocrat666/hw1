package Partaker;

public class Cat implements Partaker{
    public String name;
    public int maxRun;
    public int maxJump;
    boolean exit;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
        boolean exit = true;
    }
    public void run() {
        System.out.println(this.name + " Бежит");
    }
    public void jump() {
        System.out.println(this.name + " Прыгает");
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
        if (height <= maxJump) {
            System.out.println(name + " успешно перепрыгнула");
        } else {
            System.out.println(name + " провалила тест на прыжок");
            exit = false;
        }
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
