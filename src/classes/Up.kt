package classes

import interfaces.Instruction

class Up : Instruction {
    override fun move(position: IntArray): IntArray {
        if (position.size != 2) {
            throw IllegalArgumentException("Array must have  exactly  2 elements")
        }
        if (position[0]>0) {
            position[0]--
            return position
        }
        return position

    }

}