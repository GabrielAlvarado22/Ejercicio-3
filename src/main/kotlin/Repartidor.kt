class Repartidor: Empleado{

    var zona: String

    constructor(nombre_R: String, edad_R: Int, salario_R: Double, zona_R: String): super (nombre_R, edad_R, salario_R){
        this.nombre = nombre_R
        this.zona = zona_R
        this.edad = edad_R
        this.salario = salario_R
    }

    init {
        this.zona = "3"
    }

    constructor()

    fun plus(r: Repartidor) {
        if(r.edad < 25 && r.zona == "3"){
            r.salario += r.plus
        }
        println("El salario es "+ r.salario)
    }

}