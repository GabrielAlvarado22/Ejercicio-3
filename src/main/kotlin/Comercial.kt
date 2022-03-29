class Comercial: Empleado {

    var comision: Double

    constructor(nombre_R: String, edad_R: Int, salario_R: Double, comision: Double): super (nombre_R, edad_R, salario_R){
        this.nombre = nombre_R
        this.edad = edad_R
        this.salario = salario_R
        this.comision= comision
    }

    init {
        this.comision = 0.0
    }

    constructor()


    fun plus(c: Comercial) {
        if(c.edad > 30 && c.comision > 200){
            c.salario += c.plus
            println("Recibio el plus")
        }else{
            println("No recibió comision")
        }
    }

}