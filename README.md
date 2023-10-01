# DumbMathLibrary
In settings.gradle:
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
In build.gradle:
```groovy
implementation 'com.github.ldthunder:DumbMathLibrary:1.3'
```
