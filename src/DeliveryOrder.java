public class DeliveryOrder {
    final Carrier carrier;
    final Fragile fragile;
    final Cold cold;

    public DeliveryOrder(Carrier carrier, Fragile fragile, Cold cold) {
        this.carrier = carrier;
        this.fragile = fragile;
        this.cold = cold;
    }

    public void deliver() {
        System.out.println("Delivering");
    }

}
