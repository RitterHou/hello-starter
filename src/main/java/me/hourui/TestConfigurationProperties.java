package me.hourui;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置 properties 的前缀和相关属性,之后需要提供 get 和 set 方法
 *
 * @author of2603 hourui
 * @date 2017-03-10
 */
@ConfigurationProperties(prefix = "test")
public class TestConfigurationProperties {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
