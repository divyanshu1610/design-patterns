public class CarManualBuilder implements ICarBuilder<Manual> {

    private Manual manual;
    
    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();      
    }

    @Override
    public void setSeats(int numberOfSeats) {
        this.manual.setNumberOfSeats(numberOfSeats);
    }

    @Override
    public void setEngine(String engineType) {
        this.manual.setEngineType(engineType);
    }

    @Override
    public void setTripComputer() {
        this.manual.setTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.manual.setGps(true);
    }

    @Override
    public Manual build() {
        return this.manual;
    }
    
}
