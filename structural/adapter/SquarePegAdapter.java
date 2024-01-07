package structural.adapter;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg peg) {
        this.squarePeg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (this.squarePeg.getWidth() * Math.sqrt(2) / 2);
    }

}
