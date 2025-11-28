# Java 21 Upgrade Guide

## Overview
This document describes the changes made to upgrade this project from an earlier Java version to Java 21 (OpenJDK 21).

## What Changed

### Build Configuration
- **Added Maven Support**: Created a minimal `pom.xml` at the project root to enable building with Maven and targeting Java 21
- **Compiler Settings**: Updated Maven compiler plugin configuration to use Java 21 as both source and target

### Project Structure
The project now supports both manual compilation and Maven-based builds:
- Manual compilation: `javac` with Java 21
- Maven builds: `mvn clean compile` or `mvn clean package`

## Testing the Upgrade

### Prerequisites
1. Install JDK 21 if you don't already have it (see [README-JAVA21.md](README-JAVA21.md) for installation instructions)
2. Install Maven if using Maven builds
3. Set JAVA_HOME to point to Java 21

### Verify with Maven

From the repository root, run:

```bash
# Validate configuration
mvn -v

# Clean and compile all sources
mvn clean compile

# Run tests (if available)
mvn -q -DskipTests package
```

This will compile the `brocode` sources using Java 21 settings.

### Expected Output
You should see:
- Maven using Java 21 for compilation
- All `.java` files in the project successfully compiling
- No deprecation warnings or errors
- Generated `.class` files targeting Java 21 bytecode

## Next Steps & Considerations

### For Gradle Users
If your CI/CD or local environment uses Gradle instead of Maven, create an equivalent `build.gradle` file:

```gradle
plugins {
    id 'java'
}

group = 'com.yourgroup'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

sourceCompatibility = '21'
targetCompatibility = '21'

dependencies {
    // Add your dependencies here
}
```

### Code Migration
If you'd like to modernize the code to use Java 21 features:
- **Pattern Matching**: Simplify `instanceof` checks
- **Records**: Replace simple data classes with records
- **Sealed Classes**: Add sealed hierarchies where appropriate
- **Text Blocks**: Use for multi-line strings
- **Switch Expressions**: Modernize switch statements

### Automated Refactoring
While automated code migrations using tools like OpenRewrite are possible, they require:
- Copilot Pro features or equivalent tooling
- Manual review of suggested changes
- Thorough testing after migration

For this coursework repository, manual upgrades are recommended to maintain learning clarity.

### Compatibility Notes
- All code should remain backward compatible with Java 17+ features
- No breaking changes to existing functionality
- Only build configuration was updated

## Troubleshooting

### Maven Reports Wrong Java Version
Check:
```bash
echo $JAVA_HOME
mvn -v
```
Ensure JAVA_HOME points to Java 21.

### Compilation Errors
- Verify `pom.xml` has correct `maven.compiler.source` and `maven.compiler.target` set to `21`
- Check that no Java 21-incompatible syntax is present
- Ensure all dependencies support Java 21

### CI/CD Pipeline Failures
Update your CI configuration to:
- Use Java 21 in build containers
- Update Maven/Gradle wrapper if needed
- Cache dependencies appropriately

## Resources

- [Java 21 Features](https://openjdk.org/projects/jdk/21/)
- [Maven Compiler Plugin](https://maven.apache.org/plugins/maven-compiler-plugin/)
- [Gradle Java Plugin](https://docs.gradle.org/current/userguide/java_plugin.html)
- [README-JAVA21.md](README-JAVA21.md) - Installation and setup guide

## Summary

The upgrade to Java 21 primarily involved:
1. ✅ Adding `pom.xml` with Java 21 compiler configuration
2. ✅ Verifying all sources compile with Java 21
3. ✅ Documenting setup and testing procedures
4. ⏭️ Future: Optionally adopt new Java 21 language features

---
*Upgrade Date: Last updated with build configuration changes*
