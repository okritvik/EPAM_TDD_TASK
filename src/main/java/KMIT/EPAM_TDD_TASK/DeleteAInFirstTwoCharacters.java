package KMIT.EPAM_TDD_TASK;
import java.util.*;

public class DeleteAInFirstTwoCharacters {
	
	public String deleteFTwoChar(String string) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<string.length();i++) {
			if(i==0||i==1) {
				if(string.charAt(i)!='A') {
					sb.append(string.charAt(i));
				}
			}
			else {
				sb.append(string.charAt(i));
			}
		}
		return sb.toString();
	}

}
