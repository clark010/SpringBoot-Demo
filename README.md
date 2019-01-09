# test-projects
multi level modules with assembly

项目结构
```
├── assembly
│   └── src
│       └── main
│           └── assembly
├── bin
├── build-configuration
├── conf
├── module1
│   ├── submodule0-common
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── com
│   │       │   │       └── clark010
│   │       │   │           └── test
│   │       │   └── resources
│   │       └── test
│   │           └── java
│   ├── submodule1
│   │   ├── conf
│   │   └── src
│   │       ├── main
│   │       │   ├── java
│   │       │   │   └── com
│   │       │   │       └── clark010
│   │       │   │           └── test
│   │       │   └── resources
│   │       └── test
│   │           └── java
│   └── submodule2-springboot
│       └── src
│           ├── main
│           │   ├── java
│           │   │   └── com
│           │   │       └── clark010
│           │   │           └── test
│           │   │               ├── bean
│           │   │               └── controller
│           │   └── resources
│           └── test
│               └── java
├── module2
│   └── src
│       ├── main
│       │   ├── java
│       │   │   └── com
│       │   │       └── clark010
│       │   │           └── test
│       │   └── resources
│       └── test
│           └── java
└── src
    ├── main
    │   ├── java
    │   └── resources
    └── test
        └── java
```

其中依赖关系为
submodule2-springboot =====> submodule0-common / module2
submodule1 =====> submodule0-common / submodule2-springboot

-------------
* `mvn clean package`
* `cd module1/submodule2-springboot/target && java -jar submodule2-springboot-1.0-SNAPSHOT.jar`
* `curl 127.0.0.1:8080/get/index/1/2`