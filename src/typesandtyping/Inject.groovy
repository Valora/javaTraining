package typesandtyping
/**
 * Created by valora on 2017/3/12.
 */
def shoutString(String str) {
    println str.shout()
}

str = 'hello'
str.metaClass.shout = { -> toUpperCase() }
shoutString(str)
