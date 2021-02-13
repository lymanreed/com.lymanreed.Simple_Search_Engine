fun main(args: Array<String>) {
    if (args.size == 3) {
        args.forEachIndexed { i, arg ->
            println("Argument ${i + 1}: ${args[i]}. It has ${arg.length} characters")
        }
    } else {
        println("Invalid number of program arguments")
    }
}
