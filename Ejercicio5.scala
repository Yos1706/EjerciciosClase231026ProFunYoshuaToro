case class Direccion(
    ciudad: String,
    pais: String,
)

case class Cliente(
    nombre: String,
    direccion: Direccion
)

object Ejercicio5Main{

    def ubicacion(cliente: Cliente): String = cliente match{
        case Cliente(_, Direccion(_, "Bolivia")) => "Cliente boliviano"
        case _ => "Cliente extranjero"
    }

    def main(args: Array[String]): Unit = {
        val cliente1 = Cliente("Pancho", Direccion("La Paz", "Bolivia"))
        val cliente2 = Cliente("David", Direccion("Washington DC", "Estados Unidos"))
        println(s"${cliente1.nombre} -> ${ubicacion(cliente1)}") 
        println(s"${cliente2.nombre} -> ${ubicacion(cliente2)}") 
    }
}