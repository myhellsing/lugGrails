package luggage.grails

class SummaryController {

    def index() {
        def checks =Check.getAll()
        def totalCost=0;
        for (check in checks){
            totalCost+=check.totalCost;
        }
        [checks : checks,totalCost:totalCost]
    }
}
