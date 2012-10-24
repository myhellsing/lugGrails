package luggage.grails

class Tag extends Base {


    static mapping = {
        name index:true, indexAttributes: [unique:true]
    }


}
