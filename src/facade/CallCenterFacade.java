package facade;

public class CallCenterFacade {
    private final ClientRelationService clientRelationService;
    private final BillingService billingService;
    private final TechSupport techSupport;

    public CallCenterFacade() {
        this.clientRelationService = new ClientRelationService();
        this.billingService = new BillingService();
        this.techSupport = new TechSupport();
    }

    public void call(String phone, String number) {
        if (number.equals("1")) {
            clientRelationService.getCustomerInfo(phone);
        } else if (number.equals("2")) {
            billingService.getBalance(phone);
        } else {
            techSupport.createTicket(phone);
        }
    }

    public static void main(String[] args) {
        CallCenterFacade callCenter = new CallCenterFacade();
        callCenter.call("+79119001111", "3");

    }

}