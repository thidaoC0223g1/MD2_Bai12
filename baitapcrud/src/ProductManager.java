import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class ProductManager{
    ArrayList<Product> list;


    public ProductManager() {
        list = new ArrayList<>();
    }


    public void addproduct() {
        Product product = new Product();
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao id san pham");
        String id = input.nextLine();
        product.setId(id);
        System.out.println("nhap vao ten san pham");
        String name = input.nextLine();
        product.setName(name);
        System.out.println("nhap vao gia san pham");
        String inputprice = input.nextLine();
        int price = Integer.parseInt(inputprice);
        product.setPrice(price);
        System.out.println("nhap vao ngay san xuat san pham");
        String inputdate = input.nextLine();
        LocalDate date = LocalDate.parse(inputdate, DateTimeFormatter.ISO_DATE);
        product.setDate(date);
        list.add(product);
    }

    public void setproduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao id san pham can sua");
        String id = input.nextLine();
        System.out.println("nhap vao ten san pham can sua");
        String name = input.nextLine();
        System.out.println("nhap vao gia san pham can sua");
        String inputprice = input.nextLine();
        int price = Integer.parseInt(inputprice);
        System.out.println("nhap vao ngay san xuat san pham can sua");
        String inputdate = input.nextLine();
        LocalDate date = LocalDate.parse(inputdate, DateTimeFormatter.ISO_DATE);
        boolean check = true;
        for (Product v : list) {
            if (id.equals(v.getId())) {
                v.setName(name);
                v.setPrice(price);
                v.setDate(date);
            } else check = false;
        }
        if (!check) {
            System.out.println("khong co san pham can sua");
        }
    }

    public void delproduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao id san pham muon xoa");
        String id = input.nextLine();
        list.removeIf(i -> i.getId().equals(id));
    }


    public void searchByName() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap vao ten san pham can tim");
        String name = input.nextLine();
        for (Product v : list) {
            if (name.equals(v.getName())) {
                System.out.println("san pham can tim la " + v);
            }
        }
    }

    public void display() {
        for (Product v : list) {
            System.out.println(v.toString());
        }
    }
    public void increaseByPrice(){
       list.sort(new Product());
       for(Product i: list){
           System.out.println(i);
       }
        }
    public void decreaseByPrice(){
        list.sort((Product i1, Product i2) -> i2.getPrice()-i1.getPrice());
        for(Product i: list){
            System.out.println(i);
        }
    }


}
