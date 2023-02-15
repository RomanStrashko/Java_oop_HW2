import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int max_val;
    private List<Product> list = new ArrayList<>();

    public VendingMachine(int max_val) {
        this.max_val = max_val;
    }

    public void setMax_val(int max_val){
        this.max_val = max_val;
    }
    public int getMax_val(){
        return max_val;
    }
    public List<Product> getList(){
        return list;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "max_val=" + max_val +
                ", list=" + list +
                '}';
    }

    public void add(Product product){
        if (list.size() < max_val){
            list.add(product);
        }else {
            System.out.println("Автомат переполнен! Повторите попытку позже!");
        }
    }

    public Product getProductByName(String name) throws Exception{
        for (Product product: list){
            if (product.getName().equals(name)){
                list.remove(product);
                return product;
            }
        }
        throw new Exception("Такого продукта нету!");
    }
    public Product getProductCost(int cost) throws Exception{
        for (Product product: list){
            if (product.getPrice() == cost){
                list.remove(product);
                return product;
            }

        }
        throw new Exception("Такого продукта нету!");
    }
}
