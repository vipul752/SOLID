package LLD.abstractClass;

public class Macbook extends Product{
    @Override
    public double calculateDiscount() {
        return 10.0;
    }

    @Override
    public void termAndCondition() {
        System.out.println("Macbook Terms and Conditions");
    }
}
