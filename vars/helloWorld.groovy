def call(Map config = [:]){
    sh "echo Hello ${name}, today is ${dayofWeek}."
}