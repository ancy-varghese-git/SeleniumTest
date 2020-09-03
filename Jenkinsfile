node{
   try{
	
	def docker = tool name: 'Docker-Jenkins',type: 'dockerTool'
	def dockerCmd = "${docker}/bin/docker"
    def mavenHome = tool name: 'Maven-Jenkins',type: 'maven'
    def mavenCmd = "${mavenHome}/bin/mvn"
            
    stage('git checkout'){
        git credentialsId: 'ancy-varghese-git', url: 'https://github.com/ancy-varghese-git/MySpringBoot.git'
    }
	
    stage('Runtime mvn build and test'){
        //sh 'mvn clean package'
        sh "${mavenCmd} clean package"
    }
	
    stage('Sonar Quality Check'){
       withSonarQubeEnv('Sonar-Conf') {
          sh "${mavenCmd} sonar:sonar"
        }
    }
	
    stage('Docker Build Image'){
		sh "${dockerCmd} build -t ancydocker194237/annrepo:mySpringBoot-1.0.0 ."
    }
	
	stage('Docker Hub Push Image'){
		withCredentials([usernamePassword(credentialsId: 'dockhubann', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
          sh "${dockerCmd} login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
		sh "${dockerCmd} push ancydocker194237/annrepo:mySpringBoot-1.0.0"
		}
    }
	
	stage('Docker Run Image'){
		sh "${dockerCmd} run -p 80:8080 -d ancydocker194237/annrepo:mySpringBoot-1.0.0"
    } 
	
  }