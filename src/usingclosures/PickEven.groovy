package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
def pickEven(n, block) {
    for (int i = 2; i <= n; i += 2) {
        block(i)
    }
}

pickEven(10, { println it })
pickEven(10) { println it }

total = 0
pickEven(10) { total += it }
println "${total}"

product = 1
pickEven(10) { product *= it }
println "${product}"