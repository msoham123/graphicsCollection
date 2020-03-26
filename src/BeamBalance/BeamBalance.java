package BeamBalance;

public class BeamBalance {
    double rightWeight,leftWeight;

    public BeamBalance(double rightWeight, double leftWeight){
        this.rightWeight =rightWeight;
        this.leftWeight = leftWeight;
    }

    public void addWeighttoLeft(double add){
        leftWeight+=add;
    }
    public void addWeighttoRight(double add){
        rightWeight+=add;
    }
    public void display(){
        if (leftWeight>rightWeight) System.out.println("Left side is down");
        else if (rightWeight>leftWeight) System.out.println("Right side is down");
        else System.out.println("Beam is balanced");
    }




}
