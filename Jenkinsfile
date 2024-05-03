// Jenkinsfile

pipeline {
    agent any

    stages {
        stage('Load Functions') {
            steps {
                script {
                    // Load the external functions from myFunctions.groovy
                    externalFunctions = load 'myfunc.groovy'
                    
                    // Call the functions from the external file
                    echo externalFunctions.greet('John')
                    echo "The sum of 5 and 3 is ${externalFunctions.add(5, 3)}"
                }
            }
        }
    }
}
