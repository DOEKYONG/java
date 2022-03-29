package Team_0323_½Å´ö¿ë;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DB {

	public void memberSave() {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("D:/memberDB1.txt");
			
			for(Member temp : Controller.memberlist) {
				String memberSave = temp.getId()+","+temp.getPw()+","+temp.getName()+","+temp.getPhone()+","+temp.isCheck()+"\n";
				fileOutputStream.write(memberSave.getBytes());
			}
		}catch(Exception e) {}
		
		
		
	}
	
	public void memberLoad() {
		
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/memberDB1.txt");
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			String file = new String(bytes);
			String[]list = file.split("\n");
			int i = 0 ;
			for(String temp : list) {
				if(i+1 == list.length) {
					break;
				}
				String[] filed =temp.split(",");
				Member temp2 = new Member(filed[0],filed[1],filed[2],filed[3],Boolean.parseBoolean(filed[4]));
				Controller.memberlist.add(temp2);
				i++;
			}
		}catch(Exception e) {}
	}
	
	public void movieSave() {
		try {
			FileOutputStream outputStream = new FileOutputStream("D:/movieDB1.txt");
			
			for(Movie temp : Controller.movielist) {
				String movieSave = temp.getTitle()+","+temp.getIntime()+","+temp.getRuntime()+","+temp.getMoney()+"\n";
				outputStream.write(movieSave.getBytes());
			}
		}
		catch(Exception e) {
			
		}
	}
	
	public void movieLoad() {
		try {
		FileInputStream fileInputStream = new FileInputStream("D:/movieDB1.txt");
		byte[] bytes = new byte[1024];
		fileInputStream.read(bytes);
		String file = new String(bytes);
		String[]list = file.split("\n");
		int i = 0;
		for(String temp : list ) {
			if( i+1 == list.length ) {
				break;
			}
			String[] filed = temp.split(",");
			Movie temp2 = new Movie(filed[0],filed[1],filed[2],Integer.parseInt(filed[3]));
			Controller.movielist.add(temp2);
			i++;
		}
		
		
		}catch(Exception e) {}
		
		
		
	}
	
	public void ticketSave() {}
	
	public void ticketLoad() {}
	
}
