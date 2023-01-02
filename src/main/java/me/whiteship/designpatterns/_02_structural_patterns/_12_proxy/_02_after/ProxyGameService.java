package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;


public class ProxyGameService implements GameService {
    private final GameService gameService;

    public ProxyGameService(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        long start = System.currentTimeMillis();
        gameService.startGame();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        
    }
}
