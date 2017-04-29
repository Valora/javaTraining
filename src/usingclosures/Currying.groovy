package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
def tellFortunes(closure) {
    Date date = new Date("09/20/2012")
    postFortune = closure.curry(date)
    postFortune "Your day is filled with ceremony"
    postFortune "They're features, not bugs"
}

tellFortunes() {
    date, fortune ->
        println "Fortune for ${date} is '${fortune}'"
}
