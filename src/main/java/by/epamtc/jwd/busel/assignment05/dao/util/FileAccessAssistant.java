package by.epamtc.jwd.busel.assignment05.dao.util;

import java.io.File;

public class FileAccessAssistant {
    private static final FileAccessAssistant instance = new FileAccessAssistant();
    private final String sourceFileName = "appliances_db.txt";
    private final String sourceFilePath = generateFilePath();

    private FileAccessAssistant() {
    }

    public static FileAccessAssistant getInstance() {
        return instance;
    }

    private String generateFilePath() {
        return System.getProperty("java.class.path") + File.separator
                + sourceFileName;
    }

    public String getSourceFileName() {
        return sourceFileName;
    }

    public String getSourceFilePath() {
        return sourceFilePath;
    }
}
