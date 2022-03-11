fun main(){
    string(arrayOf("Wanji","Mollen","Muthoni","Kimmyworld" ))
    caps(arrayOf("harare","mumbai","dodoma","jakarta"))
    add()
    var x = smth(arrayOf("Kieran","Tiba","Connie"))
    println(x)
}
fun string(names:Array<String>) {
    names.forEach { name ->
        println(name)

    }
}
fun caps(cities:Array<String>){
    cities.forEach { city ->
        println(city.capitalize())

    }
}

fun add() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers[1] + numbers[4]
    println(sum)

    var number = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    println(numbers.indexOf(158))

    var nums = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var sortednums = nums.sorted()
    println(sortednums)
}

fun smth(names: Array<String>) :String {
   var name = names.contentToString()
    return name
}



