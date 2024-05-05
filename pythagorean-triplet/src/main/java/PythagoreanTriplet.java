import java.util.List;
import java.util.ArrayList;

public class PythagoreanTriplet {
    private int a;
    private int b;
    private int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || !(other instanceof PythagoreanTriplet)) {
            return false;
        }
        PythagoreanTriplet otherTriplet = (PythagoreanTriplet) other;
        return a == otherTriplet.a && b == otherTriplet.b && c == otherTriplet.c;
    }

    @Override
    public int hashCode() {
        return c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        int sum;
        int maxFactor = 0;
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }
        
        List<PythagoreanTriplet> build() {
             List<PythagoreanTriplet> result = new ArrayList<>();
            int limit = maxFactor == 0 ? sum : maxFactor;
            for (int i = 1; i < limit - 2; i++)
            {
                for (int j = i + 1; j <= limit - 1; j++)
                {
                    int k = sum - i - j;
                    if ( k <= limit && i * i + j * j == k * k)
                    {
                        result.add(new PythagoreanTriplet(i, j, k));
                    }
                }
            }
            return result;
        }
    }
}