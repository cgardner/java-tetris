
build:
	mvn clean verify

run: build
	java -cp target/tetris-1.0-SNAPSHOT.jar com.craiggardner.tetris.App
	
watch:
	find src -name "*.java" -o -name "pom.xml" | entr -c make run