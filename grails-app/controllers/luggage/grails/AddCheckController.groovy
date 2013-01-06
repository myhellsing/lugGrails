package luggage.grails

class AddCheckController {

    def index() {

    }

    def addCheck() {
        def check = new Check();
        check.user = User.findByUsername(params.user) != null ? User.findByUsername(params.user) : new User(params.user);
        check.date = Date.parse("dd.MM.yyyy", params.date)
        check.discount = (params.discount != null && !params.discount.isEmpty()) ? Double.parseDouble(params.discount) : 0;
        check.expenses = [];
        for (int i = 0; i < params.list("product").size(); i++) {
            if (params.list('product').get(i) != "" || params.list('price').get(i) != "") {
                def expense = new Expense(params.list('product').get(i), params.list('price').get(i));
                check.expenses.add(expense);
            }
        }
        check.save();
        render(view: "index")
    }
}
