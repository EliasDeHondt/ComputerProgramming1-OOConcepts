public enum Antwoord {
    STEEN, SCHAAR, PAPIER;

    public boolean wintVan(Antwoord other){
        if (this == Antwoord.SCHAAR && other == Antwoord.STEEN) {
            return false;
        } else if (this == Antwoord.SCHAAR && other == Antwoord.PAPIER) {
            return true;
        } else if (this == Antwoord.STEEN && other == Antwoord.PAPIER) {
            return false;
        } else if (this == Antwoord.STEEN && other == Antwoord.SCHAAR) {
           return true;
        } else if (this == Antwoord.PAPIER && other == Antwoord.STEEN) {
            return true;
        } else if (this == Antwoord.PAPIER && other == Antwoord.SCHAAR) {
            return false;
        }
        return false;
    }
}
