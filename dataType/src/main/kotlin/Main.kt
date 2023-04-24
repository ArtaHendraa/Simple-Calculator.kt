
fun main(){

    var a = 100 + 100
    println(a)
    var b = a + 100
    println(b)
    var c = a + b
    println(c)

    var x: Int = 2
    var y: Int = 1
    if (x == y){
        println("Bakso Mas rusdi")
    }else{
        println("Rusdi Barbershop")
    }

    var name: String
    var age: Int
    name = "Abdul"
    age = 15
    println(name)
    println(age)

    println(name[1])
    println("Panjangnya : " + name.length)

    var nama = "Sigit Rendang"
    println(nama.toUpperCase())
    println(nama.toLowerCase())

    println(name.compareTo(nama))
    println("Halo nama saya $name $nama")

    if (age == 15){
        age+=5
        println(age)
    }

    var day = 7
    var result = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "No Day"
    }
    println(result)
    var i = 0
    while (i <= 100){
        println(i)
        i++
        if (i == 5){
            break
        }
    }

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    cars[1] = "Nisan"
    println(cars.size)

    if ("Nisan" in cars){
        println("Mobilnya Ada")
    }else{
        println("Mobilnya ndak ada")
    }

    for (char in -1 downTo  -10){
        if (char == 10){
            continue
        }
        println(char)
    }

    newFun("John")
    newFun("Jane")
    newFun("George")

}

fun newFun(main: String){
    println(main + " Doe")
}
