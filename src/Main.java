public class Main {
    public static void main(String[] args) {
        double fuelConsumptionPer100Km = 10.52;
        double volumeFuelInLiters = 50.34;
        double availableDistance = volumeFuelInLiters * 100 / fuelConsumptionPer100Km;
        System.out.println("Примерно оставшееся расстояние составляет " + Math.round(availableDistance) + " км");
    }
}
