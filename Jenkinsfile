pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compiling the code...'
                bat 'javac factorial.java Testfactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running test cases...'
                bat 'java Testfactorial'
            }
        }

        stage('Run Main Class') {
            steps {
                echo 'Running main factorial program...'
                bat 'java factorial'
            }
        }

        stage('Package JAR') {
            steps {
                echo 'Packaging the JAR file...'
                bat 'jar cfm factorial.jar manifest.txt factorial.class'
            }
        }

        stage('Archive JAR') {
            steps {
                echo 'Archiving the JAR file...'
                archiveArtifacts artifacts: 'factorial.jar', onlyIfSuccessful: true
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed. Check logs for errors.'
        }
        always {
            echo 'Pipeline finished.'
        }
    }
}
