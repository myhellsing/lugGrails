package luggage.grails

class Brand {

    static mapWith = "mongo"


    String name;

    static constraints = {
    }

    Brand() {
    }

    Brand(String name) {
        this.name = name
    }

    @Override
    String toString() {
        return name;
    }


}
