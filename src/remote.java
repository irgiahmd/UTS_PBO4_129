

class RemoteControlCar {
    private int speed;
    private int direction;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void moveForward() {
        System.out.println("Mobil bergerak maju dengan kecepatan " + speed + " km/h dan arah " + direction + " derajat.");
    }

    public void moveBackward() {
        System.out.println("Mobil bergerak mundur dengan kecepatan " + speed + " km/h dan arah " + direction + " derajat.");
    }

    public void turnLeft() {
        System.out.println("Mobil belok kiri dengan arah " + (direction - 90) + " derajat.");
    }

    public void turnRight() {
        System.out.println("Mobil belok kanan dengan arah " + (direction + 90) + " derajat.");
    }
}
