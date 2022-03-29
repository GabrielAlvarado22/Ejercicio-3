fun main(args: Array<String>) {

    val c= Comercial()
    val comercial1 = Comercial("Gabriel", 33, 600.0,250.0)
    val comercial2 =Comercial("Steven", 15, 450.0,25.0)

    println(c.plus(comercial1))
    println(c.plus(comercial2))

    val r= Repartidor()
    val repartidor1 = Repartidor("Gabriel", 22, 600.0,"5")
    val repartidor2 = Repartidor("Steven", 20, 450.0,"3")

    println(r.plus(repartidor1))
    println(r.plus(repartidor2))

    println("Program arguments: ${args.joinToString()}")
}