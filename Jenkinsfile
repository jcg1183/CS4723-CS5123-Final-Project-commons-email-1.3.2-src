pipeline {

    agent any

    stages {

        stage("build") {
            
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage("test") {

            steps {
                sh 'mvn test'
            }
        }

        stage("deliver") {

            steps {
                echo "nhf___ Delivery Stage"
            }
        }
    }
}