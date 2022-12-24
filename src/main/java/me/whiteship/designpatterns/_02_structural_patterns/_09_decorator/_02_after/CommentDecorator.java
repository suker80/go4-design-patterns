package me.whiteship.designpatterns._02_structural_patterns._09_decorator._02_after;

public class CommentDecorator implements CommentService{
    CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
