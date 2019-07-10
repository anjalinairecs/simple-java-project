node{
    stage('Pull from git'){
        git url: 'https://github.com/anjalinairecs/simple-java-project.git'
    }
    stage('Build'){
        def mvnHome = tool 'M3'
        env.PATH = "${mvnHome}/bin:${env.PATH}"
        sh 'mvn clean package'
    }
}