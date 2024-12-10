# SIndhura-Patel-Shnakeshi_Lekha-Reddy-Surakanti_Pranathi-Induri
<p align="center">
  <img width="160" height="160" src="https://cdn-icons-png.freepik.com/512/10435/10435114.png">
  <h1 align="center">LeetcodeJavaDebugEnhancer </h1>
  <p align="center">🚀 A local debugging enhancer for Leetcode algorithm problems in Java 🚀</p>
  <p align="center">
     <a href="LICENSE">
      <img alt="License" src="https://img.shields.io/github/license/Jidcoo/LeetcodeJavaDebugEnhancer?label=License">
     </a>
     <a href="https://github.com/Jidcoo/LeetcodeJavaDebugEnhancer/actions/workflows/maven-build.yml">
      <img alt="Maven Build Status" src="https://github.com/Jidcoo/LeetcodeJavaDebugEnhancer/actions/workflows/maven-build.yml/badge.svg">
     </a> 
     <a href="https://github.com/Jidcoo/LeetcodeJavaDebugEnhancer/actions/workflows/maven-release.yml">
      <img alt="Maven Release Status" src="https://github.com/Jidcoo/LeetcodeJavaDebugEnhancer/actions/workflows/maven-release.yml/badge.svg">
     </a>
     <a href="https://github.com/Jidcoo/LeetcodeJavaDebugEnhancer/releases">
      <img alt="GitHub Release" src="https://img.shields.io/github/v/release/Jidcoo/LeetcodeJavaDebugEnhancer?label=Release">
     </a>
     <a href="https://central.sonatype.com/artifact/io.github.jidcoo/leetcode-java-debug-enhancer">
      <img alt="Maven Central Version" src="https://img.shields.io/maven-central/v/io.github.jidcoo/leetcode-java-debug-enhancer?label=Maven%20Central"> 
     </a>
     <a href="https://github.com/Jidcoo/LeetcodeJavaDebugEnhancer/issues?query=is%3Aissue&label=issue">
      <img alt="GitHub Issues" src="https://img.shields.io/github/issues/Jidcoo/LeetcodeJavaDebugEnhancer?label=Issue">
     </a>
  </p>
  <p align="center"> [<a href="README.md">English</a>] [<a href="README.ZH-CN.md">中文</a>] </p>
</p>


<br>

## 🎯 Goals

- Provide convenient and fast debugging functions.
- Support diverse input and output sources.
- Adapt to various input parameter types automatically.




## 🔧 Download & Install

### Download

#### **Maven**

```xml
<dependency>
    <groupId>io.github.jidcoo</groupId>
    <artifactId>leetcode-java-debug-enhancer</artifactId>
    <version>1.0.2</version>
</dependency>
```

#### **Gradle**

```gradle
implementation 'io.github.jidcoo:leetcode-java-debug-enhancer:1.0.2'
```

#### **Jar**

