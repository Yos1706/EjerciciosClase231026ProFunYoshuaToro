object Ejercicio2Main{
    def posicion(punto: (Int,Int)): String = punto match{
        case (0, 0) => "Origen"
        case (0, y) => "Eje Y"
        case (x, 0) => "Eje X"
        case (x, y) => "Otro punto"
    }

    def main(args: Array[String]): Unit = {
        val p1 = (0,0)
        val p2 = (0,5)
        val p3 = (7,0)
        val p4 = (5,6)
        println(posicion(p1))
        println(posicion(p2))
        println(posicion(p3))
        println(posicion(p4))
    }
}