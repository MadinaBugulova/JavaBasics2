package Class22;

public interface MoveAble {


        public abstract void move();
    }
    interface  WashAble {
    void wash();
    }

    class Dog implements MoveAble, WashAble{

    public void move(){

        System.out.println("Dogs can jump run and can move");
    }

        @Override
        public void wash() {
            System.out.println("You can safely wash a dog");
        }
    }
class Car implements MoveAble{

    @Override
    public void move() {
        System.out.println("Car can move forward backwards and can go in circles");
    }
}