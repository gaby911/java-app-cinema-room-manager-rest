/*Initialize an object of the non-generic class Holder to make the code in the main method compile.

The program should print 256*/
class Holder {
    private Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}

class Main {
    public static void main(String... args) {
        Holder holder = new Holder();
        holder.set(256);

        // correct the line to make the code compile
        Integer value = (Integer) holder.get();

        // do not change
        System.out.println(value);
    }
}