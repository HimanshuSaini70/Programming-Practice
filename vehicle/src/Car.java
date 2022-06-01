public class Car extends Vehicle   {
    private int wheel;
    private int door;
    private int gear;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheel, int door, int gear, boolean isManual ) {
        super(name, size);
        this.wheel = wheel;
        this.door = door;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }
    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear: Changed to "+ this.currentGear  + " gear.");
    }
    public void changeVelocity(int speed ,int direction){
        System.out.println("Car.ChangeVelocity(): moving at velocity  "+ speed +" in direction "+ direction);
        move(speed,direction);

    }
}
