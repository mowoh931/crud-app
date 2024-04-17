pipeline {
  agent any
  stages {
    stage('Salute') {
      steps {
        echo 'Hello there'
      }
    }

    stage('Clean') {
      steps {
        bat 'mvn clean'
      }
    }

    stage('Build') {
      steps {
        bat 'clean install'
      }
    }

    stage('End') {
      steps {
        echo 'End!'
      }
    }

  }
}