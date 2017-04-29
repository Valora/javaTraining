/**
 * Created by valora on 2017/3/9.
 */
def openFile(fileName) {
    new FileInputStream(fileName)
}

try {
    openFile("nonexistentfile")
} catch (ex) {
    println "Oops: " + ex
}
