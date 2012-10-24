package luggage.grails

class Product  {

    static mapWith = "mongo"

    Brand brand;
    static hasMany = [tags:Tag]


    String name;

    static constraints = {
    }

    @Override
    String toString() {
        return name;
    }
}
