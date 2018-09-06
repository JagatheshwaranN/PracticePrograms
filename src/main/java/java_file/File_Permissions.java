package java_file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;

public class File_Permissions {
	
	public static void main(String ar[]) throws IOException
	{
		File file = new File("E://ECLIPSE ENV//WorkSpace//JavaBasics/input.txt");
		
		if(file.exists())
		{
			boolean result1 = file.setExecutable(true);
			boolean result2 = file.setReadable(true);
			boolean result3 = file.setWritable(true);
			System.out.println("Set Execute Permission to Owner > " + result1);
			System.out.println("Set Read Permission to Owner > " + result2);
			System.out.println("Set Write Permission to Owner > " + result3);
		}
		else
		{
			System.out.println("File not exists");
		}
		
		if(file.exists())
		{
			boolean result1 = file.setExecutable(true,false);
			boolean result2 = file.setReadable(true,false);
			boolean result3 = file.setWritable(true,false);
			System.out.println("Set Execute Permission to all > " + result1);
			System.out.println("Set Read Permission to all > " + result2);
			System.out.println("Set Write Permission to all > " + result3);
		}
		else
		{
			System.out.println("File not exists");
		}
		
		if(file.exists())
		{
			HashSet<PosixFilePermission> set = new HashSet<PosixFilePermission>();
			
			set.add(PosixFilePermission.OWNER_EXECUTE);
			set.add(PosixFilePermission.OWNER_READ);
			set.add(PosixFilePermission.OWNER_WRITE);
			
			set.add(PosixFilePermission.GROUP_EXECUTE);
			set.add(PosixFilePermission.GROUP_READ);
			set.add(PosixFilePermission.GROUP_WRITE);
			
			set.add(PosixFilePermission.OTHERS_EXECUTE);
			set.add(PosixFilePermission.OTHERS_READ);
			set.add(PosixFilePermission.OTHERS_WRITE);
			
			Files.setPosixFilePermissions(Paths.get("E://ECLIPSE ENV//WorkSpace//JavaBasics/input.txt"), set);

//			System.out.println("File Permissions are set to the user through PosixFilePermission");
			
			
		}
		else
		{
			System.out.println("File not exists");
		}
	}

}
