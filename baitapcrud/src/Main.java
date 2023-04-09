import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager list= new ProductManager();
        Scanner input = new Scanner(System.in);
        System.out.println(" Menu ");
        System.out.println("1: Them thong tin san pham");
        System.out.println("2: Sua thong tin san pham");
        System.out.println("3: Xoa thong tin san pham");
        System.out.println("4: Hien thi danh sach san pham");
        System.out.println("5: Tim kiem san pham theo ten");
        System.out.println("6: Sap xep san pham theo thu tu tang dan");
        System.out.println("7: Sap xep san pham theo thu tu giam dan");
        System.out.println("0; Thoat ra khoi chuong trinh");

        while (true) {
            System.out.println("--------Nhap lua chon cua ban");
            String n= input.nextLine();
            switch(n){
                case "1": list.addproduct();break;
                case "2": list.setproduct();break;
                case "3": list.delproduct();break;
                case "4": list.display();break;
                case "5": list.searchByName();break;
                case "6": list.increaseByPrice();break;
                case "7": list.decreaseByPrice();break;
                case "0":
                    System.out.println("say goodbye");
                    System.exit(0);
                default :
                    System.out.println(" xin vui long nhap mot so");


            }
        }


    }
}
