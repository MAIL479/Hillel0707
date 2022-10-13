package Homeworks.homeworks23.Subcategories.Client;

public class Client {
    public Client(String typeClient, double summ) {
        this.summ = summ;
        this.typeClient = typeClient;
    }

    public double summ;
    public String typeClient;

    public void getSumm() {
        System.out.println("Balance = " + summ);
    }


    public void deposit(int summa) {
        if (typeClient.equals("IE")) {
            summ += summa * 0.99;
        } else {
            summ += summa;
        }
    }

    public void getMoney(int summa) {
        if (typeClient.equals("IE")) {
            if (summ < 1000) {
                summ -= summa * 1.01;
            } else if (summ >= 1000) {
                summ -= summa * 1.005;
            }
        } else if (typeClient.equals("LFE")) {
            summ -= summa * 1.01;
        } else if (typeClient.equals("PFE")) {
            summ = summ - summa;
        }
    }
}
