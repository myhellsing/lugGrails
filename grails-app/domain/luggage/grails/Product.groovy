package luggage.grails

class Product  {

    static mapWith = "mongo"

    Brand brand;
    static hasMany = [tags:Tag]


    String name;

    Product() {
    }

    Product( String name,Brand brand) {
        this.brand = brand
        this.name = name
    }

    static constraints = {
        brand(nullable: true)
    }

    @Override
    String toString() {
        return name + " " + brand?.name;
    }
}
