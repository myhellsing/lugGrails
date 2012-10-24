package luggage.grails

class Base {

    static mapWith = "mongo"


    String name;

    static constraints = {
    }

    @Override
    String toString() {
        return name;
    }
}
