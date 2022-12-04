
public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		this.description = description;
		this.id = id;
		this.rating = rating;
	}

	public String toString() {
		return id + description + rating;
	}

}
