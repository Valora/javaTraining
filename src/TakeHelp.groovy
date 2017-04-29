/**
 * Created by valora on 2017/3/10.
 */
def takeHelper(helper) {
    helper.helpMoveThings()
}

class Man {
    void  helpMoveThings() {
        println "Man's helping"
    }
}

class Woman {
    void  helpMoveThings() {
        println "Woman's helping"
    }
}

class Elephant {
    void helpMoveThings() {
        println "Elephant's helping"
    }
    
    void eatSugarcane() {
        println "I love sugarcanes..."
    }
}

takeHelper(new Man())
takeHelper(new Woman())
takeHelper(new Elephant())
