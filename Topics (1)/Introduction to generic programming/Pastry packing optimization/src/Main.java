/**
 * Pastry packing optimization
 * You were asked to help with Java programming for a pie company. At the moment, they bake pies, cakes, and tarts and pack them in nice boxes to sell. Unfortunately, their approach to box programming is quite outdated and each pie type requires its own box class. This approach is poorly scalable and will turn the situation into a nightmare with product range growth (imagine all these: ApplePieBox, StrawberryPieBox, etc.).
 * <p>
 * To avoid this, implement a universal Box class that will accommodate anything with put methods and give it back with get methods.
 */

/**
 Box for cakes
 */
class CakeBox {

    private Cake cake;

    public void put(Cake cake) {
        this.cake = cake;
    }

    public Cake get() {
        return this.cake;
    }
}

/**
 Box for pies
 */
class PieBox {

    private Pie pie;

    public void put(Pie pie) {
        this.pie = pie;
    }

    public Pie get() {
        return this.pie;
    }
}


/**
 Box for tarts
 */
class TartBox {

    private Tart tart;

    public void put(Tart tart) {
        this.tart = tart;
    }

    public Tart get() {
        return this.tart;
    }
}

/*
    Hundred more such boring classes OR ...
    magic class for everything everybody is waiting for
*/
class Box<T> {

    private T t;

    public T get() {
        return t;
    }

    public T put(T t) {
        this.t = t;
        return this.t;
    }
}

// Don't change classes below
class Cake {
}

class Pie {
}

class Tart {
}