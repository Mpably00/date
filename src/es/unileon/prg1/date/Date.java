

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
		switch(this.month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(this.day<32){ 
						correctDay="correct";
					}
					else{
						correctDay="ERROR";
					}
					break;
				case 2:
					if((this.day<30)||(day<29)){
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
					if(this.day<31){
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
//meses que faltan hasta final de año
			public String printMonthLefts(){
				StringBuffer salida= new StringBuffer();				
				Date a= new Date(this.day,this.month,this.year);
			for(int i=this.month;i<12;i++){
				a.month+=1;
					salida.append(a.getMonthName()+" ");
			}
			return salida.toString();
		}
//cuenta las fechas que quedan en el mes
		public int countDate(){
			int i=0,dia=0,mes=0;
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
		return dia;
}
//cuenta los meses que tengan el mismo numero de dias
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
		
//dias que hay desde el primer dia del año
		public int countDay(){
		int mes=this.month,dias1=0,dias2=0,dias3=0,Total,i,j;
		for(i=0;i<this.month;i++){
			if((i==1)||(i==3)||(i==5)||(i==7)||(i==8)||(i==10)||(i==12)){
				for(j=0;j<31;j++){
					dias1=dias1+j;
				}
			}
			else if((i==4)||(i==6)||(i==9)||(i==11)){
				for(j=0;j<30;j++){
					dias2=dias2+j;
				}
			}
			else{
				for(j=0;j<28;j++){
					dias3=dias3+j;
				}
			}
		}
			Total=dias1+dias2+dias3+this.day;
		return Total;
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
	public String weekDay(){
		String name;	
		int D,M,N,A,E,S,week;
		
		D=this.day;
	
			if(this.month==1){
				M=0;}
			else if(this.month==2){
				M=3;}
			else if(this.month==3){
				M=3;}
			else if(this.month==4){
				M=6;}
			else if(this.month==5){
				M=1;}
			else if(this.month==6){
				M=4;}
			else if(this.month==7){
				M=6;}
			else if(this.month==8){
				M=2;}
			else if(this.month==9){
				M=5;}
			else if(this.month==10){
				M=0;}
			else if(this.month==11){
				M=3;}
			else{
				M=5;}
			A=this.year%100;
			E=A/4;
			S=6;
				N=D+M+A+E+S;
			week=N%7;

		switch(week){
			case 1:
				name="Lunes";
				break;
			case 2:
				name="Martes";
				break;
			case 3:
				name="Miercoles";
				break;
			case 4:
				name="Jueves";
				break;
			case 5:
				name="Viernes";
				break;
			case 6:
				name="Sabado";
				break;
			case 0:
				name="Domingo";
				break;
			default:
				name="ERROR";

	}
		return name;
}
}
				
			
			
	
		

	

