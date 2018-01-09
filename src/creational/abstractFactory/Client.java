package creational.abstractFactory;

public class Client {
    public static void main(String[] args) {
        IFactory product1 = new ConcreteFactory1();
        IProductA productA1 = product1.createProductA();
        IProductB productB1 = product1.createProductB();
        IFactory product2 = new ConcreteFactory2();
        IProductA productA2 = product2.createProductA();
        IProductB productB2 = product2.createProductB();

    }
}
