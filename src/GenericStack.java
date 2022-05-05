public class GenericStack {
    private static final int CAPACIDAD_INICIAL = 5;
    private static final int TOP = 0;

    private CustomCollection collection = new CustomCollection(CAPACIDAD_INICIAL);

    public void push(int numeros) {
        collection.insert(numeros, TOP);
    }

    public int pop() {
        Object delete = collection.delete(TOP);
        int deleteInt = (Integer)delete;
        return deleteInt;
    }

    public int length() {
        return collection.length();
    }
    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < collection.length(); i++) {
            out += collection.getElement(i).toString();
            out +=" ";

        }
        return out;
    }
}
