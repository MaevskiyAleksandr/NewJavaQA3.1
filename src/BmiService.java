public class BmiService {
    public int calculate(float heightM, int weightKg) {
        float indexKg;
        if (heightM * heightM >= 1) {
            indexKg = (weightKg / (heightM * heightM));
        } else {
            indexKg = 10;

        }
        return (int) indexKg;

    }


}

