package visitorPattern;
public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new Telco(15, 500, "Smart",false);
        TelcoSubscription globe = new Telco(10, 450, "Globe",true);
        TelcoSubscription ditto = new Telco(8, 400, "Ditto",true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("DATA ALLOWANCE OFFERS:");
        System.out.println("Smart:" + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe:" + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto:" + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nPACKAGE OFFERS:");
        System.out.println("Smart unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " +

                unli.showUnliCallsTextOffer(ditto.getTelcoName(), ditto.getUnliCallText()));
    }
}

