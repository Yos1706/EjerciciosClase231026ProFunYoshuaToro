case class Producto(
    nombre: String,
    precio: Double,
    stock: Int
)

object Ejercicio1Main{

    def clasificar(producto: Producto): String = producto match {
        case p if p.stock == 0 => "Sin stock"
        case p if p.precio >= 1000 => "Producto premium"
        case _ => "Producto estándar"
    }

    def main(args: Array[String]): Unit = {
        val prod1 = Producto("Laptop Gamer", 1200.0, 4)
        val prod2 = Producto("Monitor 4K", 850.0, 0)
        val prod3 = Producto("Teclado", 85.0, 15)
        println(s"${prod1.nombre} -> ${clasificar(prod1)}") 
        println(s"${prod2.nombre} -> ${clasificar(prod2)}") 
        println(s"${prod3.nombre} -> ${clasificar(prod3)}")
    }
}