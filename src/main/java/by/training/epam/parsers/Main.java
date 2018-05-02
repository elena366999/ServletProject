package by.training.epam.parsers;

import by.training.epam.entities.Candy;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        MySAXParser mySAXParser = new MySAXParser();
        List<Candy> candies = mySAXParser.createCandiesList();
        for (Candy c:candies) {
            System.out.println(c);
        }
    }
}
