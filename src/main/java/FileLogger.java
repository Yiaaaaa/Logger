public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("写入文件日志: " + message);
    }
}