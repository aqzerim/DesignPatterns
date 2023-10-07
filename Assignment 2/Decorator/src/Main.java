public class Main {

    public static void main(String[] args) throws Exception {

        Cappuccino cappuccino = new Cappuccino();
        Espresso espresso = new Espresso();

        MilkDecorator cappuccinoWithMilk = new MilkDecorator(new Cappuccino());
        ChocolateDecorator espressoWithChocolate = new ChocolateDecorator(new Espresso());

        cappuccino.getDesc();
        System.out.println(cappuccino.Price());

        espresso.getDesc();
        System.out.println(espresso.Price());

        cappuccinoWithMilk.getDesc();
        System.out.println(cappuccinoWithMilk.Price());

        espressoWithChocolate.getDesc();
        System.out.println(espressoWithChocolate.Price());

    }
}