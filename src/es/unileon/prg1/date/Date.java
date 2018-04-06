

public class Date {
	private int day;
	private int month;
	private int year;

	

	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getYear(){
		return this.year;
	}

	boolean isSameYear(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		else{
			return false;
		}
	}
	public int getMonth(){
		return this.month;
	}
	
	boolean isSameMonth(Date another){
		if(this.month == another.getMonth() ){
			return true;
		}
		else{
			return false;
	}

		
	}
	public int getDay(){
		return this.day;
	}
	boolean isSameDay(Date another){

		if(this.day == another.getDay() ){
			return true;
		}
		else {
			return false;
		}
		
	}
	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	//devuelve el nombre del mes 
	
	String getMonthName(){
	String name;	
		switch(this.month){
			case 1:
				name="enero";
				break;
			case 2:
				name="febrero";
				break;
			case 3:
				name="marzo";
				break;
			case 4:
				name="abril";
				break;
			case 5:
				name="mayo";
				break;
			case 6:
				name="junio";
				break;
			case 7:
				name="julio";
				break;
			case 8:
				name="agosto";
				break;
			case 9:
				name="septiembre";
				break;
			case 10:
				name="octubre";
				break;
			case 11:
				name="noviembre";
				break;
			case 12:
				name="diciembre";
				break;
			default:
				name= "ERROR";
		}
		return name;
		}
	//dice la estacion en la que se encuentra
		
		String getSeasonName() {
		String season;	
			switch(this.month){
				
				case 1:
				case 2:
				case 3:
					season="invierno";
					break;
				case 4:
				case 5:
				case 6:
					season="primavera";
					break;
				case 7:
				case 8:
				case 9:
					season="verano";
					break;
				case 10:
				case 11:
				case 12:
					season="otoño";
					break;

				default:
					season= "ERROR";
				}
			return season;
			
		}				
		//comprueba que el dia es corecto 
	
		String getcorrectDayName(){
		String correctDay;
		switch(this.day){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(day<=31){ 
						correctDay="correct";
					}
					else{
						correctDay="ERROR";
					}
					break;
				case 2:
					if((day<=28)||(day<=29)){
						correctDay="correct";
					}
					else{
						correctDay="ERROR";
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(day<=30){
						correctDay="correct";
					}
					else{
						correctDay="ERROR";
					}
					break;
					
				default:
					correctDay= "ERROR";
				}
			return correctDay;
			}
			String monthsLeft(){
				String month1=" ";
				StringBuilder months= new StringBuilder();
			for(int i=month;i<=12;i++){
				month1=i;
			
}
		return month1.toString();
	}
		
		}

