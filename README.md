# SpringTutorial.MyDemo
SpringTutorial


Spring Boot以JSP方式呈現VIEW層介紹

1)在application.properties加入底下這兩行
spring.mvc.view.prefix = /WEB-INF/jsp/
spring.mvc.view.suffix =  .jsp

註解：
#spring.thymeleaf.prefix=classpath:/templates/

2)在pom檔案放入底下的依賴
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>

<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <scope>provided</scope>
</dependency>

將下列註解
		<!-- <dependency>
      		<groupId>org.springframework.boot</groupId>
      		<artifactId>spring-boot-starter-thymeleaf</artifactId>
    	</dependency>	 -->
