package q12;

record Point(int x, int y) {
    public boolean equals(Object obj) {
        if(obj != null) {
            return this.y == ((Point)obj).y + 1;
        }
        return false;
    }
}
