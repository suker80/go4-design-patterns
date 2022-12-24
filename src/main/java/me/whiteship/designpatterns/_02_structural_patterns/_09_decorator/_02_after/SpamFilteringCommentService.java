package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class SpamFilteringCommentService extends CommentDecorator{

    public SpamFilteringCommentService(CommentService commentService) {
        super(commentService);
    }


    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
