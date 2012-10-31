package luggage.grails

class Expense {

    static mapWith = "mongo"

    Product product;
    long quantity;
    double price;

    static constraints = {
    }

    @Override
    String toString() {
        return product.toString()+" " + quantity +" "+ price;
    }
}
