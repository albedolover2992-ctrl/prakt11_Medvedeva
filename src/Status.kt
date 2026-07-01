enum class Status {
    Order_received,
    Preparing_dough,
    Making_sauce,
    Adding_toppings,
    Baking,
    Ready_for_delivery,
    Delivered;

    fun all_status() {
        println(
            "Заказ_приемный,\n" +
                    "Готовим_сыпку,\n" +
                    "Готовим_состав,\n" +
                    "Добавляем_ начинку,\n" +
                    "Выпечка,\n" +
                    "Готов_ к_доставке,\n" +
                    "Доставлен;"
        )
    }

    fun random() : Status
    {
        val random = kotlin.random.Random.nextInt(0, 6)
        when (random)
        {
            0 -> return Order_received
            1 -> return Preparing_dough
            2 -> return Making_sauce
            3 -> return Adding_toppings
            4 -> return Baking
            5 -> return Ready_for_delivery
            6 -> return Delivered
            else -> return Order_received
        }
    }

    fun Order () {
        try {
            println("Введите время с того, как вы сделали заказ: ")
            var i = readln().toInt()
            while (i < 0 || i > 120) {
                println("Напишите занаво: ")
                i = readln().toInt()
            }
            when (i) {
                10 -> {
                    println(Order_received)
                }

                15 -> {
                    println(Preparing_dough)
                }

                30 -> {
                    println(Making_sauce)
                }

                35 -> {
                    println(Adding_toppings)
                }

                40 -> {
                    println(Baking)
                }

                90 -> {
                    println(Ready_for_delivery)
                }

                120 -> {
                    println(Delivered)
                }
            }
        } catch (e: Exception) {
            println("Неверный формат данных")
        }
    }
    fun Percent (num : Status)
    {
        when (num)
        {
            Order_received -> println("Готовность 10%")
            Preparing_dough -> println("Готовность  20%")
            Making_sauce -> println("Готовность  35%")
            Adding_toppings -> println("Готовность  50%")
            Baking -> println("Готовность  65%")
            Ready_for_delivery -> println("Готовность  80%")
            Delivered -> println("Готовность  100%")
        }
    }
}