FROM openjdk
EXPOSE 8080
ADD target/job-match-pro-version-1.0.0.jar /job-match-pro-version-1.0.0.jar
ENTRYPOINT ["java","-jar","/job-match-pro-version-1.0.0.jar"]