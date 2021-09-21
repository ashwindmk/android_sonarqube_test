# SonarQube

### Pre-requisites
1. SonarQube server
2. SonarQube scanner
3. Jacoco

### Steps to Run

1. Start sonarqube server.
  ```
  ./sonar.sh start
  ```

2. Open and Login to SonarQube
    http://localhost:9000

2. Execute sonarqube.
   ```
   ./gradlew clean
   ./gradlew build
   ./gradlew jacocoUnitTestReport
   ./gradlew sonarqube -Dsonar.host.url=http://localhost:9000/ -Dsonar.verbose=true
   ```
