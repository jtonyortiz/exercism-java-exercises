public class LogLevels {
    private String logLine;


    public static String message(String logLine) {
        int getIndexBegin = logLine.indexOf(':');
        int getIndexEnd = logLine.length();

        String newMessage = logLine.substring(getIndexBegin + 1, getIndexEnd);
        newMessage = newMessage.strip();
        return newMessage;
    }

    public static String logLevel(String logLine) {
        int getIndexBegin = logLine.indexOf('[');
        int getIndexEnd = logLine.indexOf(']');

        String newMessage = logLine.substring(getIndexBegin + 1, getIndexEnd);
        newMessage = newMessage.strip().toLowerCase();
        return newMessage;
    }

    public static String reformat(String logLine) {
        //Extract message line with indexOf method
        int getIndexBegin = logLine.indexOf(':');
        int getIndexEnd = logLine.length();

        String message = logLine.substring(getIndexBegin + 1, getIndexEnd);
        message = message.strip(); //Strip leading white-space from string
        //Extract log message, save substring in new variable as lowercase
        int logBegin = logLine.indexOf('[');
        int logEnd = logLine.indexOf(']');
        String logMessage = logLine.substring(logBegin + 1, logEnd);
        logMessage = logMessage.strip().toLowerCase();

        //Retrun concatenated string:
        return message + " " + "(" + logMessage + ")";
    }
}
