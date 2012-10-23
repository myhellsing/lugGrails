package luggage.grails

class Product {

    static mapWith = "mongo"

    String name;

    static hasMany = [tags:Tag]

    static constraints = {
    }
}
