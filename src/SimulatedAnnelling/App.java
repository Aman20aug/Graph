package SimulatedAnnelling;

public class App {

    public static void main(String[] args) {
        System.out.println("City co-ordinates ");
        for (int i=0;i<100;i++){
            City city=new City();
            System.out.println(i+1+". "+city);
            Repository.addCity(city);
        }

        SimulatedAnneling simulatedAnneling=new SimulatedAnneling();
        System.out.println(simulatedAnneling.getBest());

    }
}
