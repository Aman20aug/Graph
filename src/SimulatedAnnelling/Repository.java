package SimulatedAnnelling;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static List<City> cityList = new ArrayList<>();

    public static void addCity(City city) {
        cityList.add(city);
    }

    public static int numberoFCities() {
        return cityList.size();
    }

    public static City getCity(int index) {
        return cityList.get(index);
    }

}
