# J2ee
该项目是一个集Servlet、JSP、MVC模式、Listener、Filter的练习汇总。
主要练习：bean包中是英雄类，dao包中只有一个英雄数据访问类，与本地MySQl数据库关联，包含基本的增删改查动作。servlet包中各个类调用dao包里的类对英雄类进行增删改查操作，用JSP对英雄信息进行分页展示。展示页面有增删改选项。整个流程MVC模式实现。
除此之外，就是基本的练习，如下：
1，与本地MySQL关联，检索数据库，实现用户登录功能；
2，Listener练习：ContextListener，ContextAttributeListener，SessionListener，SessionAttributeListener，RequestListener，在线人数统计。
3，Filter练习:firstFilter打印IP地址和访问url地址，EncodingFilter实现UTF编码格式，AuthFilter实现用户登录信息检查。
4，JSP练习：EL表达式练习和JSTL练习。
