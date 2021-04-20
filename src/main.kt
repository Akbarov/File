import java.io.File

fun main() {
    val name = "text.txt"
    val file = File(name)


    print(file.canWrite())
    file.writeText("This is a text")
    file.appendText("\nHello world")

//    if (file.exists()) {
//        println("File exists")
//    }else{
//        println("File not  exists")
//      val canCreate =  file.createNewFile()
//        println(canCreate)
//
//    }
//    val result =  file.readBytes()
//    for (i in result) {
//        print(i.toChar())
//    }

}