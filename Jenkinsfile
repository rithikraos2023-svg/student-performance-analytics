pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Use 'bat' for Windows environments
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Build successful. Ready for deployment.'
            }
        }
    }
}

