package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructor mal programado: Permite crear fechas no validas
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


	String getmonthname(int month){
		
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
		}
		return name;
		}}


