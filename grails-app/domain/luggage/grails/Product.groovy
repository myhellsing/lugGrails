package luggage.grails

class Product extends Base {

    Brand brand;
    static hasMany = [tags:Tag]
}
