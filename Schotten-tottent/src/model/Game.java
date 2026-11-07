
package model;

import java.util.List;

public class Game {

    private static List<Tile> tiles;
    private static List<ClanCard> clanDeck;
    private static List<TacticCard> tacticDeck;
    private static List<Player> players;

    public static List<Tile> getTiles() {
        return tiles;
    }

    public static void setTiles(List<Tile> tiles) {
        Game.tiles = tiles;
    }

    public static List<ClanCard> getClanDeck() {
        return clanDeck;
    }

    public static void setClanDeck(List<ClanCard> clanDeck) {
        Game.clanDeck = clanDeck;
    }

    public static List<TacticCard> getTacticDeck() {
        return tacticDeck;
    }

    public static void setTacticDeck(List<TacticCard> tacticDeck) {
        Game.tacticDeck = tacticDeck;
    }

    public static List<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(List<Player> players) {
        Game.players = players;
    }
}
