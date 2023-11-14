public class BmiService {
    public int calculate(float heightM, int weightKg) {
        float indexKg = ((weightKg / (heightM * heightM)));
        if (heightM * heightM > 0) {
        }
        return (int) indexKg;

    }


}

