package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
def doSomeThing(closure) {
    if (closure) {
        closure()
    } else {
        println "Using default implementation"
    }
}

doSomeThing() {println "Use specialized implementation"}
doSomeThing()