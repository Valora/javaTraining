/**
 * Created by valora on 2017/3/9.
 */
def splitName(fullName) {
    fullName.split(' ')
}
def (firstName, lastName) = splitName('James Bond')
println "$lastName, $firstName, $lastName"

def name1 = 'Thomson'
def name2 = 'Thompson'

println "$name1 and $name2"
(name1, name2) = [name2, name1]
println "$name1 and $name2"