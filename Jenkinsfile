pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven'
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Publish Allure Report') {
            steps {
                allure(
                    includeProperties: false,
                    jdk: '',
                    results: [[path: 'allure-results']]
                )
            }
        }
    }

    post {
        always {
            junit '**/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'target/**/*', fingerprint: true
        }

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}