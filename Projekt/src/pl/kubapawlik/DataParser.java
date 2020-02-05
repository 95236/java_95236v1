package pl.kubapawlik;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataParser {

    private static final String PRIME = "liczba pierwsza";
    private static final String POSITIVE = "liczba dodatnia";
    private static final String NEGATIVE = "liczba ujemna";

    public static List<Integer> convertStringsToNumbers(List<String> data) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : data) {
            try {
                if (str.endsWith(".0")) {
                    str = str.substring(0, str.indexOf("."));
                }
                numbers.add(Integer.parseInt(str));
            } catch (NumberFormatException ex) {
                System.out.println("Error parsing to Integer " + ex.getMessage());
            }
        }
        return numbers;
    }

    public static List<Tuple> convertNumbersToTuples(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> {
                    if (isPrime(number)) {
                        return new Tuple(number, PRIME);
                    } else if (number >= 0) {
                        return new Tuple(number, POSITIVE);
                    } else {
                        return new Tuple(number, NEGATIVE);
                    }
                }).collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
