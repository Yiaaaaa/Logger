public class Client {
    public static void main(String[] args) {
        // 动态选择文件日志
        LoggerFactory factory = new FileLoggerFactory();
        factory.writeLog("用户登录成功");

        // 动态选择数据库日志
        factory = new DatabaseLoggerFactory();
        factory.writeLog("订单已创建");
    }
}