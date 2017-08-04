pipeline {
    agent any   
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean package'
            }
        }
        stage('Docker') {
            steps {
                echo 'Building Docker Image'
                sh "mvn -DpushImage=true -Dbuild.tag=${env.BUILD_TAG} docker:build"
            }
        }
    }
}
