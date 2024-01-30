pipeline {
    agent any

    stages {
        stage('git checkout') {
            steps {
                git branch: 'main', credentialsId: '16a71f94-dd5d-4187-b56a-80cf9d24b772', url: 'git@github.com:oomgomgxx/jenkins-maven-demo.git'
            }
        }

        stage('package project') {
            steps {
                sh "./mvnw clean package"
            }
        }

    }

    // post {
    //     always {
    //         cleanWs()
    //     }
    // }
}