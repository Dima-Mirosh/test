node {
  
  stage('SCM') {
        git 'git@github.com:Dima-Mirosh/js.git'  
  }

  
  stage('SonarQube analysis') {
    def scannerHome = tool 'sonarqube';
    withSonarQubeEnv('sonarqube') { // If you have configured more than one global server connection, you can specify its name
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
}
