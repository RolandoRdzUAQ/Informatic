public class CashRegister {
    private int cashOnHand;

    // Constructor por defecto
    public CashRegister() {
        cashOnHand = 500;
    }

    // Constructor con parámetros
    public CashRegister(int cashIn) {
        if (cashIn >= 0) {
            cashOnHand = cashIn;
        } else {
            cashOnHand = 500;
        }
    }

    // Muestra la cantidad actual en la caja registradora
    public int currentBalance() {
        return cashOnHand;
    }

    // Recibe la cantidad depositada y actualiza el saldo
    public void acceptAmount(int amountIn) {
        cashOnHand = cashOnHand + amountIn;
    }
}
