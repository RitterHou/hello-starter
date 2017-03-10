spring-boot 把大量的配置交给了`starter`来完成，和以前使用繁琐的 xml 文件来进行配置相比，这种方式显然有着巨大优势，并且也符合约定优于配置的理念。

spring-boot 团队已经为那些流行的组件（例如：MySQL，Redis）写了 starter 的配置，也许你需要自定义一个 starter，这是一个自定义 spring-boot-starter 的例子。

hello-starter 即是一个 starter 配置项目，先在其根目录执行 `mvn install` 操作来把其安装到本地的 Maven 的 Repository 中，之后新建一个 spring-boot 项目，在 pom.xml 引入如下的依赖：
```xml
<dependency>
    <groupId>me.hourui</groupId>
    <artifactId>test-starter</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

之后在新的项目的 application.properties 中添加一个 `test.name=zhangsan` 的的配置，之后定义一个 `TestHello` 的对象，并执行其 `syaHello()` 方法，即可打印出我们所配置的属性：
```java
// 定义数据
@Autowired
private TestHello testHello;
```

```java
// 执行方法
testHello.syaHello();
```

这里的 starter 只是使用了一些最简单的功能，一些更复杂的配置与功能可以查看 <http://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-auto-configuration.html>
