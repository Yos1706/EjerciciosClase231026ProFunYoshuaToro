case class Estudiante(
    nombre: String,
    nota: Double
)

object Ejercicio3Main{

    def resultado(estudiante: Estudiante): String = estudiante match{
        case e if e.nota >= 90 => "Excelente"
        case e if e.nota >= 70 => "Aprobado"
        case e if e.nota >= 51 => "Regular"
        case _  => "Reprobado"
    }

    def main(args: Array[String]): Unit = {
        val estudiante1 = Estudiante("Carlos", 95)
        val estudiante2 = Estudiante("Lucía", 78)
        val estudiante3 = Estudiante("Mateo", 60)
        val estudiante4 = Estudiante("Sofia", 45)
        println(s"${estudiante1.nombre} (${estudiante1.nota}) -> ${resultado(estudiante1)}") 
        println(s"${estudiante2.nombre} (${estudiante2.nota}) -> ${resultado(estudiante2)}") 
        println(s"${estudiante3.nombre} (${estudiante3.nota}) -> ${resultado(estudiante3)}") 
        println(s"${estudiante4.nombre} (${estudiante4.nota}) -> ${resultado(estudiante4)}")
    }
}