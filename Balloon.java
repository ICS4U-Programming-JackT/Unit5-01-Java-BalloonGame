/**
 * Represents a balloon with a position, colour, and pop state.
 */
public final class Balloon {

    /** X position of the balloon. */
    private int x;

    /** Y position of the balloon. */
    private int y;

    /** Colour of the balloon. */
    private String color;

    /** Whether the balloon is popped. */
    private boolean popped;

    /**
     * Creates a new Balloon.
     *
     * @param xPos The initial x position.
     * @param yPos The initial y position.
     * @param startColor The initial colour of the balloon.
     */
    public Balloon(final int xPos, final int yPos, final String startColor) {
        this.x = xPos;
        this.y = yPos;
        this.color = startColor;
        this.popped = false;
    }

    /**
     * Moves the balloon by the given offset.
     *
     * @param dx Change in x.
     * @param dy Change in y.
     */
    public void move(final int dx, final int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Sets a new colour for the balloon.
     *
     * @param newColor The new colour.
     */
    public void setColor(final String newColor) {
        this.color = newColor;
    }

    /**
     * Pops the balloon.
     */
    public void pop() {
        this.popped = true;
        System.out.println("The balloon has popped!");
    }

    /**
     * Gets the balloon's x position.
     *
     * @return x position.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the balloon's y position.
     *
     * @return y position.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Gets the balloon's colour.
     *
     * @return colour.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Returns whether the balloon is popped.
     *
     * @return true if popped, false otherwise.
     */
    public boolean isPopped() {
        return this.popped;
    }
}
