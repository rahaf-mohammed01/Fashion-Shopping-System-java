import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class GlowupApp {
    private static JFrame frame;
    private static JPanel panel;
    private static JTextField cardNumberField;
    private static JTextField expiryField;
    private static JTextField cvvField;
;



    public static void main(String args[]) {
        SwingUtilities.invokeLater(GlowupApp::createAccountPage);
    }

    private static void createAccountPage() {
        frame = new JFrame("Create Account - Glowup");
        panel = new JPanel();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton createButton = new JButton("Create Account");

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(createButton);

        frame.add(panel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        createButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
            } else if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid email address.");
            } else if (!isValidPassword(password)) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid password (at least 8 characters).");
            } else {
                frame.getContentPane().removeAll();
                frame.revalidate();
                frame.repaint();
                productDisplayPage();
            }
        });
    }

    private static boolean isValidEmail(String email) {
        String emailPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailPattern);
    }

    private static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    private static void productDisplayPage() {
        panel = new JPanel();
        panel.setBackground(new Color(222, 184, 135));

        JLabel product1Info = new JLabel("Product 1: Dress - $5000.99");
        JButton addToBagButton1 = new JButton("Add to Bag");
         addToBagButton1.setBackground(Color.WHITE);

        JLabel product2Info = new JLabel("Product 2: coat- $300.99");
        JButton addToBagButton2 = new JButton("Add to Bag");
         addToBagButton2.setBackground(Color.WHITE);

        panel.add(product1Info);
        panel.add(addToBagButton1);
        panel.add(product2Info);
        panel.add(addToBagButton2);

        JButton shoppingBagButton = new JButton("Go to Shopping Bag");
        shoppingBagButton.setBackground(Color.WHITE);
        panel.add(shoppingBagButton);

        frame.getContentPane().removeAll();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        addToBagButton1.addActionListener(e -> addToBag("Dress"));
        addToBagButton2.addActionListener(e -> addToBag("coat"));
        shoppingBagButton.addActionListener(e -> shoppingBagPage());
        

    }


    private static void addToBag(String product) {
        String input = JOptionPane.showInputDialog(frame, "Enter quantity for " + product + ":");
        try {
            int quantity = Integer.parseInt(input);
            if (quantity > 0) {
                JOptionPane.showMessageDialog(frame, "Added " + quantity + " " + product + " to Shopping Bag");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid quantity! Please enter a positive number.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input! Please enter a valid number.");
        }
    }

    

    private static int product1Quantity = 2; // Initial quantity of Product 1
private static int product2Quantity = 3; // Initial quantity of Product 2

private static void shoppingBagPage() {
    panel = new JPanel();
    panel.setBackground(new Color(222, 184, 135));

    JLabel product1Label = new JLabel("Product 1: Dress - Quantity: " + product1Quantity);
    JButton removeButton1 = new JButton("Remove");
    removeButton1.setBackground(Color.WHITE);

    JLabel product2Label = new JLabel("Product 2: coat - Quantity: " + product2Quantity);
    JButton removeButton2 = new JButton("Remove");
    removeButton2.setBackground(Color.WHITE);

    panel.add(product1Label);
    panel.add(removeButton1);
    panel.add(product2Label);
    panel.add(removeButton2);

    JButton checkoutButton = new JButton("Proceed to Checkout");
    checkoutButton.setBackground(Color.WHITE);
    panel.add(checkoutButton);

    frame.getContentPane().removeAll();
    frame.add(panel);
    frame.getContentPane().setBackground(new Color(222, 184, 135));
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    removeButton1.addActionListener(e -> {
        if (product1Quantity > 0) {
            product1Quantity--; // Decreasing the quantity
            product1Label.setText("Product 1: Dress - Quantity: " + product1Quantity);
        } else {
            JOptionPane.showMessageDialog(frame, "Product 1: Dress is already removed.");
        }
    });

    removeButton2.addActionListener(e -> {
        if (product2Quantity > 0) {
            product2Quantity--; // Decreasing the quantity
            product2Label.setText("Product 2: coat - Quantity: " + product2Quantity);
        } else {
            JOptionPane.showMessageDialog(frame, "Product 2: coat is already removed.");
        }
    });

    checkoutButton.addActionListener(e -> checkoutPage());
}
    private static void checkoutPage() {
        panel = new JPanel();
        panel.setBackground(new Color(222, 184, 135));

        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField(20);
        JLabel phoneLabel = new JLabel("Phone Number:");
        JTextField phoneField = new JTextField(20);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(emailLabel);
        panel.add(emailField);

        JLabel paymentLabel = new JLabel("Payment Method:");
        JComboBox<String> paymentMethods = new JComboBox<>(new String[]{"Credit Card", "PayPal", "Cash on Delivery"});
        panel.add(paymentLabel);
        panel.add(paymentMethods);

        JButton confirmOrderButton = new JButton("Confirm Order");
        confirmOrderButton.setBackground(Color.WHITE);
        panel.add(confirmOrderButton);

        frame.getContentPane().removeAll();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        confirmOrderButton.addActionListener(e -> {
            String selectedPaymentMethod = Objects.requireNonNull(paymentMethods.getSelectedItem()).toString();
            if (selectedPaymentMethod.equals("Credit Card")) {
                frame.getContentPane().removeAll();
                frame.add(getCreditCardPanel());
                frame.revalidate();
                frame.repaint();
            } else {
                JOptionPane.showMessageDialog(frame, "Order confirmed! Thank you for shopping with us.");
                frame.dispose();
            }
        });
    }

    private static JPanel getCreditCardPanel() {
        JPanel creditCardPanel = new JPanel();
        panel.setBackground(new Color(222, 184, 135));

        JLabel cardNumberLabel = new JLabel("Card Number:");
        cardNumberField = new JTextField(20);
        JLabel expiryLabel = new JLabel("Expiry Date:");
        expiryField = new JTextField(20);
        JLabel cvvLabel = new JLabel("CVV:");
        cvvField = new JTextField(20);

        creditCardPanel.add(cardNumberLabel);
        creditCardPanel.add(cardNumberField);
        creditCardPanel.add(expiryLabel);
        creditCardPanel.add(expiryField);
        creditCardPanel.add(cvvLabel);
        creditCardPanel.add(cvvField);

        JButton confirmPaymentButton = new JButton("Confirm Payment");
        confirmPaymentButton.setBackground(Color.WHITE);
        creditCardPanel.add(confirmPaymentButton);

        confirmPaymentButton.addActionListener(e -> {
            // Logic for confirming credit card payment
            JOptionPane.showMessageDialog(frame, "Payment confirmed! Thank you for shopping with us.");
            frame.dispose();
        });

        frame.getContentPane().removeAll();
        frame.add(creditCardPanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        return creditCardPanel;
    }
}