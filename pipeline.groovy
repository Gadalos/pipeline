pipeline {
    agent any
    
    stages {
        stage('Desayunando') {
            steps {
                echo "Estoy Desayunando"
            }
        }
        stage('Almorzando') {
            steps {
                echo "Estoy Almorzando"
            }
        }
        stage('Cenando') {
            steps {
                echo "Estoy Cenando"
            }
        }
    }
}