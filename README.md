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