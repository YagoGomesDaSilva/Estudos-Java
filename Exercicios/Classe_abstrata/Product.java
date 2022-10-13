public class Product extends Entity {
    
    private double price;
    private String name;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String fileNeme() {
        String str = "Product.txt";
        return str;
    }

    @Override
    public boolean validar() {
        if(this.price > 0.00){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "Price: " + this.price;
    }

}
