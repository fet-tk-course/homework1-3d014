package classes

import interfaces.Instruction

class Down : Instruction {
    override fun move(position: IntArray): IntArray {
        if (position.size != 2) {
            throw IllegalArgumentException("Array must have  exactly  2 elements")
        }
        if (position[0]<2) {
            position[0]++
            return position
        }
        return position

    }

}