package hu.nive.ujratervezes.prime;

public class PrimeCalculator {
    public int min(int[] inputArr) throws IllegalArgumentException {
        if (inputArr == null || inputArr.length == 0) throw new IllegalArgumentException();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < min) {
                min = inputArr[i];
            }
        }
        return min;
    }

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i < num; i++)
            if (num % i == 0)
                return false;
        return true;
    }

    public int[] multiplyPrimesWithMinimum(int[] inputArr) throws IllegalArgumentException {
        if (inputArr == null) throw new IllegalArgumentException();
        if (inputArr.length == 0) return new int[]{};
        int[] out = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            int rtv = inputArr[i];
            if (isPrime(rtv)) {
                out[i] = min(inputArr) * inputArr[i];
            } else {
                out[i] = inputArr[i];
            }
        }
        return out;
    }


}
