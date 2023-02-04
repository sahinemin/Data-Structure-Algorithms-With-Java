public class SquareRootProgression extends Progression <Double>  {
    /** Constructs square root progression with fixed number */
    public SquareRootProgression() { this(65536); }        // start at 1 with base of 2


    /** Constructs square root progression with selected number */
    public SquareRootProgression(double start) {
        super(start);
    }

    /** Takes square root of the current value */
    protected void advance() {
        current = Math.sqrt(current);// multiply current by the geometric base
    }

}
