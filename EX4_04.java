public class EX4_04 {
    String title;
    String author;
    public EX4_04(String t) { // 생성자
        title = t;
        author = "작자미상";
    }
    public EX4_04(String t, String a) { // 생성자 
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        EX4_04 littlePrince = new EX4_04("어린왕자", "생텍쥐페리"); // 생성자 Book(String t, String a) 호출
        EX4_04 loveStory = new EX4_04("춘향전"); // 생성자 Book(String t) 호출 
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}