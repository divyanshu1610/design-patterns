public interface ICarBuilder<T> {
    void reset();
    void setSeats(int numberOfSeats);
    void setEngine(String engineType);
    void setTripComputer();
    void setGPS();
    T build();
}
