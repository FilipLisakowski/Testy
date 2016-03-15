package wej01;

import java.util.ArrayList;
import java.util.List;

public class MotorManager {
	ArrayList<Motor> motoList = new ArrayList<Motor>();
	
	public void add(Motor moto){
		motoList.add(moto);
	}
	
	public List<Motor> getAll(){
		return motoList;
	}
}
