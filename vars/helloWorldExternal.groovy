def call(Map config = [:]){
    loadLinuxScript(name: 'hello-world.sh')
    sh "./helloworld.sh ${config.name} ${config.dayOfWeek}"
}