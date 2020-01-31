package Obstacles;

import Partaker.Partaker;

public class Treadmill extends Obstacle{
    int distance;

    public Treadmill(int height) {
        this.distance = height;
    }

    public void Treadmill(int distanceWho, String name) {
        if (distanceWho > distance) {
            System.out.println(name + " Перепрыгнул");
        } else {
            System.out.println(name + " НЕ перепрыгнул");
        }
    }

    @Override
    public void doIt(Partaker competitor) {
        //не понимаю что это должно делать и как связывать+
        //не понимаю что это должно делать и как связывать
        // не понимаю как это связывает что бы при выполнении писалось это: CAT1 провалила тест на прыжок.
        // почему не обойтись без отдельного класса стены а просто добавить процедуру в класс Man , Cat , Robot
        competitor.run(distance);

    }
}
