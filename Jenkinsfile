pipeline {
    
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/mowoh931/crud-app.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
                https://github.com/mowoh931/crud-app.git

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"

                sh 'trivy repo https://github.com/mowoh931/crud-app.git'
            }
        }
        stage('Dependency Check') {
            steps {
                echo 'DP Checling'
                echo "Builf No: ${BUILD_NUMBER}"
            }
        post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
                failure {
                    echo'Build failed!'
                }                
            }
        }

        // stage('SonarQube Analysis') {
        //     steps{
        //         withSonarQubeEnv('SonarQube') {
        //             sh "mvn clean verify sonar:sonar -Dsonar.projectKey=crud-app -Dsonar.projectName='crud-app'"
        //         }
        //     }

        // }
        

    }
}
