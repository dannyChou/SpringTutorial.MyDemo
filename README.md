# SpringTutorial.MyDemo
SpringTutorial


Spring Boot以JSP方式呈現VIEW層介紹

    1.在application.properties加入底下這兩行
    
spring.mvc.view.prefix = /WEB-INF/jsp/
<BR>
spring.mvc.view.suffix =  .jsp

註解：
<BR>
#spring.thymeleaf.prefix=classpath:/templates/
<BR>

    2.在pom檔案放入底下的依賴
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
    	</dependency> -->



>Spring MVC-@Service的使用

    需設定下列
    @SpringBootApplication(scanBasePackages="com.example")
    public class DemoApplication {

	    public static void main(String[] args) {
		    SpringApplication.run(DemoApplication.class, args);
	    }

    }


>MariaDB-安裝


>Spring Boot-JDBC與資料庫連線範例-MariaDB

