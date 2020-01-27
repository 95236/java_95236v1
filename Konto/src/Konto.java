// Napisz program w którym zasymulujesz działanie konta bankowego.
// Niech konto bankowe będzie miało swoje saldo oraz udostępnia metody do pobrania wartości aktualnego salda oraz pobrania z niego pieniędzy.

// Wykonaj następujące czynności:
// 1. Powołaj do życia kilka wątków, których zadaniem będzie wykonanie następujących akcji:

//	 a) sprawdzenie stanu konta
//	 b) Poczeka 500ms (Thread.sleep(500))
//	 c) jeśli stan konta pozwala na pobranie pieniędzy (np. 1000 zł) - pobierze je

// 2. Sprawdź, po zakończeniu pracy wątków, czy stan konta przypadkiem nie jest na minusie?
// 3. Jeśli tak - spróbuj naprawić sytuację tworząc niektóre metody synchronizacyjnymi

public class Konto {
    public int saldo;

    public Konto(int saldo) {
        this.saldo = saldo;
    }

    public static void main(String args[]) {

        Konto konto = new Konto(6000);
            try {
                for(int i = 0; i < 5; i++) {
                    Bank bank = new Bank(konto);
                    bank.start();
                }
                Thread.sleep(8000);
                System.out.println(konto.saldo);
            } catch (Exception ex) {
                System.out.println("Exception happened.");
            }
    }

}


class Bank extends Thread {

    Konto konto;

    public Bank(Konto konto) {
        this.konto = konto;
    }

    @Override
    public void run() {
        try{
            CheckBalance();
            Thread.sleep(1000);
            WithdrawMoney(2000);
        }
        catch (Exception ex) {
            System.out.println("Exception happened.");
        }

    }
    public void CheckBalance(){
        System.out.println("Saldo: " + konto.saldo);
    }
    public synchronized void WithdrawMoney(int amount){
        if(konto.saldo > amount) {
            konto.saldo -= amount;
        }
    }
}