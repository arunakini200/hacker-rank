class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {
        if (b.score != a.score) {
            return b.score - a.score;
        }
        return a.name.compareTo(b.name);
    }
}

