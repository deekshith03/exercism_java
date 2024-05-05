public class Lasagna {

    private static int totalMinutesInOven = 40;
    private static int preparationTime = 2;

    public int expectedMinutesInOven() {
        return this.totalMinutesInOven;
    }
    public int remainingMinutesInOven(int timeTakenSoFar) {
        return this.expectedMinutesInOven() - timeTakenSoFar;
    }

    public int preparationTimeInMinutes(int layers)
    {
        return preparationTime*layers;
    }

    public int totalTimeInMinutes(int layers, int timeTakenSoFar)
    {
        return this.preparationTimeInMinutes(layers)+timeTakenSoFar;
    }
}
