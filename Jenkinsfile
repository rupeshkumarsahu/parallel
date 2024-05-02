def testFunc() {
    echo 'Running TestFunc'
    // Add your TestFunc steps here
}

pipeline {
    agent any

    stages {
        stage('Main Stage') {
            steps {
                script {
                    parallel (
                        "Test": {
                            testFunc()
                        },
                        "Another One": {
                            echo 'Running Another One'
                            // Add your "Another One" steps here
                        }
                    )
                }
            }
        }
    }
}
