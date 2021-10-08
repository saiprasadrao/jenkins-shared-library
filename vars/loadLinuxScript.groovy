def call(Map config = [:]){
    def scriptcontents = libraryResource "com/prasad/scripts/linux/${config.name}"
    writeFile file: "${config.name}", text: scriptcontents
    sh "chmod +x ./${config.name}"
}