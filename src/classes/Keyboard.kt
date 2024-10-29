package classes

import interfaces.Instruction

class Keyboard {
    val matrix: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    fun move(position:IntArray,instruction: Instruction):IntArray{
        return instruction.move(position)
    }
}