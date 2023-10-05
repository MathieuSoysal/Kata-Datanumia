[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=MathieuSoysal_Kata-Datanumia)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)

# Kata - Datanumia
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=coverage)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia) 
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)


## 🟢 DevOps

### Bonus - Devcontainer

I have added a devcontainer to use VSCode in a container with all the tools needed to work on the project. It's a good way to have a common environment for all the developers. It will install automatically the tools (java, maven, sonar-scanner, ...) needed to work on the project.

To use it, you need to install the [Remote - Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) extension.



## Refactor
### 🔴 Bad practices in Test :
- **Name of the tests**

  Sometimes the name doesn't have the appropriate norm or does not follow the appropriate name of other tests.

- Content of the tests

  The test can be repetitive and redundant at times, or it may perform unnecessary work.

### 🟢 Solution to refactor test:

- **Test parametrized**

  I employed the parametrized test to decrease code repetition and enhance the readability of the tests.

- **Rename methods of tests**
  To uniformize the naming of some methods, to follow the rules of the naming convention of Java, and to follow the naming norm of other methods. 

### 🔴 Bad practices in the main code :

- **Too many methods in the same class**

  The main class Yatzy contains too many methods. Some of them are too long or do not follow good name norming. The *Single responsibility principle* is not respected.

- **Too many parameters in the same method**

  Some methods have too many parameters or the parameters don't follow the good name norming.

- **Bad scoping of the methods**

  Methods don't have a uniform scope, some methods are static, and some methods are not static.
  

### 🟢 Solution to refactor the main code:

- **Split the main class Yatzy**

  I split the class Yatzy into several classes. Each class has a specific role. It's easier to read and understand the code. To split the class, I used the design pattern command. I created a class for each kind of score calculator, and I created a class to manage the score calculator. The class Yatzy is now a facade and the *Single responsibility principle* is respected.

- **Handling the incorrect dice values**

  I added a method to check if the dice values are correct. If not, it will throw an exception.

- **Reduce the number of parameters**

  I reduced the number of parameters of some methods. To do that, I created a new class *Dices* to manage the dices. I also renamed some parameters to follow the norming convention of Java.

- **Reduce the size of methods**

  I reduced the size of the methods to make them more readable and easier to understand. To do that I used IntStream and Stream API. I also renamed some methods to follow the good name norming.

## 🟢 DevOps

### Bonus - GitHub Actions - SonarCloud

I have added GitHub Actions to run SonarCloud analysis on each push on the master branch. It will check the code quality and the code coverage of the project.

To see the result of the analysis, click on the badge at the top of the README.

________

*Thanks you for reading me !*
