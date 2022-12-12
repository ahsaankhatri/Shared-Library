// jenkinsForJava.groovy
def call(String repoUrl) {
        always {
            echo 'This will always run'
        }
        
        success {
            echo 'This will run only if successful'
        }
        
        unstable {
            echo 'This will run only if run was marked as unstable'
        }
        
        changed {
            echo 'This will run only if the state of the pipeline is changed'
            echo 'FOR EXAMPLE, if the pipeline was prevously failed but not it is successful'
        }
   }