package SimulatedAnnelling;

public class SimulatedAnneling {

    public SingleTour getBest() {
        return best;
    }

    SingleTour best;

    public SimulatedAnneling() {

        double temperature =1000;
        double coolingRate=0.003;

        SingleTour currentSingleTour=new SingleTour();
        currentSingleTour.generateIndividual();

        System.out.println("Initial Distance "+ currentSingleTour.getDistance() );

        best=new SingleTour(currentSingleTour.getCities());

        while(temperature>1){
            SingleTour newTour=new SingleTour(currentSingleTour.getCities());

            int randomIndex1=(int)(newTour.getSize()*Math.random());
            City city1=newTour.getCity(randomIndex1);

            int randomIndex2=(int)(newTour.getSize()*Math.random());
            City city2=newTour.getCity(randomIndex2);

            double currentEnergy=currentSingleTour.getDistance();
            double neighbour=newTour.getDistance();

            if(acceptanceProbablity(currentEnergy,neighbour,temperature) > Math.random()){
                currentSingleTour=new SingleTour(newTour.getCities());
            }
            if (currentSingleTour.getDistance() < best.getDistance()){
                best=new SingleTour(currentSingleTour.getCities());
            }

            temperature*=1-coolingRate;

        }
}



    private double acceptanceProbablity(double currentEnergy, double neighbour, double temperature) {
        if (currentEnergy<neighbour){
            return 1;
        }
        return Math.exp((currentEnergy-neighbour)/temperature);


    }
}
