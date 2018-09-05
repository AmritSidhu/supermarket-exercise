import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BasketTest {

    @Test
    public void ShouldReturnEmptyHashSetBasket(){
        Basket basket = new Basket();
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void ShouldAddProductByProductCode(){
        Basket basket = new Basket();
        basket.addProduct("FR1","Fruit Tea", 3.11);
        assertEquals("FR1", basket.getBasket().get(0).getProductCode());
        assertEquals("Fruit Tea", basket.getBasket().get(0).getProductName());
        assertEquals(3.11, basket.getBasket().get(0).getPrice());
    }

    @Test
    public void ShouldRemoveProductByProductCode(){
        Basket basket = new Basket();
        basket.addProduct("FR1","Fruit Tea", 3.11);
        basket.removeProduct("FR1");
        assertEquals(0, basket.getBasket().size());
    }

    @Test
    public void ShouldShowSumOfProductsInBasket(){
        Basket basket = new Basket();
        basket.addProduct("FR1","Fruit Tea", 3.11);
        basket.addProduct("SR1","Strawberries", 5.00);
        assertEquals(8.11, basket.showTotal());
    }

    @Test
    public void ShouldShowCurrentContentsOfProductsInBasket(){
        Basket basket = new Basket();
        basket.addProduct("FR1","Fruit Tea", 3.11);
        basket.addProduct("SR1","Strawberries", 5.00);
        assertEquals("Fruit Tea, Strawberries", basket.showContents());
    }

}