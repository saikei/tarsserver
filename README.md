# taf测试服务端
- 配置文件在resources/taf.conf下面，主要有app 、server，详细请阅读taf-java教程
- 直接使用maven编译即可mvn clean package
- 编译后启动命令需要加上-Dconfig配置文件
    例如:java -jar -Dconfig=./taf.conf ./helloworld.jar