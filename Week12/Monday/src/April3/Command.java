package April3;

public class Command {
    private String cmd;
    private String cmdString;

    public Command(String cmd, String cmdString) {
        this.cmd = cmd;
        this.cmdString = cmdString;
    }

    public String getCmd() {
        return cmd;
    }

    public String getCmdString() {
        return cmdString;
    }

    @Override
    public String toString() {
        return "Command{" +
                "cmd='" + cmd + '\'' +
                ", cmdString='" + cmdString + '\'' +
                '}';
    }
}
