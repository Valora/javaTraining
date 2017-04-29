package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
def sun(n) {
    total = 0
    for (int i = 2; i <= n  ; i += 2) {
        total += i
    }
    total
}

println "${sun(10)}"

def product(n) {
    prod = 1
    for (int i = 2; i <= n; i += 2) {
        prod *= i
    }
    prod
}

println "${product(10)}"

def sqr(n) {
    squared = []
    for (int i = 2; i <= n; i+=2) {
        squared << i ** 2
    }
    squared
}
println "${sqr(10)}"