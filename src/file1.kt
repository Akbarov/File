import java.io.File

fun main() {
    val S = "salom.txt"
    val file = File(S)
    val N = 20
    for (i in 2..N step 2) {
        file.appendText("$i ")
    }
}