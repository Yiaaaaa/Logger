public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("控制台输出日志: " + message);
    }
}