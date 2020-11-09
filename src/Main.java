import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//Her Starter vi vores program
        public static void main(String[] args){
// Her pranter "Indset Servicenummer" som kan ses af brugerne
                System.out.print("Indset Servicenummer: ");

// Her kalder vi på Scanner klassen som bliver imporeter
                Scanner LaesForConstrootor = new Scanner(System.in);

// Her klader vi på Scanneren som vi har navngivet tidliger "LaesForConstrootor" vor vi har brugt nextInt
                int nummer = LaesForConstrootor.nextInt();


                ArrayList<ServiceInfo> list = new ArrayList<ServiceInfo>();

                list.add(new ServiceInfo("Rengøring ", 1));
                list.add(new ServiceInfo("Bibliotek ", 2));
                list.add(new ServiceInfo("Underviser ", 3));
                list.add(new ServiceInfo("Kantine ", 4));
                list.add(new ServiceInfo("Vinduespudsning ", 5));
                list.add(new ServiceInfo("Mentor ", 6));
                list.add(new ServiceInfo("Codelap ", 7));
                list.add(new ServiceInfo("Studievejleder ", 8));

                for (ServiceInfo p : list){
                        if(nummer == p.getNummer()){
                       System.out.println("" + p);
                        }
                }
        }

}

