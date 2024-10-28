package classes
class Decoder (val keyboard: Keyboard, ) {
    var currentPosition = intArrayOf(1, 2)
    var code:String=""
    fun  decode (instructions : List<String>):String{

        instructions.forEach{ instruction->

            for (char in instruction){
                when(char){
                    '^'->currentPosition= keyboard.move(currentPosition,Up())
                    'v'->currentPosition= keyboard.move(currentPosition,Down())
                    '>'->currentPosition= keyboard.move(currentPosition,Right())
                    '<'->currentPosition= keyboard.move(currentPosition,Left())
                    else->throw IllegalArgumentException("Invalid instruction: $char")
                }
            }

            code+=keyboard.matrix[currentPosition[0]][currentPosition[1]]


        }
        return code

    }
}