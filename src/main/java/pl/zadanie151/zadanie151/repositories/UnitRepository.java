package pl.zadanie151.zadanie151.repositories;

import org.springframework.stereotype.Repository;
import pl.zadanie151.zadanie151.model.Unit;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UnitRepository {

    private List<Unit> units;

    public UnitRepository() {
        units = new ArrayList<>();
        units.add(new Unit("Proszek", "100", "food"));
        units.add(new Unit("Kurtka", "199", "cloth"));
        units.add(new Unit("Spodnie", "399", "cloth"));
        units.add(new Unit("Kiełbasa", "9", "food"));
        units.add(new Unit("Masło", "12.99", "food"));
        units.add(new Unit("Skarpety", "24.99", "cloth"));
        units.add(new Unit("Majtki", "9.99", "cloth"));
        units.add(new Unit("Parówka", "3", "food"));
    }

    public List<Unit> getAllUnits() {
        return units;
    }

    public void add(Unit unit) {
        units.add(unit);
    }
}
