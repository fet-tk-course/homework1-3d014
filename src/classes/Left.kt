package classes

import interfaces.Instruction

class Left : Instruction {
    override fun move(position: IntArray): IntArray {
        if (position.size != 2) {
            throw IllegalArgumentException("Array must have  exactly  2 elements")
        }
        if (position[1]>0) {
            position[1]--
            return position
        }
        return position

    }

}