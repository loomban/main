import java.util.ArrayList;
import java.util.List;

public class UnitManager {
    private static List<Unit> units = new ArrayList<>();

    public static void addUnit(Unit unit) {
        units.add(unit);

    }

    public static Unit getUnit(int index) {
        // Subtract 1 because your numbering seems to be 1-based, not 0-based.
        return units.get(index -1);
    }
}
