import java.nio.file.Path;
import java.nio.file.Paths;

public class ArchiveTests{


	public static void main(String [] args){

		// Java 7 implementation 
		Path path = Path.get("C:/xti/files/text.txt");

		// To obtain the path from an file
		System.out.println(path.toAbsolutePath());

		// Obtain the main folder
		System.out.println(path.getParent());

		// This command will print the directory
		System.out.println(psth.getRoot())

		// This command will obtain the name of the files
		System.out.println(path.getFileName());

		/* Directory creation*/
		// This command will create a new directory 
		Files.createDirectories(path.getParent());


		/*
			The commands getBytes and files.Writing, Files.readAllBytes
			are use to performe the writing and read of smaill files
			content.
		*/
		/* Writing and reading a files*/
		byte[] bytes = "My text".getBytes();

		// the files writing will create, clear and write the files data.
		Files.writing(path, bytes);
	
		/* Reading the content of a file.*/

		byte[] returnT = Files.readAllBytes(path);
		System.out.println(new String(returnT));

	}
	




}