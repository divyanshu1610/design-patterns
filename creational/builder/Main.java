public class Main {

    public static void main(String[] args) {
        
       Director director = new Director();
       ICarBuilder<Car> carBuilder =  new CarBuilder();
       ICarBuilder<Manual> carManualBuilder = new CarManualBuilder();

    
       // Build a sports car
       director.constructSportsCar(carBuilder);
       Car sportsCar = carBuilder.build();

       director.constructSportsCarManual(carManualBuilder);
       Manual sportsCarManual = carManualBuilder.build();
       
       System.out.println("Sports Car: " + sportsCar);
       System.out.println("Sports Car Manual: " +  sportsCarManual);


       // Build a SUV
       director.constructSUVCar(carBuilder);
       Car suvCar = carBuilder.build();

       System.out.println("SUV Car: " + suvCar);

    }
}
