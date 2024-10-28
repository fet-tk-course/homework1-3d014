package utils
import classes.Decoder
import classes.Keyboard
import java.io.File
fun decodeFile (path:String):String{
    val keyboard: Keyboard = Keyboard()
    val decoder: Decoder = Decoder(keyboard)
    val instructions= mutableListOf<String>()
    File(path).forEachLine { line ->
        instructions.add(line)
        // u slucaju da jedan red u txt fajlu predstavlja liniju instrukcija

    }

    val code = decoder.decode(instructions)

    return code




}