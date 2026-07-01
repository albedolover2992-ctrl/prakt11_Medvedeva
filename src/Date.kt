enum class Date {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public fun All_days ()
    {
        println("Понедельник, Вторник, Cреда, Четверг, Пятница, Суббота, Воскресенье")
    }

    fun random () : Date
    {
        val random = kotlin.random.Random.nextInt(0, 6)
        when (random)
        {
            0 -> return Date.Monday
            1 -> return Date.Tuesday
            2 -> return Date.Wednesday
            3 -> return Date.Thursday
            4 -> return Date.Friday
            5 -> return Date.Saturday
            6 -> return Date.Sunday
            else -> Date.Monday
        }
        return random()
    }

    fun Number (date : Date)
    {
        when
        {
            date == Monday -> println(1)
            date == Tuesday -> println(2)
            date == Wednesday -> println(3)
            date == Thursday -> println(4)
            date == Friday -> println(5)
            date == Saturday -> println(6)
            date == Sunday -> println(7)
        }
    }

    fun Work (date : Date) : Boolean
    {
        when (date)
        {
            Date.Monday -> return true
            Date.Tuesday -> return true
            Date.Wednesday -> return true
            Date.Thursday -> return true
            Date.Friday -> return true
            Date.Saturday -> return false
            Date.Sunday -> return false
        }
    }
}