package Bai1_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TransactionMain {

	public static void main(String[] args) throws IOException {
		GoldTran[] gold = new GoldTran[0];
		MoneyTran[] money = new MoneyTran[0];
		ManageTransaction mn = new ManageTransaction(gold, money);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		boolean flag = true;
		do {
			System.out.println("Do you want in put a transaction?y/n");
			String choise = input.readLine();
			if (choise.equalsIgnoreCase("n")) {
				flag = false;
			} else if (choise.equalsIgnoreCase("y")) {
				 System.out.println("Enter ID Transaction: ");
		            String id = input.readLine();
		            System.out.println("Enter Date Transaction: ");
		            String date = input.readLine();
		            System.out.println("Enter Amount Transaction: ");
		            int amount = Integer.parseInt(input.readLine());
		            System.out.println("Are you want choose M/G?");
		            String chooseTypeTrade = input.readLine();
		            
		            if (chooseTypeTrade.equalsIgnoreCase("m")) {
		            	System.out.println("Enter type Money:USD(1), EUR(2), AUD(3)");
		                int typeMn = Integer.parseUnsignedInt(input.readLine());
		                Money m = null;
		                switch (typeMn) {
		                    case 1:
		                        m = Money.USD;
		                        break;
		                    case 2:
		                        m = m.EUR;
		                        break;
		                    case 3:
		                        m = m.AUD;
		                        break;
		                }
		                System.out.println("Enter buy(1) or sell(2): ");
		                int bOS = Integer.parseInt(input.readLine());

		                MoneyTran tM = new MoneyTran(m, bOS, id, date, amount, chooseTypeTrade);
		                 money = Arrays.copyOf(money, money.length + 1);
		                 money[money.length - 1] = tM;
							mn.settM(money);
		            } else if (chooseTypeTrade.equalsIgnoreCase("g")) {
		            	 System.out.println("Enter Type Gold: Gold9999(1), Gold24k(2), GoldSJC(3)");
		                 int type = Integer.parseInt(input.readLine());
		                 Gold g = null;
		                 switch (type) {
		                     case 1:
		                         g = Gold.Gold24K;
		                         break;
		                     case 2:
		                         g = Gold.Gold9999;
		                         break;
		                     case 3:
		                         g = Gold.GoldSJC;
		                         break;
		                 }
		                 GoldTran tG = new GoldTran(g, id, date, amount, chooseTypeTrade);
		                 gold = Arrays.copyOf(gold, gold.length + 1);
							gold[gold.length - 1] = tG;
							mn.settG(gold);
		            }
			}
			System.out.println("=========================================================");
			System.out.println("--------------------------MONEY---------------------------");
			mn.outputArrMoney();
			System.out.println("---------------------------GOLD---------------------------");
			mn.outPutArrGold();
		}while (flag == true);
	}

}
