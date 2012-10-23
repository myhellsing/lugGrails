package luggage.grails

class ProductItem {
    static mapWith = "mongo"

    String location;
    double price;
    Product product;

    static constraints = {
    }
}
