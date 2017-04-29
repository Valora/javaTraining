/**
 * Created by valora on 2017/3/9.
 */
class Car2 {
    final year
    private miles = 0
    Car2(theYear) { year = theYear}

    def getMiles() {
        println "getMiles called"
        miles
    }

    private void setMiles(miles) {
        throw new IllegalAccessException("you're not allowed to change miles")
    }

    def drive(dist) {
        if (dist > 0 )
            miles += dist
    }
}
def car2 = new Car2(2012)

println "Year: $car2.year"
println "Miles: $car2.miles"
println "Driving"
car2.drive(10)
println "Miles: $car2.miles"

try {
    car2.year = 1900
} catch (ex) {
    println ex.message
}

try {
    car2.miles = 1900
} catch (ex) {
    println ex.message
}


