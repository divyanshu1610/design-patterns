public class Director {

    public void constructSportsCar(ICarBuilder<Car> builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer();
        builder.setGPS();
    }

    public void constructSportsCarManual(ICarBuilder<Manual> builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer();
        builder.setGPS();
    }

     public void constructSUVCar(ICarBuilder<Car> builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("4-Cylinders");
        builder.setGPS();
    }

    public void constructSUVCarManual(ICarBuilder<Manual> builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("4-Cylinders");
        builder.setGPS();
    }
}
