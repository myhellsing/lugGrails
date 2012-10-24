package luggage.grails

class Tag  {

    static mapWith = "mongo"


    String name;

    static constraints = {
    }

    static mapping = {
        name index:true, indexAttributes: [unique:true]
    }
    @Override
    String toString() {
        return name;
    }




}
