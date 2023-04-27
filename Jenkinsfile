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
		steps{
			script{
				def scannerHome = tool 'Sonar Runner';
			}
			withSonarQubeEnv('My SonarQube Server') {
					sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=Jurisprudencia_ORCTXT -Dsonar.sources=. -Dsonar.login=69d977f11910740d9ca95b75cede210db01489c9"
			}
		}
    
    }
    }}
