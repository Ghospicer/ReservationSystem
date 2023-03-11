import java.util.Scanner;


public class HotelReservationSystem {
    public int id;
    public int price;
    public int personCount;

    public HotelReservationSystem(int personCount, int price, int id) {
        this.id = id;
        this.price = price;
        this.personCount = personCount;
    }

    public int calculatePrice() {
        return personCount * price;
    }

    @Override
    public String toString() {
        return  "Room #" + id + "\n" +
        		"Person Count : " + personCount + "\n" +
                "Price : " + price + "\n" +
                "Calculate Price : " + calculatePrice() + "\n";
    }

    public static void main(String[] args) {

        HotelReservationSystem[] rooms = new HotelReservationSystem[10];
        int id = 1;
        int choice;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Create new Standard Room\n");
            System.out.println("2. Display all rooms information\n");
            System.out.println("3. Display the total number rooms\n");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            System.out.printf("\n");

            if (choice==1) {
                System.out.println("Person Count: ");
                int personCount = sc.nextInt();
                System.out.println("Price: ");
                int price = sc.nextInt();
                rooms[id-1] = new HotelReservationSystem(personCount, price, id);
                System.out.printf("Room #" + id + " created!\n");
                id++;

            }
            else if (choice==2) {

                for(int i=0; i<id-1; i++) {
                    System.out.println(rooms[i].toString());
                    System.out.printf("\n");
                }
            }
            else if (choice==3) {
                System.out.printf("%d rooms have been created so far.\n", id-1);

            }
            else if (choice==0) {
                break;
            }
            else {
                System.out.println("Wrong choice!");
            }
        }

        sc.close();
    }
  }
