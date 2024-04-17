pipeline {
  agent any
  stages {
    stage('Salute') {
      steps {
        echo 'Hello there'
      }
    }

    stage('Build') {
      steps {
        bat 'mvn clean'
      }
    }

  }
}