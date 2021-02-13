package search

import java.io.File

fun none(query: String, data: List<String>, invertedIndex: MutableMap<String, MutableList<Int>>) {

    val allQueries = query.split(" ")

    val results = data.toMutableList()
    var numResults = 0

    for (currentQuery in allQueries) {
        if (currentQuery in invertedIndex.keys) {
            // you've got the key, you need the list of ints which are the indexes in data
            for (index in invertedIndex[currentQuery]!!) {
                results -= data[index]
                ++numResults
            }
        }
    }

    if (numResults == 0) {
        println("No matching people found.")
    } else {
        for (result in results) {
            println(result)
        }
    }
}

fun all(query: String, data: List<String>, invertedIndex: MutableMap<String, MutableList<Int>>) {

    val allQueries = query.split(" ")

    val results = mutableListOf<String>()
    var numResults = 0

    for (currentQuery in allQueries) {
        if (currentQuery in invertedIndex.keys) {
            // you've got the key, you need the list of ints which are the indexes in data
            for (index in invertedIndex[currentQuery]!!) {
                results += data[index]
                ++numResults
            }
        } else {
            println("No matching people found.")
            return
        }
    }

    if (numResults == 0) {
        println("No matching people found.")
    } else {
        for (result in results) {
            println(result)
        }
    }
}

fun any(query: String, data: List<String>, invertedIndex: MutableMap<String, MutableList<Int>>) {

    val allQueries = query.split(" ")

    val results = mutableListOf<String>()
    var numResults = 0

    for (currentQuery in allQueries) {
        if (currentQuery in invertedIndex.keys) {
            // you've got the key, you need the list of ints which are the indexes in data
            for (index in invertedIndex[currentQuery]!!) {
                results += data[index]
                ++numResults
            }
        }
    }
    
    if (numResults == 0) {
        println("No matching people found.")
    } else {
        for (result in results) {
            println(result)
        }
    }
}

fun createInvertedIndex(data: List<String>): MutableMap<String, MutableList<Int>> {

    val invertedIndex = mutableMapOf<String, MutableList<Int>>()

    data.forEachIndexed { index, line ->
        val words = line.split(" ").toMutableList()
        words.forEachIndexed { i, s ->
            words[i] = s.toLowerCase()
        }
        for (word in words) {
            if (word in invertedIndex.keys) {
                invertedIndex[word]!!.add(index)
            } else {
                invertedIndex[word] = mutableListOf(index)
            }
        }
    }

    return invertedIndex
}

fun printData(data: List<String>) {
    println("\n=== List of people ===")
    data.forEach { println(it) }
}

fun printMenu(): String {
    println()
    println("""
        === Menu ===
        1. Find a person
        2. Print all people
        0. Exit
    """.trimIndent())
    return readLine()!!
}

fun main(args: Array<String>) {
    val data = File(args[1]).readLines()
    val invertedIndex = createInvertedIndex(data)

    var option = printMenu()
    while (option != "0") {
        when (option) {
            "1" -> find(data, invertedIndex)
            "2" -> printData(data)
            else -> {
                println("\nIncorrect option! Try again.")
            }
        }
        option = printMenu()
    }

    println("\nBye!")
}

fun find(data: List<String>, invertedIndex: MutableMap<String, MutableList<Int>>) {
    println("\nSelect a matching strategy: ALL, ANY, NONE")
    var type = readLine()!!.toUpperCase()
    if (type !in listOf("ALL", "ANY", "NONE")) {
        println("Invalid selection!")
        type = readLine()!!.toUpperCase()
    }

    println("\nEnter a name or email to search all suitable people.")
    val query = readLine()!!.toLowerCase().trim()

    when (type) {
        "ALL" -> all(query, data, invertedIndex)
        "ANY" -> any(query, data, invertedIndex)
        "NONE" -> none(query, data, invertedIndex)
    }

}
