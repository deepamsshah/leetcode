class ParkingSystem {
  int[] capacities = new int[4]; // we won't use the zeroth element
  int[] currentCounts = new int[4]; // we won't use the zeroth element

  public ParkingSystem(int big, int medium, int small) {
    capacities[1] = big;
    capacities[2] = medium;
    capacities[3] = small;
  }

  public boolean addCar(int carType) {
    if (currentCounts[carType] < capacities[carType]) {
      ++currentCounts[carType];
      return true;
    } else {
      return false;
    }
  }
}