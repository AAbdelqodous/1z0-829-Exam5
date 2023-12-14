package q32;

record Negate(int value) implements Calculator{
    @Override
    public int calc() {
        return -value;
    }
}
