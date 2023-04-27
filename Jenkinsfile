pipeline {
  agent {
        label params.AGENT == "any" ? "" : params.AGENT 
    }

  stages {
    stage('Hello') {
      steps {
        sh '''
          ansible --version
          ansible-playbook --version
          ansible-galaxy --version
        '''
      }
    }
  }
}
