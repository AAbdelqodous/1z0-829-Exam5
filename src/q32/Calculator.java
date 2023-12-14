package q32;

sealed interface Calculator permits Add, Multiply, Negate {
    int calc();
}
