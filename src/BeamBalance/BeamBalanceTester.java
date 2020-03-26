package BeamBalance;

public class BeamBalanceTester {
    public static void main(String[] args) {
        BeamBalance beam = new BeamBalance(0,0);
        beam.display();
        beam.addWeighttoLeft(30);
        beam.display();
        beam.addWeighttoRight(40);
        beam.display();
        beam.addWeighttoLeft(10);
        beam.display();



    }
}
