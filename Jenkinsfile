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
                    echo 'Running Main Stage'
                    // Add your Main Stage steps here
                }
            }
        }
    }

    post {
        always {
            echo 'Post-build stage'
        }
    }
}

parallel (
    "Test": {
        testFunc()
    },
    "Another One": {
        echo 'Running Another One'
        // Add your "Another One" steps here
    }
)
