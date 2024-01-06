public class Car {
    
    private int numberOfSeats;
    private String engineType;
    private boolean tripComputer;
    private boolean gps;
    
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public boolean isTripComputer() {
        return tripComputer;
    }
    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }
    public boolean isGps() {
        return gps;
    }
    public void setGps(boolean gps) {
        this.gps = gps;
    }
    @Override
    public String toString() {
        return "Car [numberOfSeats=" + numberOfSeats + ", engineType=" + engineType + ", tripComputer=" + tripComputer
                + ", gps=" + gps + "]";
    }  
    
    
}
