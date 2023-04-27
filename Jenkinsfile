pipeline {

    agent any

     tools { 
      maven 'MAVEN' 
      jdk 'JDK 1.8' 
    }
  
    stages {

        stage("Git Checkout"){
            steps {
                git branch: 'main', url: 'https://github.com/ADITYA310802/HotelReviewManagement.git'
            }
        }

        stage("Unit Testing"){
            steps {
                sh 'mvn test'
            }
        }

        stage("Integration Testing"){
            steps {
                sh 'mvn verify -DskipUnitTests'
            }
        }

        stage("Build"){
            steps {
                sh 'mvn clean install'
            }
        }
        
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('Sonarqube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }
    
    }
}
