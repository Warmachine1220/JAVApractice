
public class BookRunner {

	public static void main(String[] args) {

		Book book = new Book(10, "goodbook", "bishal");
		book.addReview(new Review(10, "it was a good book", 24));
		System.out.println(book);
		int n = 45;
		for (int i = 1; i <= n; i++) {
			int caption = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					caption++;
				}

			}
			if (caption == 2) {
				System.out.print(i + " ");
			}
	}
	}
}
