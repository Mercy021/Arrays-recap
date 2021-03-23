import java.util.*

fun main() {
    companies()
    numbers()
    fruits()

}
fun companies(){
    var companiesArrays=arrayOf("Amazon","Google","Samsung","Twitter","Facebook")
    var sortedcompanies=companiesArrays.sortedArray()
    println(Arrays.toString(sortedcompanies))
}
fun numbers(){
    var numbersArrays=arrayOf("273","10","20","34","104")
    var sortednumbers=numbersArrays.sortedArray()
    println(Arrays.toString(sortednumbers))
}
fun fruits(){
    var fruitsArrays= arrayOf("Mango","Pawpaw","Grapes","Ovacado")
    println(fruitsArrays[0])
    println(fruitsArrays[1])
    println(fruitsArrays[2])
    println(fruitsArrays[3])

}
