This project was upgraded to use Java 21 (OpenJDK 21).

Quick setup (Linux / dev container):

1. Install OpenJDK 21 (Ubuntu/Debian):

   sudo apt-get update && sudo apt-get install -y openjdk-21-jdk-headless

2. Set JAVA_HOME for the shell session:

   export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
   export PATH="$JAVA_HOME/bin:$PATH"

3. Compile all Java files:

   find . -name "*.java" -print -exec javac {} \;

Notes:
- If you use SDKMAN or other JDK managers, ensure Java 21 is selected.
- The repository contains several small Java examples under `brocode/`.
- If you have a build system (Maven/Gradle), update the `maven.compiler.release` or `sourceCompatibility`/`targetCompatibility` to 21.
