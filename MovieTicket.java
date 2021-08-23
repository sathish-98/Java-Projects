package OOPS;

public class MovieTicket {
    //Implement your code here 
	
	    public int MovieId;
		public double CostPerTicket;
		public int NoOfSeats;
		
		public MovieTicket (int movieId, int noOfSeats) {
			this.MovieId = movieId;
			this.NoOfSeats = noOfSeats;
		}
		
	    public double calculateTotalAmount() {
	   
	    	if(MovieId == 111) {
	    		double totalAmount = NoOfSeats * 7;
	    		double d  = totalAmount * 0.02;
	    		totalAmount = totalAmount + d;
	    		return totalAmount;
			}
			else if(MovieId == 112) {
				double totalAmount = NoOfSeats * 8;
	    		double d  = totalAmount * 0.02;
	    		totalAmount = totalAmount + d;
	    		return totalAmount;
	 
			}
			else if(MovieId == 113){
				double totalAmount = NoOfSeats * 8.5;
				double d  = totalAmount * 0.02;
	    		totalAmount = totalAmount + d;
	    		return totalAmount;
			}
	    	
			return 0;
	    	
		}

		public int getMovieId() {
			return MovieId;
		}

		public void setMovieId(int movieId) {
			MovieId = movieId;
		}

		public double getCostPerTicket() {
			return CostPerTicket;
		}

		public void setCostPerTicket(double costPerTicket) {
			CostPerTicket = costPerTicket;
		}

		public int getNoOfSeats() {
			return NoOfSeats;
		}

		public void setNoOfSeats(int noOfSeats) {
			NoOfSeats = noOfSeats;
		}
		
		
}

