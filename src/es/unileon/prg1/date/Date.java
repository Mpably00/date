

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
			/*public String printMonthLefts() throws DateException{
				StringBuffer salida= new StringBuffer();				
				Date a=new Date(this.day,this.month,this.year);
					if(a.getMonth()<12){
						salida.append("Los meses restantes son:" );
					}
					else{
						salida.append("No queda ningun mes");
					}
			for(int i=a.getMonth;i<12;i++){
				a.month+=1;
					salida.append(a.getMonthName()+" ");
			}
			return salida.toString();
		}*/
//cuenta las fechas que quedan en el mes
		public int countDate(){
			int i=0,dia,mes=0;
			mes=this.month;
		if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
			for(i=this.day;i<31;i++){
				dia=i;
			}
		}
		else if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
			for( i=this.day;i<30;i++){
				dia=i;
			}
		}
		else{
			for(i=this.day;i<28;i++){
				dia=i;
			}
		}
		return i;
}
//cuenta los meses que quedan
		public String countMonths(){
			int mes=this.month;
			String meses;
		if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
			meses="Enero,Marzo,Mayo,Julio,Agosto,Octubre,Diciembre";
		}
		else if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
			meses="Abril,Junio,Septiembre,Noviembre";
		}
		else{
			meses="Febrero";
		}
			return meses;
		}	
//fecha al azar do-while
		public int attempsNeededDoWhile(){
			double dia,mes;
			int contador=0;
		
				mes=Math.floor(Math.random()*(12-1+1)+1);
					
					if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
						dia=Math.floor(Math.random()*(31-1+1)+1);}
					
					else if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
						dia=Math.floor(Math.random()*(30-1+1)+1);}

					else {
						dia=Math.floor(Math.random()*(28-1+1)+1);}
				do{
					contador=contador+1;
				}
				while((dia!=this.day)||(mes!=this.month));

				
		
		return contador;
		}

//fecha al azar while
	public int attempsNeededWhile(){
			double dia,mes;
			int contador=0;
		
				mes=Math.floor(Math.random()*(12-1+1)+1);
					if((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
						dia=Math.floor(Math.random()*(31-1+1)+1);}
					
					else if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
						dia=Math.floor(Math.random()*(30-1+1)+1);}

					else {
						dia=Math.floor(Math.random()*(28-1+1)+1);}
				while((dia!=this.day)||(mes!=this.month)){

					contador=contador+1;
				}
			return contador;
		}
	}
	
		

	

