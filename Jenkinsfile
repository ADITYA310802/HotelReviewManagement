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
        
        
        node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=hotel_management -Dsonar.projectName='hotel_management'"
    }
  }
}
        
//           stage('SonarQube analysis') {
// //    def scannerHome = tool 'SonarScanner 4.0';
//         steps{
//         withSonarQubeEnv('SonarQube') { 
//         // If you have configured more than one global server connection, you can specify its name
// //      sh "${scannerHome}/bin/sonar-scanner"
//         sh "mvn sonar:sonar"
//     }
//         }
    
    
//           }}}
    }}
