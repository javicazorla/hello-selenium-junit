pipeline {
    agent any

    environment {
        SERVER = 'http://10.250.4.2:4444'
        BROWSER = 'firefox'
    }

    stages {
        stage('Build') {

            steps { 
                withGradle {
                    sh './gradlew assemble'
                }
            }
            
            post {
                success {
                    archiveArtifacts 'build/libs/*.jar'
                }
            }
        }


        stage('Test') {

            steps { 

                withGradle {
                    sh './gradlew test -Premote_server=${SERVER} -Pbrowser=${BROWSER}'
                }
            }

            post {
                always {
                    junit 'build/test-results/test/TEST-*.xml'
                }
            }
        }
    }
}
