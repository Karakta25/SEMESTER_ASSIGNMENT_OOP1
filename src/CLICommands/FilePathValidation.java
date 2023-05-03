package CLICommands;

import java.io.File;
import java.io.IOException;

public interface FilePathValidation {

    public static boolean isValidFilePath(String path) {
        File f = new File(path);
        try {
            f.getCanonicalPath();
            return true;
        }
        catch (IOException e) {
            return false;
        }
    }
}
