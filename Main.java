/**
 * Runs the Balloon and Spike demo.
 */
public final class Main {

    /** Private constructor to prevent instantiation. */
    private Main() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Executes the main program.
     *
     * @param args Command line arguments.
     */
    public static void main(final String[] args) {

        Balloon b = new Balloon(5, 10, "Red");

        System.out.println(
            "Balloon starting position: (" + b.getX()
            + ", " + b.getY() + ")"
        );

        System.out.println("Balloon starting color: " + b.getColor());

        b.move(3, -2);

        System.out.println(
            "Balloon after moving: (" + b.getX()
            + ", " + b.getY() + ")"
        );

        b.setColor("Blue");

        System.out.println("Balloon color after change: " + b.getColor());

        Spike s = new Spike(0, 0);

        System.out.println(
            "\nSpike starting position: (" + s.getX()
            + ", " + s.getY() + ")"
        );

        s.move(8, 8);

        System.out.println(
            "Spike after moving: (" + s.getX()
            + ", " + s.getY() + ")"
        );

        if (s.getX() == b.getX() && s.getY() == b.getY()) {
            b.pop();
        } else {
            System.out.println("No collision yet.");
        }
    }
}
