/**

Object-based box class that requires casting every time you want to get some specific stuff from it, e.g.:

    Box cakeBox = new Box();
    cakeBox.put(new Cake());
    // Without casting only object can be retrieved out of the box
    Cake cake = (Cake) cakeBox.get();

Casting is not desirable and can fall at runtime, could you create more... generic solution?

*/

/*
* You were asked to help with Java programming in a company that makes boxes. Their former Java programmer created a Box class that uses objects and requires casting. Now everyone knows that casting is slow and error-prone and that is why the programmer got fired. Now your job is to create Box implementation that will not require casting but provide type-checking at compile time.
*/
class Box<T> {

    private T item;

    public void put(T item) {
    	this.item = item;
    }

    public T get() {
        return this.item;
    }

}