FROM openjdk:11
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp
RUN javac src/java_calculate/HelloWorld.java -d .
CMD ["java", "java_calculate.HelloWorld"]
