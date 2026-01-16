# Exercice 1
## Compiled logs
```bash
mvn compile
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 6 source files with javac [debug target 21] to target/classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.418 s
[INFO] Finished at: 2026-01-09T11:39:13+01:00
[INFO] ------------------------------------------------------------------------
```

## File tree like structure
```bash
tree .     
.
├── pom.xml
├── README.md
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── imt
│   │   │           └── mines
│   │   │               ├── ACHServiceImpl.java
│   │   │               ├── ACHService.java
│   │   │               ├── BankAccountApp.java
│   │   │               ├── BankAccount.java
│   │   │               ├── Bank.java
│   │   │               └── Person.java
│   │   └── resources
│   └── test
│       └── java
└── target
    ├── classes
    │   ├── bankAccountApp
    │   └── com
    │       └── imt
    │           └── mines
    │               ├── ACHService.class
    │               ├── ACHServiceImpl.class
    │               ├── BankAccountApp.class
    │               ├── BankAccount.class
    │               ├── Bank.class
    │               └── Person.class
    ├── generated-sources
    │   └── annotations
    └── maven-status
        └── maven-compiler-plugin
            └── compile
                └── default-compile
                    ├── createdFiles.lst
                    └── inputFiles.lst

22 directories, 16 files
```
## Exercice 7
Added dependency for JUnit in the pom.xml:
```xml
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```
## Maven commands
### mvn clean
```bash
mvn clean  
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ bank-application ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.3.4/maven-shared-utils-3.3.4.jar (153 kB at 119 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.6/commons-io-2.6.jar (215 kB at 721 kB/s)
[INFO] Deleting /home/luca/git/BankApplication-Repo2/target
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.281 s
[INFO] Finished at: 2026-01-09T11:53:06+01:00
[INFO] ------------------------------------------------------------------------
```
#### Which phases of the Maven lifecycle are executed?
The `clean` phase is executed, which removes the target directory and all its contents.
#### What new files or folders appear in target/?
No new files or folders appear in target/; instead, the target/ directory is deleted.
### mvn test
```bash
 mvn test 
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.17/maven-surefire-plugin-2.17.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.17/maven-surefire-plugin-2.17.pom (5.0 kB at 4.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.17/surefire-2.17.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/2.17/surefire-2.17.pom (17 kB at 46 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.17/maven-surefire-plugin-2.17.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/2.17/maven-surefire-plugin-2.17.jar (34 kB at 75 kB/s)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 6 source files with javac [debug target 21] to target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[INFO] skip non existing resourceDirectory /home/luca/git/BankApplication-Repo2/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Recompiling the module because of changed dependency.
[INFO] 
[INFO] --- surefire:2.17:test (default-test) @ bank-application ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/2.0.9/maven-plugin-api-2.0.9.pom
...
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.363 s
[INFO] Finished at: 2026-01-09T11:53:22+01:00
[INFO] ------------------------------------------------------------------------
```
#### Which phases of the Maven lifecycle are executed?
The `validate`, `compile`, and `test` phases are executed.
#### What new files or folders appear in target/?
A `test-classes` directory appears in the `target/` folder, which contains the compiled test classes.
### mvn package
```bash
 mvn package
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.1.2/maven-jar-plugin-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.1.2/maven-jar-plugin-3.1.2.pom (7.3 kB at 6.7 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/33/maven-plugins-33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/33/maven-plugins-33.pom (11 kB at 47 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom (44 kB at 110 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.1.2/maven-jar-plugin-3.1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.1.2/maven-jar-plugin-3.1.2.jar (28 kB at 213 kB/s)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[INFO] skip non existing resourceDirectory /home/luca/git/BankApplication-Repo2/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:2.17:test (default-test) @ bank-application ---
[INFO] 
[INFO] --- jar:3.1.2:jar (default-jar) @ bank-application ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.0/maven-plugin-api-3.0.pom
...
[INFO] Building jar: /home/luca/git/BankApplication-Repo2/target/bank-application-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.053 s
[INFO] Finished at: 2026-01-09T11:54:58+01:00
[INFO] ------------------------------------------------------------------------
```
#### Which phases of the Maven lifecycle are executed?
The `package` phase is executed
#### What new files or folders appear in target/?
A JAR file named `bank-application-1.0-SNAPSHOT.jar` appears in the `target/` folder.
### mvn verify
```bash
mvn verify 
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[INFO] skip non existing resourceDirectory /home/luca/git/BankApplication-Repo2/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:2.17:test (default-test) @ bank-application ---
[INFO] 
[INFO] --- jar:3.1.2:jar (default-jar) @ bank-application ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.245 s
[INFO] Finished at: 2026-01-09T11:57:07+01:00
[INFO] ------------------------------------------------------------------------
```
#### How is verify different from test and package?
The `verify` phase runs any checks to verify the package is valid and meets quality criteria, while the `test` phase runs the unit tests and the `package` phase creates the JAR file. 

