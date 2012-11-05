package luggage.grails

class AddCheckController {

    def index() {

    }

    def addCheck(){
        def check = new Check();
        check.user = User.findByUsername(params.user) !=null ?  User.findByUsername(params.user) : new User(params.user);
        check.location = params.location;
        check.date = Date.parse("dd.MM.yyyy hh:ss",params.date)
        check.expenses=[];
        def expenses = [];
        expenses.addAll(params.expenses);
        for (expenseStr in expenses){
            def words = expenseStr.split("\\s+");
            if (words.length<3) return "false";
            def expense = new Expense();
            expense.quantity = Double.parseDouble(words[words.size()-2]);
            expense.price = Double.parseDouble(words[words.size()-1]);
            Brand brand = Brand.findByName(words[words.size()-3]) != null ? Brand.findByName(words[words.size()-3]) : new Brand(words[words.size()-3]);
            def name ="" // (words[0 .. words.size() - 3]).join(" ")
            for (int i=0;i<words.size()-3;i++){
                name+=words[i]+" ";
            }
            name = name.substring(0,name.length()-1)
            expense.product = Product.findByNameAndBrand(name,brand) !=null ? Product.findByNameAndBrand(name,brand) : new Product(name,brand);
            check.expenses.add(expense);
        }
        check.save();
       render(view: "index")
    }
}
