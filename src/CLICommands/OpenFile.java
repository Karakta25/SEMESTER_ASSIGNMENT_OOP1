package CLICommands;

import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class OpenFile implements CommandParser {


    @Override
    public void commandParser(String filename) {

        //String[] str_arr = filename.replaceAll(Pattern.quote(separator), "\\\\").split("\\\\");
        //String[] file = filename.split("\\ |");
        //String separator = "\\";


        if(FilePathValidation.isValidFilePath(filename))
        {
            String target="\\";
            String replacement="\\\\";
            filename = filename.replace(target, replacement);
            String[] strArray = filename.split(replacement);
            String xmlFile = strArray[strArray.length - 1];

        }


    }
}

