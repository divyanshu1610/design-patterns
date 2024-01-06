public class CarBuilder implements ICarBuilder<Car> {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();      
    }

    @Override
    public void setSeats(int numberOfSeats) {
        this.car.setNumberOfSeats(numberOfSeats);
    }

    @Override
    public void setEngine(String engineType) {
        this.car.setEngineType(engineType);
    }

    @Override
    public void setTripComputer() {
        this.car.setTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.car.setGps(true);
    }

    @Override
    public Car build() {
        return this.car;
    }
    
}