# Exercice 8
## Test class
Test class for `BankAccount.java`:
```java
package com.imt.mines;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void depositMoney_increasesBalance() throws Exception {
		Person holder = new Person("Alex", 'M', 30, 70.0f, 175.0f, "Black", "Brown", "alex@example.com");
		BankAccount account = new BankAccount(50.0, 200.0, "2024-01-01", holder);

		account.depositMoney(100.0);

		assertEquals(150.0, account.getBalance(), 0.0001);
	}

	@Test
	void withdrawMoney_overBalance_isRejected() throws Exception {
		Person holder = new Person("Sam", 'F', 28, 60.0f, 165.0f, "Brown", "Green", "sam@example.com");
		BankAccount account = new BankAccount(50.0, 200.0, "2024-01-01", holder);

		boolean result = account.withdrawMoney(60.0);

		assertFalse(result);
		assertEquals(50.0, account.getBalance(), 0.0001);
	}
}
```
## mvn test logs
```bash
mvn test   
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.imt.mines:bank-application >-------------------
[INFO] Building bank-application 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ bank-application ---
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ bank-application ---
[INFO] skip non existing resourceDirectory /home/luca/git/BankApplication-Repo2/src/test/resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ bank-application ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ bank-application ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.jar
...
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.2/junit-platform-launcher-1.10.2.jar (184 kB at 2.0 MB/s)
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.imt.mines.BankAccountTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.060 s -- in com.imt.mines.BankAccountTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.631 s
[INFO] Finished at: 2026-01-09T12:16:30+01:00
[INFO] ------------------------------------------------------------------------
```

# Exercice 9
## Prerequisites
Added the following plugins to the `pom.xml`:
```xml
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.11</version>
                <executions>
                    <execution>
                        <id>prepare-agent</id>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>report</id>
                        <phase>test</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
```
## mvn test logs with coverage report
Inside the `JaCoCo` test logs coverage report we can see that `BankAccount` class has a coverage of 20%. 
I choose to make a test for the method `getDateCreated` because it had a coverage of 0%.
```java
	@Test
	void getDateCreated_returnsConstructorDate() throws Exception {
		Person holder = new Person("Taylor", 'F', 26, 58.0f, 168.0f, "Blonde", "Hazel", "taylor@example.com");
		BankAccount account = new BankAccount(50.0, 200.0, "2024-03-15", holder);

		assertEquals("2024-03-15", account.getDateCreated());
	}
```
---
Now when i run `mvn test` again, the coverage report in `target/site/jacoco/index.html` shows that the `BankAccount` class's method `getDateCreated` has a coverage of 100%.
But the class `BankAccount` still has a coverage of 20%.

# Exercice 10
The Github Workflow file `.github/workflows/maven.yml` is as follows:
```yaml
name: Maven CI

on:
  push:
    branches:
      - main

jobs:
  test-and-package:
    runs-on: ubuntu-latest
    steps:
      - name: Checkout repo
        uses: actions/checkout@v4

      - name: Set up JDK
        uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: 21

      - name: Run tests
        run: mvn clean test

      - name: Package build
        run: mvn package

      - name: Upload build artifacts
        uses: actions/upload-artifact@v4
        with:
          name: build-artifacts
          path: target/
```