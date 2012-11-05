var cnt =0;

function addExpense(){
var next = $('#expense_tr_'+cnt).clone();
cnt++;
next.attr("id",'expense_tr_'+cnt);
$('#expense_tr_'+(cnt-1)).parent().append(next);
}