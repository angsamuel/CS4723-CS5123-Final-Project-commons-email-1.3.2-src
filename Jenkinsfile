pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo "Building.."'
                sh 'mvn -B DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
