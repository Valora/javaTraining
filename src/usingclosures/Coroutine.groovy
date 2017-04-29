package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
def iterate(n, closure) {
    1.upto(n) {
        println "In iterate with value ${it}"
        closure(it)
    }
}

println "Calling iterate"
total = 0
iterate(4) {
    total += it
    println "In closure total so far is ${total}"
}

println "Done"
