package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class App {

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        commentService = new SpamFilteringCommentService(commentService);

        commentService = new TrimmingCommentService(commentService);

        Client client = new Client(commentService);
        client.writeComment("하이하이");
        client.writeComment("필터링....");
        client.writeComment("http://스패밍");
    }
}
