package folder;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
 * Class to demonstrate WatchDir class
 */
public class UseWarchFolder {

	public static void main(String[] args) throws IOException {
		 // parse arguments
        //if (args.length == 0 || args.length > 2)
           // usage();
        boolean recursive = true;
        //int dirArg = 0;
//        if (args[0].equals("-r")) {
//            if (args.length < 2)
//                usage();
//            recursive = true;
//            dirArg++;
//        }
        Folder f = new Folder();
        
        // register directory and process its events
        Path dir = Paths.get("E://Test/");
        WatchDir wd = new WatchDir(dir, recursive);
        wd.processEvents();
    }

}
