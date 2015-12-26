package microsoft;

public class SecAreaCheck {

	public static void main(String[] args) {
		String date = "02:52:55";
		String[] dateArr = date.split(":");
		secCheck((Integer.parseInt(dateArr[0])/12)*360, Integer.parseInt(dateArr[1]) * 60, Integer.parseInt(dateArr[2]) * 60);
	}
	
	static void secCheck(double hr, double min, double sec){
		if(hr > min){
			if(hr - min > 180){
				if(sec < min){
					System.out.println("Smaller");
					return;
				}else if(sec>min && sec<hr){
					System.out.println("Larger");
					return;
				}else if(sec>hr){
					System.out.println("Smaller");
					return;
				}
			}else if(hr-min<180){
				if(sec < min){
					System.out.println("Larger");
					return;
				}else if(sec>min && sec<hr){
					System.out.println("Smaller");
					return;
				}else if(sec>hr){
					System.out.println("Larger");
					return;
				}
			}
		}else{ // hr<min
			if(min - hr > 180){
				if(sec < hr){
					System.out.println("Smaller");
					return;
				}else if(sec>hr && sec<min){
					System.out.println("Larger");
					return;
				}else if(sec>min){
					System.out.println("Smaller");
					return;
				}
			}else if(min-hr<180){
				if(sec < hr){
					System.out.println("Larger");
					return;
				}else if(sec>hr && sec<min){
					System.out.println("Smaller");
					return;
				}else if(sec>min){
					System.out.println("Larger");
					return;
				}
			}
		}
	}
}
