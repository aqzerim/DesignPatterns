
public class DonateAdapter implements ATM{
    private Donate donate;

    public DonateAdapter(Donate donate){
        this.donate = donate;
    }



    @Override
    public void convertToRadianitePoints() {
        System.out.println("ATM machine successfully converted dollars to Radianite Points");

        donate.makeDonate();
    }
}
