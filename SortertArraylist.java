import java.util.ArrayList;

public class SortertArraylist<T extends Comparable<T>> {
    ArrayList<T> list = new ArrayList<>();

    void settInn (T data){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).compareTo(data) > 0){
                list.add(i, data);
                return;
            }
        }
        list.add(data);

    }
    T hentFoerste(){
         return list.remove(0);
    }
}
