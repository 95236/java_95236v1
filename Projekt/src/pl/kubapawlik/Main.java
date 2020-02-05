package pl.kubapawlik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> data = readStringFromUser();
        System.out.println("\nWprowadzony ci�g znak�w: " + data);

        List<Integer> numbers = DataParser.convertStringsToNumbers(data);
        System.out.println("\nTablica liczb: " + Arrays.toString(numbers.toArray()));

        List<Tuple> tuples = DataParser.convertNumbersToTuples(numbers);
        Collections.sort(tuples);

        System.out.println("Posortowane dane: ");
        for (Tuple tuple : tuples) {
            System.out.println(tuple);
        }
    }

    public static List<String> readStringFromUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wprowad� liczb� (znak N ko�czy wprowadzanie danych): ");
        String str = "";
        List<String> data = new ArrayList<>();
        while (!(str = reader.readLine()).equals("N")) {
            data.add(str);
            System.out.print("Wprowad� liczb� (znak N ko�czy wprowadzanie danych): ");
        }
        return data;
    }
}
