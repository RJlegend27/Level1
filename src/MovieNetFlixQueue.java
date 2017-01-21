
public class MovieNetFlixQueue {
public static void main(String[] args) {
	Movie IceAge = new Movie("IceAge",6);
	IceAge.getRating();
	Movie Storks = new Movie("Storks", 7);
	Storks.getRating();
	Movie OpenSeason = new Movie("OpenSeason", 6);
	OpenSeason.getRating();
	Movie ChopKickPanda = new Movie("ChopKickPanda", 9999);
	ChopKickPanda.getRating();
	Movie Ratatoing = new Movie("Ratatoing", 1);
	Ratatoing.getRating();
	Ratatoing.getTicketPrice();
	NetflixQueue queue = new NetflixQueue();
	queue.addMovie(Ratatoing);
	queue.addMovie(ChopKickPanda);
	queue.addMovie(OpenSeason);
	queue.addMovie(Storks);
	queue.addMovie(IceAge);
	
}
}
