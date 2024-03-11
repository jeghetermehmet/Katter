public class Katt implements Comparable<Katt>{
    String navn;
    int alder;

    Katt(String navn, int alder){
        this.navn = navn;
        this.alder = alder;
    }
    @Override
    public int compareTo(Katt other){
        if(this.alder > other.alder){
            return 1;
        } else if (this.alder < other.alder){
            return -1;
        } return 0;
    }

    @Override
    public String toString(){
        return "Katten " + navn + " alder: " +  alder;
    }

    
}