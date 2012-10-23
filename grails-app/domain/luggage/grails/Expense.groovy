package luggage.grails

class Expense {

    static mapWith = "mongo"

    User user;
    ProductItem productItem;
    long quantity;

    static constraints = {
    }
}
