import java.io.Console

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    try
    {
        var color : Color = Color.Red
        color = color.random()
        color.All_color()
        color.rgb(color)
        color.Warm(color)

        var date : Date = Date.Monday
        date = date.random()
        date.All_days()
        date.Number(date)
        date.Work(date)

        var pizza : Status = Status.Order_received
        pizza = pizza.random()
        pizza.all_status()
        pizza.Order()
        pizza.Percent(pizza)
    }
    catch (e: Exception)
    {
        println("Неверный формат данных")
    }
}