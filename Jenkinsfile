pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mowoh931/crud-app.git'
            }
        }
        stage('Build with Maven') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
