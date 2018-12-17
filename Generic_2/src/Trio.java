import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Trio<T> {
    List<T> trioObjectList = new ArrayList<>();
    List<T> tempArray = new ArrayList<>();
    public T object1;
    public T object2;
    public T object3;
    private String name;


    public Trio(String name, T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
        this.name = name;
        Collections.addAll(trioObjectList, this.object1, this.object2, this.object3);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trio<T> trio = (Trio<T>) o;
        tempArray.clear();
        tempArray.addAll(trioObjectList);
        return (this.tempArray.remove(trio.object1) &&
                this.tempArray.remove(trio.object2) &&
                this.tempArray.remove(trio.object3));
    }


    @Override
    public int hashCode() {
        return (object1.hashCode() * object2.hashCode() * object3.hashCode()) + object1.hashCode() + object2.hashCode() + object3.hashCode();
    }

}
