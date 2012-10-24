package luggage.grails

class Check {

    static mapWith = "mongo"

    String location;
    Date date;
    User user;

    static hasMany = [expenses:Expense]

    static constraints = {
    }

    @Override
    String toString() {
        return location+" " +date;
    }
}
