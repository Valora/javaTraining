package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
def examine(closure) {
    println "$closure.maximumNumberOfParameters parameter(s) given:"
    for (aParameter in closure.parameterTypes) {
        println aParameter.name
    }
    println "- -"
}

examine() {}
examine() { it }
examine() { -> }
examine() { val1 -> }
examine() { Date val1 -> }
examine() { Date val1, val2 -> }
examine() { Date val1, String val2 -> }