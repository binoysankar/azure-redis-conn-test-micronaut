## Micronaut Azure Redis Connection Test App

Steps to run the application
============================

    * git clone the project - "git clone https://github.com/binoysankar/azure-redis-conn-test-micronaut.git"
    * Update the placeholder values "<REDIS_PASSWORD>" and "<REDIS_HOST>" in "application.yml" files under resources folder
    * Comment/Uncomment lines nos 23 - 27 specified in "build.gradle" file. // Comment = Use lettuce latest version and Uncomment = Use old working lettuce version
    * Open prompt/terminal/gitbash. Run "gradlew run" command to start the application (Remember you need to be inside the clone project folder to run this command)
    * Hit "http://localhost:8649/api/v1/session" in browser or Postman
    * Output will be some random string saved into redis cache if successful or else will get the conneciton exception.

- [User Guide](https://docs.micronaut.io/2.4.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.4.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.4.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---