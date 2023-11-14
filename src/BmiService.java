public class BmiService {
    public int calculate(float heightM, int weightKg) {
        float indexKg = ((weightKg / (heightM * heightM)));

        return (int) indexKg;

    }


}