| Resource         | Index                                                                                                                                                                                        |
| ------------ |----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Repository Hosting    | [Click here to browse the repository for this project](https://central.sonatype.com/artifact/io.github.jidcoo/leetcode-java-debug-enhancer/)                                                 |
| Standard-Jar | [Click here to download directly(Standard-Jar)](https://repo1.maven.org/maven2/io/github/jidcoo/leetcode-java-debug-enhancer/1.0.2/leetcode-java-debug-enhancer-1.0.2.jar)                   |
| Full-Jar     | [Click here to download directly(Full-Jar)](https://repo1.maven.org/maven2/io/github/jidcoo/leetcode-java-debug-enhancer/1.0.2/leetcode-java-debug-enhancer-1.0.2-jar-with-dependencies.jar) |

### Install

Just import **LeetcodeJavaDebugEnhancer** as the project library.

### Requirements

- The minimum supported Java version is **Java 8**.
- **LeetcodeJavaDebugEnhancer** depends on [Gson](https://github.com/google/gson), version [2.10.1](https://central.sonatype.com/artifact/com.google.code.gson/gson/2.10.1). For non Maven, non Gradle projects that do not include the Gson library, please use **Full-Jar** or manually import Gson library to your project.




## 🛠 Basic Usage

### Step 1:

Create a Java class called SimpleTest and ensure that SimpleTest is public:

```java
//SimpleTest.java

public class SimpleTest {

}
```

### Step 2:

Import `io.github.jidcoo.opto.lcdb.enhancer.LeetcodeJavaDebugEnhancer` into SimpleTest, and then declare SimpleTest to inherit from the class `LeetcodeJavaDebugEnhancer`:

```java
//SimpleTest.java

import io.github.jidcoo.opto.lcdb.enhancer.LeetcodeJavaDebugEnhancer;

public class SimpleTest extends LeetcodeJavaDebugEnhancer {

}
```

### Step 3:

Paste the Java code of the questions on the Leetcode into the SimpleTest and write the corresponding algorithm code to complete the requirements of the questions. Let's take the question [Two Sum](https://leetcode.com/problems/two-sum/) for example: 

```java
//SimpleTest.java

import io.github.jidcoo.opto.lcdb.enhancer.LeetcodeJavaDebugEnhancer;

public class SimpleTest extends LeetcodeJavaDebugEnhancer {
    
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }

}
```

### Step 4:

Click on the Run or Debug button of SimpleTest to run SimpleTest and start the debugging enhancer.

After the debugging enhancer starts, you will see the following output: 

```
LeetcodeJavaDebugEnhancer[1.0.2] started.
```

> Case input rule: One Case occupies one line, and the next Case needs to be input on the next line. The completion flag for a Case is encountering a new-line break or the EOF.


Then enter the following debugging parameter Case in the console:

```
[2,7,11,15] 9
[3,2,4] 6
[3,3] 6

```

Next, the enhancer will run the algorithm code based on the input Case and output the algorithm results to the console:

```
[0,1]
[1,2]
[0,1]
```




## 📚 LeetcodeJavaDebugEnhancer Function Details


### 1. Support diverse input sources

#### API

```java
public InputProvider getInputProvider();
```

#### Description

**LeetcodeJavaDebugEnhancer** provides support for a variety of input sources such as
Console([ConsoleInputProvider](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/core/io/builtin/ConsoleInputProvider.java)),
File/Stream([FileInputProvider](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/core/io/builtin/FileInputProvider.java)),
String([StringInputProvider](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/core/io/builtin/StringInputProvider.java)) and
SerialMultipleInput([MultipleInputProvider](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/core/io/builtin/MultipleInputProvider.java))
.

**LeetcodeJavaDebugEnhancer** uses the console as the default input source.

If you want to customize the input source, please return a valid [**InputProvider**](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/base/InputProvider.java) by overwriting this method.


#### Example<a name="ref1"></a>

Assuming there is now a file named "input.txt", the file content is as follows:

```
[2,7,11,15] 9
[3,2,4] 6
[3,3] 6
```

Here is an example code that uses the input.txt file as the input source:

```java
//SimpleTest.java

import io.github.jidcoo.opto.lcdb.enhancer.LeetcodeJavaDebugEnhancer;
import io.github.jidcoo.opto.lcdb.enhancer.base.InputProvider;
import io.github.jidcoo.opto.lcdb.enhancer.core.io.builtin.FileInputProvider;

import java.io.FileNotFoundException;

public class SimpleTest extends LeetcodeJavaDebugEnhancer {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }

    @Override
    public InputProvider getInputProvider() {
        try {
            // FileInputProvider can accept file-name, file-object, and input-stream as construction parameters.
            return new FileInputProvider("input.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
```



### 2. Support diverse output sources

#### API

```java
public OutputConsumer getOutputConsumer();
```

#### Description

**LeetcodeJavaDebugEnhancer** provides support for a variety of output sources such as
Console([ConsoleOutputConsumer](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/core/io/builtin/ConsoleOutputConsumer.java)),
File/Stream([FileOutputConsumer](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/core/io/builtin/FileOutputConsumer.java)) and
ParallelMultipleOutput([MultipleOutputConsumer](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/core/io/builtin/MultipleOutputConsumer.java))
.

**LeetcodeJavaDebugEnhancer** uses the console as the default output source.

If you want to customize the output source, please return a valid [**OutputConsumer**](src/main/java/io/github/jidcoo/opto/lcdb/enhancer/base/OutputConsumer.java) by overwriting this method.


#### Example

Continuing from [the above example](#ref1), the following is an example code that uses the input.txt file as the input source and the output.txt file as the output source:

```java
//SimpleTest.java

import io.github.jidcoo.opto.lcdb.enhancer.LeetcodeJavaDebugEnhancer;
import io.github.jidcoo.opto.lcdb.enhancer.base.InputProvider;
import io.github.jidcoo.opto.lcdb.enhancer.base.OutputConsumer;
import io.github.jidcoo.opto.lcdb.enhancer.core.io.builtin.FileInputProvider;
import io.github.jidcoo.opto.lcdb.enhancer.core.io.builtin.FileOutputConsumer;

import java.io.FileNotFoundException;

public class SimpleTest extends LeetcodeJavaDebugEnhancer {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }

    @Override
    public InputProvider getInputProvider() {
        try {
            // FileInputProvider can accept file-name, file-object, and input-stream as construction parameters.
            return new FileInputProvider("input.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public OutputConsumer getOutputConsumer() {
        try {
            // FileOutputConsumer can accept file-name, file-object, and ouput-stream as construction parameters.
            return new FileOutputConsumer("output.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
```
