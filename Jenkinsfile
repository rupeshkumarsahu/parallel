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
                    
                    // Generate result.xml if it's not already generated
                    sh 'echo "<testResult>Some test results</testResult>" > result.xml'
                }
            }
        }
    }
    
    post {
        always {
            // Archive the result.xml file
            archiveArtifacts artifacts: 'result.xml', onlyIfSuccessful: false
        }
    }
}
