pipeline {
    agent any

    environment {
        SERVER = 'http://10.250.4.2:4444'
        BROWSER = 'firefox'
        HEADLESS_VALUE = 'false'
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

                // Varias pruebas 
                multiple_tests()


                /* solo una prueba
                withGradle {
                    sh './gradlew test -Premote_server=${SERVER} -Pbrowser=${BROWSER} -PheadLess=$(HEADLESS_VALUE)'
                }
                */
            }

            post {
                always {
                    junit 'build/test-results/test/TEST-*.xml'
                }
            }
        }
    }
}

def multiple_tests() {
    withGradle {
        sh './gradlew test -Premote_server=${SERVER} -Pbrowser=firefox -PheadLess=$(HEADLESS_VALUE)'
        sh './gradlew test -Premote_server=${SERVER} -Pbrowser=chrome -PheadLess=$(HEADLESS_VALUE)'
        sh './gradlew test -Premote_server=${SERVER} -Pbrowser=opera -PheadLess=$(HEADLESS_VALUE)'
    }
}
