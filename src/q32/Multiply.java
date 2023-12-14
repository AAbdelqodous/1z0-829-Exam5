package q32;

record Multiply(Calculator c1, Calculator c2) implements Calculator{
    @Override
    public int calc() {
        return c1.calc() * c2.calc();
    }
}
