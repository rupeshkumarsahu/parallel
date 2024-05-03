// Jenkinsfile

pipeline {
    agent any

    stages {
        stage('Load Functions') {
            steps {
                script {
                    def exampleModule = load "myfunc.groovy"
                    
                    // Call the functions from the external file
                    echo exampleModule.greet('John')
                    echo "The sum of 5 and 3 is ${exampleModule.add(5, 3)}"
                }
            }
        }
    }
}
