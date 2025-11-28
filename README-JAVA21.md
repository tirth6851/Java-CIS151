# Java 21 Setup Guide

## Overview
This project has been upgraded to use **Java 21 (OpenJDK 21)** to take advantage of the latest language features and performance improvements.

## Prerequisites
- Ubuntu/Debian Linux system or development container
- Terminal access with sudo privileges
- Basic understanding of Java and command-line operations

## Installation Steps

### 1. Install OpenJDK 21

For Ubuntu/Debian systems:

```bash
sudo apt-get update && sudo apt-get install -y openjdk-21-jdk-headless
```

### 2. Configure Java Environment

Set JAVA_HOME for your shell session:

```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
export PATH="$JAVA_HOME/bin:$PATH"
```

To make these changes permanent, add them to your `~/.bashrc` or `~/.profile`:

```bash
echo 'export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64' >> ~/.bashrc
echo 'export PATH="$JAVA_HOME/bin:$PATH"' >> ~/.bashrc
source ~/.bashrc
```

### 3. Verify Installation

Check your Java version:

```bash
java -version
javac -version
```

You should see output indicating Java 21.

### 4. Compile Java Files

To compile all Java files in the project:

```bash
find . -name "*.java" -print -exec javac {} \;
```

## Build System Configuration

If you're using Maven or Gradle, ensure your build configuration targets Java 21:

### Maven (pom.xml)
```xml
<properties>
    <maven.compiler.source>21</maven.compiler.source>
    <maven.compiler.target>21</maven.compiler.target>
</properties>
```

### Gradle (build.gradle)
```gradle
sourceCompatibility = '21'
targetCompatibility = '21'
```

## Important Notes

- **JDK Managers**: If you use SDKMAN or other JDK managers, ensure Java 21 is selected:
  ```bash
  sdk use java 21-open
  ```

- **Repository Structure**: The repository contains several small Java examples under the `brocode/` directory.

- **Build Configuration**: Update `maven.compiler.release` or `sourceCompatibility`/`targetCompatibility` to `21` in your build files.

## Troubleshooting

### Common Issues

1. **Command not found**: Ensure Java is in your PATH
2. **Wrong Java version**: Check with `java -version` and update JAVA_HOME
3. **Compilation errors**: Verify you're using Java 21 features correctly

### Need Help?

If you encounter issues:
- Check that JAVA_HOME is set correctly: `echo $JAVA_HOME`
- Verify PATH includes Java bin directory: `echo $PATH`
- Ensure OpenJDK 21 is properly installed: `dpkg -l | grep openjdk`

## Additional Resources

- [Java 21 Release Notes](https://openjdk.org/projects/jdk/21/)
- [OpenJDK Installation Guide](https://openjdk.org/install/)
- [Maven Compiler Plugin Documentation](https://maven.apache.org/plugins/maven-compiler-plugin/)

---
*Last Updated: For Java 21 (OpenJDK 21)*
