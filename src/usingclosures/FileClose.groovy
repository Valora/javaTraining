package usingclosures

/**
 * Created by valora on 2017/3/12.
 */
new FileWriter('output.txt').withWriter { writer -> writer.write('a') }