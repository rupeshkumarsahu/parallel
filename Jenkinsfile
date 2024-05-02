def testFunc() {
    echo 'Running TestFunc'
    // Add your TestFunc steps here
}

pipeline {
    agent any

    stages {
        stage('Main Stage') {
            echo 'This is main stage'
            // steps {
            //     script {
            //         parallel (
            //             "Test": {
            //                 testFunc()
            //             },
            //             "Another One": {
            //                 echo 'Running Another One'
            //                 // Add your "Another One" steps here
            //             }
            //         )
            //     }
            // }
        }
        'run echo': {
            echo 'running echo test123'
        }
    }
}
