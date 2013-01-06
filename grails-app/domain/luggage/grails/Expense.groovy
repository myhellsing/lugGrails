package luggage.grails

class Expense {

    static mapWith = "mongo"

    String product;
    double price;

    static constraints = {
    }

    Expense() {
    }

    Expense(String product, String price) {
        this.product = product
        this.price = Double.parseDouble(price)
    }

    @Override
    String toString() {
        return product + price;
    }
}
