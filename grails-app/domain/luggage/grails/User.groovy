package luggage.grails

class User {

    static mapWith = "mongo"

    /**
     * TODO:: добавить проверку на уникальность ?
     */
    String username

    User() {
    }

    User(String username) {
        this.username = username
    }

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
