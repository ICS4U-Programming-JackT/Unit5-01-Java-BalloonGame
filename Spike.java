/**
 * Represents a spike with a position.
 */
public final class Spike {

    /** X position of the spike. */
    private int x;

    /** Y position of the spike. */
    private int y;

    /**
     * Creates a new spike.
     *
     * @param xPos The initial x position.
     * @param yPos The initial y position.
     */
    public Spike(final int xPos, final int yPos) {
        this.x = xPos;
        this.y = yPos;
    }

    /**
     * Moves the spike by the given offset.
     *
     * @param dx Change in x.
     * @param dy Change in y.
     */
    public void move(final int dx, final int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Gets the spike's x position.
     *
     * @return x position.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the spike's y position.
     *
     * @return y position.
     */
    public int getY() {
        return this.y;
    }
}
