import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Trio<T> {
    List<T> trioObjectList=new ArrayList<>();
    public T object1;
    public T object2;
    public T object3;
    private String name;

    public Trio(String name, T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
        this.name = name;
        Collections.addAll(trioObjectList,this.object1,this.object2,this.object3);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trio<?> trio = (Trio<?>) o;
        return this.trioObjectList.containsAll(trio.trioObjectList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trioObjectList);
    }

}
