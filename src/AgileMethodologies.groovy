/**
 * Created by valora on 2017/3/10.
 */
enum Methodlogies {
    Evo(5),
    XP(21),
    Scrum(30);
    
    final int daysInIteration
    Methodlogies(days) {daysInIteration = days}
    
    def iterationDetails() {
        println "${this} recommends $daysInIteration days for iteration"
    }
}

for (methodology in Methodlogies.values()){
    methodology.iterationDetails()
}