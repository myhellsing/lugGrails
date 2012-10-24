package luggage.grails

class Brand {

    static mapWith = "mongo"


    String name;

    static constraints = {
    }

    @Override
    String toString() {
        return name;
    }


}
