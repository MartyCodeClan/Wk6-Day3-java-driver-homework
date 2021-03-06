package driver_management;
import behaviours.*;

public class DodgemCar extends Vehicle implements Driveable {

  private int seatsNumber;

  public DodgemCar(int averageSpeed, int seatsNumber) {
    super(averageSpeed);
    this.seatsNumber = seatsNumber;
  }

  public int amountSeats(){
    return this.seatsNumber;
  }
}