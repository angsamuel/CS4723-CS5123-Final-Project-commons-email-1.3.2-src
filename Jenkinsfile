pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo "BUILD"'
                sh 'mvn -B -DskipTests clean package'
                
            }
        }
        stage('Test') {
            steps {
                echo 'TEST'
                sh 'mvn test'
                sh 'echo "User ID: ccr___"'
                sh 'echo "Test 1: addCC Test, and Test 2: buildMimeMessages Test, both complete!"'
            }
        }
        stage('Deploy') {
            steps {
                echo 'DEPLOY'
                sh 'make'
            }
        }
    }
}
