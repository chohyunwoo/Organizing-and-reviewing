package ex.ex0;

public class MovieReview {
    String title;
    String review;

    MovieReview(String title, String review){
        this.title =title;
        this.review = review;
    }

    public static class MovieReviewMain{
        public static void main(String[] args) {
            MovieReview m1 = new MovieReview("인셉션", "인생은 무한 루프");

            MovieReview m2 = new MovieReview("어바웃 타임",  "인생 시간 영화!");

            MovieReview[] movies = {m1, m2};

            for (MovieReview m : movies) {
                System.out.println( "영화 제목: "+ m.title + "리뷰: " +  m.review);
            }

        }
    }
}
