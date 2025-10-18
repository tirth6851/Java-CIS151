Upgrade guide to Java 21

What I changed:

- Added a minimal `pom.xml` at the project root to allow building with Maven and target Java 21.

How to test locally:

1. Install JDK 21 and Maven if you don't already have them.
2. From the repo root run:

```bash
mvn -v
mvn -q -DskipTests package
```

This will compile the `brocode` sources using Java 21 settings.

Notes & next steps:

- If your CI uses Gradle or another tool, create an equivalent `build.gradle`.
- If you'd like, I can attempt automated code migrations (OpenRewrite) but that requires Copilot Pro features in this environment. I can still run a local manual upgrade flow and fix compilation issues if they appear.
