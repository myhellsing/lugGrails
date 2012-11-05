package luggage.grails

class SummaryController {

    def index() {
        def checks =Check.getAll()
        def totalCost=0;
        for (check in checks){
            for (exp in check.expenses){
                totalCost+=exp.price;
            }
        }
        [checks : checks,totalCost:totalCost]
    }
}
