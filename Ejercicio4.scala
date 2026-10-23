case class Inventario(
    producto: String,
    cantidad: Int
)

object Ejercicio4Main{

    def agregar(inventario: Inventario, cantidad: Int): Inventario = {
        inventario.copy(cantidad = inventario.cantidad + cantidad)
    }

    def main(args: Array[String]): Unit = {
        val invOriginal = Inventario("Auricular", 10)
        val invNuevo = agregar(invOriginal, 5)
        println(s"Original:    $invOriginal")
        println(s"Actualizado: $invNuevo")
    }
}