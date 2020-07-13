###Dubbo使用心得
- 1、因为dubbo的维护权转交，所以原油的schema已经失效，要以现在工程中的spring-dubbo-service.xml为主
    
- 2、使用multicast:-Djava.net.preferIPv4Stack=true
    需要在启动的时候设定
        System.setProperty("java.net.preferIPv4Stack", "true");
        
- 3、在window中查看端口占用情况：netstat -aon|findstr “8080” -->4008（最后一行数字）

- 4、 在window中查看那个进程使用了指定端口：tasklist|findstr “4008”  -->wechat

- 5、 在window中杀掉进程：taskkill /f /t /im wechat.exe。

- 6、