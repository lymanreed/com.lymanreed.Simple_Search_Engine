val lambda: (Long, Long) -> Long = { start, finish ->
    var product = start
    for (n in start + 1..finish) {
        product *= n
    }
    product
}
