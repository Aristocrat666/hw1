package Obstacles;

import Partaker.Partaker;

public class Wall extends Obstacle{
    int height;


    public Wall(int height) {
        this.height = height;
    }

    public void Wall(int heightWho, String name) {
        if (heightWho > height) {
            System.out.println(name + " Пробежал");
        } else {
            System.out.println(name + " НЕ пробежал");

        }
    }

    @Override
    public void doIt(Partaker competitor) {
        //не понимаю что это должно делать и как связывать
        // не понимаю как это связывает что бы при выполнении писалось это: CAT1 провалила тест на прыжок.
        // почему не обойтись без отдельного класса стены а просто добавить процедуру в класс Man , Cat , Robot
        competitor.jump(height);
    }
}

