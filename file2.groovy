pipeline {
  agent any
  stages {
    stage(new_step) {
      steps {
        echo "hii team"
      }
      
    }
  }
}
