package luggage.grails

class User {

    static mapWith = "mongo"

    /**
     * TODO:: добавить проверку на уникальность ?
     */
    String username

    static mapping = {
        username index:true, indexAttributes: [unique:true]
    }

    static constraints = {
    }

    @Override
    String toString() {
        return username;
    }
}
