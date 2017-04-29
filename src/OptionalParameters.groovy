/**
 * Created by valora on 2017/3/9.
 */
def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)

def task(name, String[] details) {
    println "$name - $details"
}

task("call", '123-456-789')
task('call', 'aaa', 'bbb')
task('Check call')