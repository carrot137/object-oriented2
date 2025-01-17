package sample;

public class Car {
    private int speed;
    private String name;
    private boolean fig;

    

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFig() {
        return fig;
    }

    public void setFig(boolean fig) {
        this.fig = fig;
    }

    Car(){}

    Car(int speed, String name){
        this.speed=speed;
        this.name=name;

        }
        public void stepOnAccele(){
            speed+= 10;
            System.out.println("スピードが"+speed+"km/hに増えました");
        }
        public void stepOnBreake(){
            speed-=10;
            System.out.println("スピードが"+speed+"km/hに減りました");
        }
    

}
