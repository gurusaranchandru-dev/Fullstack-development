package Test;
class User {
	    String id;
	    String name;
	    int pin;
	    double balance;

	    User(String id, String name, int pin, double balance) {
	        this.id = id;
	        this.name = name;
	        this.pin = pin;
	        this.balance = balance;
	    }
	}

	class ATM {
	    private List<User> users = new ArrayList<>();

	    public void loadUsers() {
	        try (BufferedReader br = new BufferedReader(new FileReader("users.txt"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");
	                users.add(new User(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
	            }
	        } catch (IOException e) {
	            System.out.println("Error loading users.");
	        }
	    }

	    public User login(String id, int pin) {
	        for (User u : users) {
	            if (u.id.equals(id) && u.pin == pin) {
	                return u;
	            }
	        }
	        return null;
	    }

	    public void deposit(User u, double amount) {
	        u.balance += amount;
	        System.out.println("Deposited: " + amount + " | New Balance: " + u.balance);
	    }

	    public void withdraw(User u, double amount) {
	        if (u.balance >= amount) {
	            u.balance -= amount;
	            System.out.println("Withdrawn: " + amount + " | New Balance: " + u.balance);
	        } else {
	            System.out.println("Insufficient funds!");
	        }
	    }
	}

	public class ATMSimulation {
	    public static void main(String[] args) {
	        ATM atm = new ATM();
	        atm.loadUsers();
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter ID: ");
	        String id = sc.nextLine();
	        System.out.print("Enter PIN: ");
	        int pin = sc.nextInt();
	        User current = atm.login(id, pin);
	        if (current != null) {
	            System.out.println("Welcome " + current.name);
	            atm.deposit(current, 500);
	            atm.withdraw(current, 200);
	        } else {
	            System.out.println("Invalid login!");
	        }
	    }
	}

}


