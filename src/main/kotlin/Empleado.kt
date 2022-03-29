open class Empleado {
    var nombre: String
    open var edad: Int
    open var salario: Double
    open val plus: Double = 300.0

    constructor(){
        this.nombre = " "
        this.edad = 0
        this.salario = 0.0
    }

    constructor(nombre_R: String, edad_R: Int, salario_R: Double) {
        this.nombre = nombre_R
        this.edad = edad_R
        this.salario = salario_R
    }
}