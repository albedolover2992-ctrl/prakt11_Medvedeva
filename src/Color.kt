enum class Color {
    Red,
    Orange,
    Yellow,
    Green,
    Blue,
    Indigo,
    Violet;
    fun All_color ()
    {
        println("красный, оранжевый, жёлтый, зелёный, голубой, синий, фиолетовый")
    }

    fun random () : Color
    {
        val random = kotlin.random.Random.nextInt(0, 6)
        when (random)
        {
            0 -> return Red
            1 -> return Orange
            2 -> return Yellow
            3 -> return Green
            4 -> return Blue
            5 -> return Indigo
            6 -> return Violet
            else -> return Red
        }
    }

    fun rgb(color : Color) {
        if (color == Color.Red) {

            println("$color - Красный(#ff0000)")
        } else if (color == Color.Blue) {
            println("$color - Синий(#0000ff)")
        } else {
            println("$color - другой цвет")
        }
    }

    fun Warm (color : Color) : Boolean
    {
        when (color)
        {
            Color.Red ->  return true
            Color.Orange -> return true
            Color.Yellow -> return true
            Color.Green -> return true
            Color.Blue -> return false
            Color.Indigo -> return false
            Color.Violet -> return false
        }
    }
}