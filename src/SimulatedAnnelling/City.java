package SimulatedAnnelling;

public class City {
    private int x;
    private int y;

    public City() {
        this.x=(int)(Math.random()*100);
        this.y=(int)(Math.random()*100);
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(City otherCity){
        int xDistance=Math.abs(otherCity.getX()-this.getX());
        int yDistance=Math.abs(otherCity.getY()-this.getY());
        return Math.sqrt((xDistance*xDistance) + (yDistance*yDistance) );
    }

    public String toString(){
        return getX()+" - "+getY();
    }



}
