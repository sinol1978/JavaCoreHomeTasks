package lesson10.task04sizes;

public enum Sizes {
    XXS(32){
        @Override
        public String getDescription() {
            return "Kids size";
        }
    }, XS(34), S(36), M(38), L(40);

    private int size;

    Sizes(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getDescription(){
        return "Adult size";
    }
}
