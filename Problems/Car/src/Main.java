class Car {

    int yearModel;
    String make;
    int speed;

    public void accelerate() {
        this.speed = speed + 5;
    }

    void brake() {

        if (speed > 4) {
            this.speed -= 5;
        } else if (speed > 0 && speed < 4) {
            this.speed = 0;
        }
    }
}