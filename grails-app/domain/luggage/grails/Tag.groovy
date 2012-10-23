package luggage.grails

class Tag {

    static mapWith = "mongo"

    String name;

    static mapping = {
        name index:true, indexAttributes: [unique:true]
    }


    static constraints = {
    }

}
