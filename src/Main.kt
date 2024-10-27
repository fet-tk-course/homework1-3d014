enum class InstructionValues(val symbol: Char) {
    UP('^'),
    LEFT('<'),
    RIGHT('>'),
    DOWN('v')
}


interface Instruction {
    fun move(position: IntArray): IntArray
}

class Up : Instruction {
    override fun move(position: IntArray): IntArray {
        if (position.size != 2) {
            throw IllegalArgumentException("Array mora imati tačno 2 elementa")
        }
        if (position[0]>0) {
            position[0]--
            return position
        }
        return position

    }

}

class Down : Instruction {
    override fun move(position: IntArray): IntArray {
        if (position.size != 2) {
            throw IllegalArgumentException("Array mora imati tačno 2 elementa")
        }
        if (position[0]<2) {
            position[0]++
            return position
        }
        return position

    }

}

class Left : Instruction {
    override fun move(position: IntArray): IntArray {
        if (position.size != 2) {
            throw IllegalArgumentException("Array mora imati tačno 2 elementa")
        }
        if (position[1]>0) {
            position[1]--
            return position
        }
        return position

    }

}
class Right : Instruction {
    override fun move(position: IntArray): IntArray {
        if (position.size != 2) {
            throw IllegalArgumentException("Array mora imati tačno 2 elementa")
        }
        if (position[1]<2) {
            position[1]++
            return position
        }
        return position

    }

}

fun main() {
    // Iterate over each value in the enum and print both the name and symbol
    for (instruction in InstructionValues.values()) {
        println("Direction: ${instruction.name}, Symbol: ${instruction.symbol}")
    }
}