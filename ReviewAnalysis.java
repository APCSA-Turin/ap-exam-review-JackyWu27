import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
	double sum = 0;
for (int c = 0; c < allReviews.length; c ++) {
		sum += allReviews[c].getRating();
}
return sum / (allReviews.length);
    }

    public ArrayList<String> collectComments() {
	ArrayList<String> rtrn = new ArrayList<String>();
	for (int c = 0; c < allReviews.length; c ++) {
		if (allReviews[c].getComment().indexOf("!") != -1) {
			String com = c + "-" + allReviews[c].getComment();
			if (!com.substring(com.length() - 1).equals(".") && !com.substring(com.length() - 1).equals("!")) {
	com += ".";
}
			rtrn.add(com);
}
}
return rtrn;
    }
}
