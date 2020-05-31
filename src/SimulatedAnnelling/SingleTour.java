package SimulatedAnnelling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleTour {
private List<City> cities=new ArrayList<>();
private double distance=0;

public List<City> getCities(){
    return cities;
}

public int getSize(){
    return cities.size();
}

    public SingleTour() {
        for(int i=0;i<Repository.numberoFCities();++i)
            cities.add(null);
    }

    public SingleTour(List<City> cities) {
        List<City> currentTour=new ArrayList<>();

        for(int i=0;i<cities.size();i++)
            currentTour.add(null);

        for(int i =0;i<cities.size();i++)
            currentTour.set(i,cities.get(i));

        this.cities=currentTour;
    }

    public double getDistance(){
        if(distance==0){
            int tourDistance=0;
            for(int i=0;i<cities.size();i++){
                City fromCity=getCity(i);
                City destinationCity;
                if(i+1<Repository.numberoFCities()){
                    destinationCity=getCity(i+1);
                }
                else{
                    destinationCity=getCity(0);
                }

                tourDistance+=fromCity.distanceTo(destinationCity);
            }
            this.distance=tourDistance;
            }

        return this.distance;
    }


    public void generateIndividual(){
        for(int cityIndex=0;cityIndex<Repository.numberoFCities();cityIndex++)
            setCity(Repository.getCity(cityIndex),cityIndex);

        Collections.shuffle(cities);
    }

    public void setCity(City city, int cityIndex) {
        cities.set(cityIndex,city);
    }

    public City getCity(int index){
        return cities.get(index);
    }

    @Override
    public String toString() {
        String s="";

        for(int i=0;i<cities.size();i++)
            s+=getCity(i) +" --> ";

        return s;
    }
}
