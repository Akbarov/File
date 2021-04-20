import java.io.File

fun main() {
    val a = 2
    val d = 40
    val name = "numbers.txt"
    val file = File(name)
    if(file.exists()){
        val line = file.readText()
//        println(line)
      val array =  line.split(", ")
        for (item in array) {
           println(item.toInt())
        }
    }else{
        println("-1")
    }
}