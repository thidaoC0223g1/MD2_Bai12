import java.time.LocalDate;
import java.util.Comparator;


public class Product implements Comparator<Product> {
    private String id;
    private String name;
    private int price;
    private LocalDate date;


    public Product() {
    }

    public Product(String id, String name, int price, LocalDate date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public int compare(Product i1, Product i2) {
        if (i1.getPrice() > i2.getPrice()) {
            return 1;
        } else if (i1.getPrice() == i2.getPrice()) {
            return 0;
        }
        return -1;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
