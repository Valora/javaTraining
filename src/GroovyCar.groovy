/**
 * Created by valora on 2017/3/9.
 */
class Car {
    def miles = 0
    final year
    Car(theYear) {year = theYear}
}

Car car = new Car(2008)
println "Year: $car.year"
println "Miles: $car.miles"
car.miles = 25
println "Miles: $car.miles"