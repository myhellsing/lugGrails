package luggage.grails

class Check {

    static mapWith = "mongo"

    Date date;
    User user;
    double discount;

    static hasMany = [expenses:Expense]

    static constraints = {
    }

    @Override
    String toString() {
        return date +getTotalCost();
    }

    double getTotalCost(){
        double totalCost = 0;
        discount = discount !=null ? discount : 0
        for (exp in expenses){
            totalCost+=exp.price;
        }

        return totalCost- discount;
    }
}
