/**
 * Created by valora on 2017/3/10.
 */
def receiveVarargs(int a, int ... b) {
    println "You passed $a and $b"
}

def receiveArray(int a, int[] b) {
    println "You passed $a and $b"
}

receiveVarargs(1, 2, 3, 4, 5)
receiveArray(1, 2, 3, 4, 5)