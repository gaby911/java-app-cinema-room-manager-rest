package cinema.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CinemaService {
    public Object getSeatsInfo() {
        int rows = 9;
        int columns = 9;

        List<Map<String, Integer>> seatList = generateSeats(rows, columns);

        return Map.of(
                "rows", rows,
                "columns", columns,
                "seats", seatList
        );
    }

    private List<Map<String, Integer>> generateSeats(int rows, int columns) {
        List<Map<String, Integer>> seatsList = new ArrayList<>();

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= columns; col++) {
                seatsList.add(Map.of("row", row, "column", col));
            }
        }
        return seatsList;
    }
}
