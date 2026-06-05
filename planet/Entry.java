package planet;

import java.util.*;

public class Entry {
    public static void main(String[] args) {
        List<SolarPlanet> result = new ArrayList<>(Arrays.asList(SolarPlanet.values()));
        Collections.sort(result, (SolarPlanet a, SolarPlanet b) -> {
            if (a.getPost() < b.getPost()) {
                return -1;
            } else if (a.getPost() > b.getPost()) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(result);
    }
}
