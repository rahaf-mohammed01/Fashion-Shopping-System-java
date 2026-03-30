import ourcompany.Company;
import ourcompany.Administration;
import actors.Employee;
import actors.Customer;
import items.Clothes;
import items.Product;
import payment.CreditCard;
import payment.Cash;
import payment.PaymentMethod;
import customerServices.Service;
import customerServices.Shipping;
import customerServices.Online;
import customerServices.Shop;
import customerServices.shippingCom;
import customerServices.Order;

public class GlowUP {
        public static void main(String args[]) {

                // Company informatio
                Company company = new Company("GlowUp", "333 MW St", 100, 500);
                System.out.println("Company Name: " + company.getCompanyName());
                System.out.println("Company Address: " + company.getCompanyAddress());

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Administration objects
                Administration m1 = new Administration("Mohammed", "HR");
                Administration m2 = new Administration("Ali", "Finance");

                // Output Administration objects
                System.out.println(
                                m1.getManagerName() + " is the manager of the " + m1.getDepartment() + " department.");
                System.out.println(
                                m2.getManagerName() + " is the manager of the " + m2.getDepartment() + " department");

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Create an Employee
                Employee emp1 = new Employee("John", "john@example.com", 30, 1001, "Sales", true, 5000.0);
                Employee emp2 = new Employee("Sultan", "Sulta37@gmail.com", 28, 12345, "Marketing", true, 6000.0);
                Employee emp3 = new Employee("Sara", "Sa123@hotmail.com", 27, 124674, "HR", false, 4500.0);
                Employee emp4 = new Employee("Rital", "R1t7@hotmail.com", 25, 348902, "Finance", false, 5500.0);
                Employee emp5 = new Employee("Reyouf", "reyouf24@gmail.com", 23, 8765124, "IT", true, 7000.0);

                emp1.checkShiftStatus();
                emp2.checkShiftStatus();
                emp3.checkShiftStatus();
                emp4.checkShiftStatus();
                emp5.checkShiftStatus();

                // Display employee information
                System.out.println("Employee Details: " + emp1.getName() + ", " + emp1.getEmail() + ", " + emp1.getAge()
                                + ", " + emp1.getEmployeeId() + "," + emp1.getSalary());
                System.out.println("Employee Details: " + emp2.getName() + ", " + emp2.getEmail() + ", " + emp2.getAge()
                                + ", " + emp2.getEmployeeId() + "," + emp2.getSalary());
                System.out.println("Employee Details: " + emp3.getName() + ", " + emp3.getEmail() + ", " + emp3.getAge()
                                + ", " + emp3.getEmployeeId() + "," + emp3.getSalary());
                System.out.println("Employee Details: " + emp4.getName() + ", " + emp4.getEmail() + ", " + emp4.getAge()
                                + ", " + emp4.getEmployeeId() + "," + emp4.getSalary());
                System.out.println("Employee Details: " + emp5.getName() + ", " + emp5.getEmail() + ", " + emp5.getAge()
                                + ", " + emp5.getEmployeeId() + "," + emp5.getSalary());

                System.out.print("\n");

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Create a Customer
                Customer cust1 = new Customer("Alice Smith", "alice@gmail.com", 25, 200143);
                Customer cust2 = new Customer("Jane Smith", "jane@hotmail.com", 25, 98765);
                Customer cust3 = new Customer("Rahaf Banat", "rahaf19@gmail.com", 22, 77823);
                Customer cust4 = new Customer("Taif Alsulami", "taf3@gmail.com", 23, 33129);
                Customer cust5 = new Customer("Sara Omar", "Sara26@hotmail.com", 26, 98545);

                // Display customer information
                System.out.println("customer Details: " + cust1.getName() + ", " + cust1.getEmail() + ", "
                                + cust1.getAge() + ", " + cust1.getCustomerNumber());
                System.out.println("customer Details: " + cust2.getName() + ", " + cust2.getEmail() + ", "
                                + cust2.getAge() + ", " + cust2.getCustomerNumber());
                System.out.println("customer Details: " + cust3.getName() + ", " + cust3.getEmail() + ", "
                                + cust3.getAge() + ", " + cust3.getCustomerNumber());
                System.out.println("customer Details: " + cust4.getName() + ", " + cust4.getEmail() + ", "
                                + cust4.getAge() + ", " + cust4.getCustomerNumber());
                System.out.println("customer Details: " + cust5.getName() + ", " + cust5.getEmail() + ", "
                                + cust5.getAge() + ", " + cust5.getCustomerNumber());

                System.out.println(); // Empty line for separation

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Create different clothes items
                Clothes item1 = new Clothes("Donatella Francesca Versace", "dress", "Versace", 5000.90, "XS, S, M, L, XL, XXL", "Red");
                Clothes item2 = new Clothes("Stefano Gabbana ", "coat", "dolce and gabbana", 20000, "XS, S, M, L, XL, XXL", "Black");
                Clothes item3 = new Clothes("Domenico Dolce", "dress", "dolce and gabbana", 5000.90, "XS, S, M, L, XL, XXL", "Beige");
                Clothes item4 = new Clothes("Elie", "dress", "Elie Saab", 5000.90, "XS, S, M, L, XL, XXL", "Brown");
                

                // Display Clothes information
                System.out.println(item1);
                System.out.println(item2);
                System.out.println(item3);
                System.out.println(item4);

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // PaymentMethod
                PaymentMethod payment1 = new CreditCard("2313-5618-9313-3436", 1000.0);
                PaymentMethod payment2 = new Cash(500.0);

                if (payment1 instanceof PaymentMethod) {
                        PaymentMethod paymentMethod = payment2;
                        System.out.println("Payment Method: " + paymentMethod.getClass().getSimpleName());
                        paymentMethod.makePayment(100);
                        System.out.println("Remaining amount: $" + paymentMethod.getAmount());
                }

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                double orderAmount = 100.0;
                double shippingFees = 110.0;

                // First order the PaymentStackDemonstrate
                PaymentMethod orderPayment = new CreditCard("1342-3265-4773-8484", orderAmount + shippingFees);
                if (orderPayment instanceof PaymentMethod) {
                        PaymentMethod paymentMethod = orderPayment;
                        System.out.println("Order payment successful. Shipment will be prepared for shipping.");
                }

                // Second order the PaymentQueueDemonstrate
                PaymentMethod secondOrderPayment = new CreditCard("1255-6956-7437-4848", orderAmount + shippingFees);
                if (secondOrderPayment instanceof PaymentMethod) {
                        CreditCard paymentMethod = (CreditCard) secondOrderPayment;
                        System.out.println(
                                        "Card payment not successful. Please pay by another means, otherwise, the order will be cancelled.");
                }

                // Third order the PaymentHashMapDemonstrate
                PaymentMethod thirdOrderPayment = new Cash(1200.0);
                if (thirdOrderPayment instanceof PaymentMethod) {
                        Cash paymentMethod = (Cash) thirdOrderPayment;
                        System.out.println(
                                        "Cash payment failed. Please pay by another means or the order will be cancelled.");
                }

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Create a Service
                Service service = new Service("Customer Support", "Support");
                System.out.println("Service Name: " + service.getServiceName());
                service.performDuties();
                service.handleCustomerInquiries();

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Create an Online Order
                Product onlineProduct = new Product("dress", 1500.0);
                Shipping onlineShipping = new shippingCom();
                Online onlineOrder = new Online(onlineProduct, 2, onlineShipping);
                System.out.println("Online Order Total Cost: $" + onlineOrder.TotalCost());
                onlineOrder.shipProduct();

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Create a Shop Order
                Product shopProduct = new Product("coat", 500.0);
                Shop shopOrder = new Shop(shopProduct, 5, null);
                System.out.println("Shop Order Total Cost: $" + shopOrder.TotalCost());
                shopOrder.deliverProduct();

                // Line
                System.out.println(
                                "------------------------------------------------------------------------------------------------");

                // Create a Order
                Product orderProduct = new Product("dress", 800.0);
                Shipping orderShipping = new shippingCom();
                Order ordercost = Order.createOrder(orderProduct, 3, orderShipping);
                System.out.println("Order Cost Total Cost: $" + ordercost.TotalCost());
                ordercost.shipProduct();

        }

}
