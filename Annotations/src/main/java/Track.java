import java.lang.reflect.Field;

@Exclude(composer = "Paulo Levi/W. Rangel,Unknown")
public class Track {

    private String name;

    private String composer;

    @AdditionalPrice(startWith = "Im", priceAdded = 100)
    private Double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    public void setPrice(double price) {

        this.price = adjustTrackPriceInCaseOfAdditionalPriceAnnotation(this, price);
    }


    public double getPrice() {
        return price;
    }

    private double adjustTrackPriceInCaseOfAdditionalPriceAnnotation(Track track, double price) {
        Field[] fields = track.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(AdditionalPrice.class)) {
                AdditionalPrice fieldAnnotation = field.getAnnotation(AdditionalPrice.class);
                if (track.name.startsWith(fieldAnnotation.startWith())) {
                    return price + fieldAnnotation.priceAdded();
                }
            }
        }
        return price;
    }

    @Override
    public String toString() {
        return composer == null ? String.format("Track: [%s]  with price [%s]", name, price) : String.format("Track: [%s] by [%s] with price [%s]", name, getComposer(), price);
    }
}