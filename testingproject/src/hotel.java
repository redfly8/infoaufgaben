public class hotel {
    int stockwerke;
    int zimmerprostockwerk;
    int belegung;
    String name;

    public int getFreieZimmer() {
        int retvalue = stockwerke * zimmerprostockwerk - belegung;
        return retvalue;

    }

    public boolean einchecken() {
        if (belegung < stockwerke * zimmerprostockwerk) {
            belegung = belegung + 1;
            return true;
        } else {
            return false;
        }

    }

    public boolean auschecken() {
        if (belegung < 1) {
            return false;
        } else {
            belegung = belegung - 1;
            return true;
        }

    }

    public void printinfo(boolean namebln, boolean zimmer, boolean stockwerkbln, boolean zimmerprostockwerkbln) {
        if (namebln == true) {
            System.out.println(name);
        }
        if (zimmer == true) {
            System.out.println("Anzahl freie Zimmer:" + getFreieZimmer());
        }
        if (stockwerkbln == true) {
            System.out.println("Anzahl Stockwerke:" + stockwerke);
        }
        if (zimmerprostockwerkbln == true) {
            System.out.println("Anzahl Zimmer pro Stockwerk:" + zimmerprostockwerk);
        }
    }

}
