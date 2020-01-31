import Obstacles.Obstacle;
import Obstacles.Treadmill;
import Obstacles.Wall;
import Partaker.Cat;
import Partaker.*;
import Partaker.Partaker;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("CAT", 500, 500);
        cat1.jump();

        Wall wall = new Wall(600);
        wall.Wall(cat1.maxJump,cat1.name);

        Treadmill treadmill = new Treadmill(400);
        treadmill.Treadmill(cat1.maxRun,cat1.name);
        System.out.println("//////////////////////////////////////");
        ////////////////////////////////////////////////// сначала делал без интерфейса , но массивы понял мне так протсо не сделать.

        // Сам бы я такого не сделал
        Partaker[] partakers = {// это относительно понятно что за счет интерфейса мы можем создавать одновременно разные объекты от него
                new Cat("CAT1", 300, 300),
                new Man("MAN1", 400, 400),
                new Robot("ROBOT1", 500, 500)
        };
        Obstacle[] obstacles = {  // по аналогии вроде как
                new Wall(400),
                new Treadmill(600)
        };
        for ( Partaker c:partakers ) {  // не очень понял работу этого фора. что дает ""
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }
        for (Partaker c:partakers) {
            c.info();
        }

    }
}
