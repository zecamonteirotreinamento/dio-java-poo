package model;

public class Space {

    private Integer actual;
    private final int expected;
    private final boolean fixed;

    public Space(int expected, boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;
        if (fixed) {
            actual = expected;
        }
    }

    public void setActual(Integer actual) {
        if (fixed) {
            return;
        }
        this.actual = actual;
    }

    public void clearSpace() {
        setActual(null);
    }

    public Integer getActual() {
        return actual;
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }
}
