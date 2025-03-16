public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("写入数据库日志: " + message);
    }
}