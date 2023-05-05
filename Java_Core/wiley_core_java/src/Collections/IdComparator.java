package Collections;

import java.util.Comparator;

public class IdComparator implements Comparator<GeniusStudent>{

	@Override
	public int compare(GeniusStudent o1, GeniusStudent o2) {
		// TODO Auto-generated method stub
		if(o1.getId() == o2.getId()) {
			return o1.getName().compareTo(o2.getName());
		}
		else if(o1.getId() > o2.getId()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
//	public int compare(GeniusStudent o1, GeniusStudent o2) {
//		// TODO Auto-generated method stub
//		if(o1.getStipend() == o2.getStipend()) {
//			return 0;
//		}
//		else if(o1.getStipend() > o2.getStipend()) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
}
