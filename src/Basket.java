import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> basket = new ArrayList();
    private double totalBasketSum = 0;
    private String basketContents = "";

    public String getBasketContents() {
        return basketContents;
    }

    public void setBasketContents(String basketContents) {
        this.basketContents = basketContents;
    }

    public double getTotalBasketSum() {
        return totalBasketSum;
    }

    public void setTotalBasketSum(double totalBasketSum) {
        this.totalBasketSum = totalBasketSum;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public void addProduct(String productCode, String productName, double price){
        getBasket().add(new Product(productCode, productName, price));
    }

    public void removeProduct(String productCode) {
        for(int i = 0; i < getBasket().size(); i++){
            if(getBasket().get(i).getProductCode() == productCode ) {
                getBasket().remove(i);
            }
        }
    }

    public double showTotal(){
        for(int i = 0; i < getBasket().size(); i++){
            setTotalBasketSum(totalBasketSum += getBasket().get(i).getPrice());
        }
        return getTotalBasketSum();
    }

    public String showContents() {
        for(int i = 0; i < getBasket().size(); i++){
            if(getBasketContents() == ""){
                setBasketContents(basketContents += getBasket().get(i).getProductName());
            }
            else {
                setBasketContents(basketContents += ", " + getBasket().get(i).getProductName());
            }
        }
        return getBasketContents();
    }

    public void discount(){
        int count = 0;
        for(Product product : getBasket()){
            if(product.getProductCode() == "SR1"){
                count += 1;
            }
        }
        if(count >= 3){
            for(Product product : getBasket()){
                if(product.getProductCode() == "SR1"){
                    product.setPrice(4.50);
                }
            }
        }
    }

    public void bogof() {
        int count = 0;
        for(Product product : getBasket()){
            if(product.getProductCode() == "FR1"){
                count += 1;
                if (count == 2){
                    count = 0;
                    product.setPrice(0);
                }
            }
        }
    }
}
