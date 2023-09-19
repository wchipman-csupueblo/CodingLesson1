fun main(args: Array<String>) {
    val number = if(args.isNotEmpty()) args[0].toIntOrNull() else null

    println("$number is ${evenOrOdd(number)}")
    println("$number! is ${calculateFactorial(number)}")
}

fun evenOrOdd(num:Int?): String {
    if (num != null) {
        return if (num % 2 == 0) {
            "even"
        } else {
            "odd"
        }
    }
    return "Invalid input. Please enter a valid number."
}

fun calculateFactorial(num: Int?): Long? {
    return when (num) {
        null -> {
            null
        }
        0, 1 -> {
            1L
        }
        else -> {
            var result = 1L
            for (i in 2..num) {
                result *= i
            }
            return result
        }
    }
}