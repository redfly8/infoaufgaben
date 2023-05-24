public class mainhotell {
   public static void main(String[] args) {
      hotel edelweiss = new hotel();
      edelweiss.zimmerprostockwerk = 20;
      edelweiss.belegung = 5;
      edelweiss.stockwerke = 3;
      edelweiss.name = "Hotel Edelweiss";

      hotel astoria = new hotel();
      astoria.zimmerprostockwerk = 5;
      astoria.belegung = 0;
      astoria.stockwerke = 2;
      astoria.name = "Hotel Astoria";

      hotel alpenblick = new hotel();
      alpenblick.zimmerprostockwerk = 100;
      alpenblick.belegung = 600;
      alpenblick.stockwerke = 6;
      alpenblick.name = "Hotel Alpenblick";

      if (astoria.einchecken() == false) {
         System.out.println("Du hast versucht, einzuchecken, es hat aber leider keinen Platz mehr.");
      }
      if (astoria.auschecken() == false) {
         System.out.println("Fehler: Du hast versucht auszuchecken, du warst aber nie registriert.");
      }
      System.out.println(
            ferieninfo(alpenblick) +
                  ferieninfo(edelweiss) +
                  ferieninfo(astoria));

   }

   private static String ferieninfo(hotel hotelname) {
      int capacity = hotelname.stockwerke * hotelname.zimmerprostockwerk;
      if (capacity - hotelname.belegung > 0) {
         String output = "\n" + hotelname.name + "\n \taktuell " + hotelname.belegung + " von " + capacity
               + " Zimmern belegt.";
         return output;
      } else {
         String output = "\n" + hotelname.name + "\n" + "\tBesetzt (" + hotelname.belegung + " von " + capacity
               + " Zimmern belegt)";
         return output;
      }

   }
}
