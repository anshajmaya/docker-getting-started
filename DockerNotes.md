# File contains notes for deploying a stand-alone spring boot application using Docker

1. install docker if not already done

2. build your project using: mvn clean install

3. create a Dockerfile in your project, this is the main configuration file that docker uses for its purpose

4. open a terminal/cmd prompt in your project folder

# Fire the below commands in same order
docker image build -t anshajmaya10/docker:docker-with-boot . 

docker container run -d --name plain-boot -p 8000:8080 anshajmaya10/docker:docker-with-boot

# Open your browser and hit localhost:8000

