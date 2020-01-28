## 逆旅社区 

## 资料
[Spring 文档](https://spring.io/guides)   
[Spring Web](https://spring.io/guides/gs/serving-web-content/)  
[es](https://elasticsearch.cn/explore)  
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)   
[Bootstrap](https://v3.bootcss.com/getting-started/)    
[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)
[菜鸟教程](https://www.runoob.com/mysql/mysql-insert-query.html)
[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)
[Spring Dev Tool](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#using-boot-devtools)   
[Spring MVC](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/web.html#mvc-handlermapping-interceptor)   
[Markdown 插件](http://editor.md.ipandao.com/)    
[UFile SDK](https://github.com/ucloud/ufile-sdk-java)   
[Count(*)VS Count(1)](https://mp.weixin.qq.com/s/Rwpke4BHu7Fz7KOpE2d3Lw)
## 工具
[Git](https://git-scm.com/download)     
[Visual Paradigm](https://www.visual-paradigm.com)
[flyway](https://flywaydb.org/getstarted/firststeps/maven)
[Lombok](https://projectlombok.org)    

## 脚本
```sql
CREATE TABLE USER(
    "ID" INT AUTO INCREMENT PRIMARY KEY NOT NULL,
    "ACCOUNT_ID" VARCHAR(100),
    "NAME" VARCHAR(50),
    "TOKEN" CHAR(36),
    "GMT_CREATE" BIGINT,
    "GMT_MODIFIED" BIGINT
)
```
```bash
mvn flyway:migrate
```