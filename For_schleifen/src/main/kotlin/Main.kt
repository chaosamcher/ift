package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(makeComplement("ATTCG"))
}

fun printSquares0_10(){
    for (i in 0..10){
        println(i * i)
    }
}

fun printSquares(Squareidicator:Int){
    for (i in 0..(Squareidicator - 1)){
        println(i * i)}
}

fun printSquaresNicer(Squareindicator:Int){
    println("The first " + Squareindicator.toString() + " squares are:")
    for (i in 0..(Squareindicator-1)){
        println(i * i)}
    println("Goodbye")
}

fun printSquaresStartEnd(m:Int, n:Int){
    println("The squares of the numbers from " + m.toString() + " up to " + n.toString() + " are:")
    for (i in m..n){
        println(i * i)}
    println("Goodbye")
}

fun summation(n:Int):Int{
    var number = 0
    for (i in 1..n){
        number = number + n }
    return(number)
}

fun numberToPWR(x:Int, y:Int){
    var zwischenergebnis = 1
    for (i in 1..y ){
        zwischenergebnis =zwischenergebnis * x  }
    println(zwischenergebnis)
}

fun factorial (n:Int):Int{
    var zahl = 1
    for (i in 1..n){
        zahl = zahl * i
    }
    return zahl
}

//fun choose(k:Int, n:Int):Int{
//}

fun countSheep(n:Int):String{
    val e =" "
    for(i in 1..n){
        val e = println( i.toString() + " Sheep...")
    }
    return e
}

fun sumCubes(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i * i * i
    }
    return sum
}


fun getSum(a: Int, b: Int): Int {
    val start = if (a < b) a else b
    val end = if (a > b) a else b
    var sum = 0
    for (i in start..end) {
        sum += i
    }
    return sum
}

fun solution(x:Int):Int{
    var sumalll = 0
    for (i in 1..x-1){
        sumalll = if (i%3==0||i%5==0)sumalll+i else sumalll
    }
    return sumalll
}

//fun divisor(x:Int):Int{
//var difsum = 0
// for (i in 0..x){
// difsum = if
//}
//}

fun doubleChar(x:String):String{
    var hertler = ""
    for (i in x){
        hertler = hertler+i+i
    }
    return hertler.toString()
}

fun contamination(x:String, y:String):String{
    var hertler = ""
    for (i in x){
        hertler = hertler+y
    }
    return hertler.toString()
}

fun getCount(x:String):Int{
    var hertler = 0
    for (i in x){
        hertler = if (i == 'a'||i =='e'||i =='i'||i =='o'||i =='u')hertler +1 else hertler+0
    }
    return hertler
}

fun makeComplement(x: String):String{
    var x1 = ""
    for(i in x){
        when{
            i == 'A' ->x1 = x1 + "T"
            i == 'T' ->x1 = x1 + "A"
            i == 'C' ->x1 = x1 + "G"
            i == 'G' ->x1 = x1 + "C"
        }
    }
    return x1
}

fun replace(x:String):String{
    var jeer = ""
    for(i in x){
        when{
            i == 'a' ->jeer = jeer + "!"
            i == 'e' ->jeer = jeer + "!"
            i == 'i' ->jeer = jeer + "!"
            i == 'o' ->jeer = jeer + "!"
            i == 'u' ->jeer = jeer + "!"
            else -> jeer = jeer + i
        }
    }
    return jeer
}
