
import classes.Keyboard
import classes.Decoder
//import utils.decodeFile


fun main() {
        val instructions=mutableListOf<String>()
        instructions.add("^<<")
        instructions.add(">>vvv")
        instructions.add("<^>v<")
        instructions.add("^^^^v")

        val keyboard:Keyboard=Keyboard()
        val decoder:Decoder=Decoder(keyboard)
        val code = decoder.decode(instructions)
        print(code)


        /*
        println("Enter instructions file path:")
        val filePath = readLine()
        val fileCode= decodeFile(filePath)
        print(fileCode)
         */

    }