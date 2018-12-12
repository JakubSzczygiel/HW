import java.util.Objects;

public class Trio<T> {
    public T object1;
    public T object2;
    public T object3;
    private String name;

    public Trio(String name, T object1, T object2, T object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trio<?> trio = (Trio<?>) o;
        return Objects.equals(object1, trio.object1) &&
                Objects.equals(object2, trio.object2) &&
                Objects.equals(object3, trio.object3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object1, object2, object3);
    }

}
