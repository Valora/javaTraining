package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
def totalSelectValues(n, closure) {
    total = 0
    for (i in 1..n)
        if (closure(i)) {total += 1}
    total
}

println totalSelectValues(10) { it % 2 == 0}
def isOdd = {it % 2 != 0}
println totalSelectValues(10, isOdd)
