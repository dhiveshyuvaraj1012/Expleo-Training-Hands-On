package com.inheriandpoly;

// Abstract Base Class
abstract class Payment {
    protected String transactionId;
    protected double amount;
    protected String customerName;
    protected String paymentStatus;

    public Payment(String transactionId, double amount, String customerName) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.customerName = customerName;
        this.paymentStatus = "Pending";
    }

    public abstract boolean validatePayment();
    public abstract boolean processPayment();

  
    public void executeTransaction() {
        System.out.println("\nProcessing payment for " + customerName + "...");

        if (validatePayment()) {
            if (processPayment()) {
                setPaymentStatus("Success");
            } else {
                setPaymentStatus("Failed");
            }
        } else {
            setPaymentStatus("Validation Failed");
        }

        generateReceipt();
    }

    public void generateReceipt() {
        System.out.println("        PAYMENT RECEIPT          ");
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Amount Paid    : ₹" + amount);
        System.out.println("Status         : " + paymentStatus);
        System.out.println("=================================\n");
    }

    public String getTransactionId() { return transactionId; }
    public double getAmount() { return amount; }
    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String status) { this.paymentStatus = status; }
}


// Credit Card Payment
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String transactionId, double amount, String customerName,
                             String cardNumber, String cvv, String expiryDate) {
        super(transactionId, amount, customerName);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Validating Credit Card details...");
        return cardNumber.length() == 16 && cvv.length() == 3 && expiryDate.matches("\\d{2}/\\d{2}");
    }

    @Override
    public boolean processPayment() {
        System.out.println("Authorizing card transaction...");
        return true;
    }
}


// UPI Payment
class UPIPayment extends Payment {
    private String upiId;
    private String upiPin;

    public UPIPayment(String transactionId, double amount, String customerName,
                      String upiId, String upiPin) {
        super(transactionId, amount, customerName);
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Validating UPI credentials...");
        return upiId.contains("@") && upiPin.length() == 4;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing UPI transaction...");
        return true;
    }
}


// Net Banking Payment
class NetBankingPayment extends Payment {
    private String bankName;
    private String accountNumber;
    private String ifscCode;

    public NetBankingPayment(String transactionId, double amount, String customerName,
                             String bankName, String accountNumber, String ifscCode) {
        super(transactionId, amount, customerName);
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    @Override
    public boolean validatePayment() {
        System.out.println("Validating Bank Account details...");
        return accountNumber.matches("\\d{10,18}") && ifscCode.matches("[A-Z]{4}\\d{7}");
    }

    @Override
    public boolean processPayment() {
        System.out.println("Connecting to " + bankName + " bank gateway...");
        return true;
    }
}


// Main Class
public class DigitalPaymentSystem {
    public static void main(String[] args) {

        Payment[] payments = new Payment[3];

        payments[0] = new CreditCardPayment(
                "TXN1001", 4500, "Arun",
                "1234567812345678", "321", "11/27");

        payments[1] = new UPIPayment(
                "TXN1002", 2500, "Meena",
                "meena@okaxis", "4321");

        payments[2] = new NetBankingPayment(
                "TXN1003", 10000, "Prakash",
                "Indian Bank", "123456789012", "IDIB0001234");

        for (Payment p : payments) {
            p.executeTransaction();
        }
    }
}