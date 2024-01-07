package structural.adapter;

public class Main {
    public static void main(String[] args) {

        RoundHole roundHole = new RoundHole(3);
        RoundPeg roundPeg = new RoundPeg(4);

        System.out.println("Round Hole : " + roundHole.getRadius());
        System.out.println("Round Peg " + roundPeg.getRadius() + " fits " + roundHole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(1);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println("Square Peg " + squarePeg.getWidth() + " fits " + roundHole.fits(squarePegAdapter));

    }
}
