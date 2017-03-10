package me.hourui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这个配置类需要在 src/main/resources/META-INF/spring.factories 中进行声明
 * Bean 注解会自动的生成一个 TestHello 的对象,以保证该对象之后可以被注入
 *
 * @author of2603 hourui
 * @date 2017-03-10
 */
@Configuration
@EnableConfigurationProperties(TestConfigurationProperties.class)
public class TestAutoConfiguration {

    @Autowired
    private TestConfigurationProperties testConfigurationProperties;

    /**
     * Configuration 和这个 Bean 注解的作用就是生成一个 TestHello 对象方便注入
     * @return
     */
    @Bean
    public TestHello getInstance() {
        return new TestHello(testConfigurationProperties.getName());
    }

}
