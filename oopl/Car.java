package oopl;

public abstract class Car {
    private carType model;
    Car (carType model){
        this.model = model;
    }
    public abstract void construct();
}
