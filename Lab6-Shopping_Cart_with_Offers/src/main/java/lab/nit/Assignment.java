package lab.nit;

/*
 Question 1: Shopping Cart with Offers (Amazon/Flipkart)
=======================================================
📘 Scenario:
You are tasked with building a Shopping Cart System that supports two major e-commerce platforms: 
Amazon and Flipkart. Each platform has its own business rules for offering discounts and managing delivery.
Users should be able to interact with the system via a console-based application, where they can perform typical 
shopping actions.

The system must follow the Strategy Design Pattern and should be configured using Spring Annotation-Based Configuration.
 Dependency injection should be used to inject the appropriate platform's shopping logic at runtime.

🧩 Core Functional Requirements:
Design an interface named ShoppingService with the following methods:

addItem(String item, double price): Adds an item to the shopping cart.

checkout(): Applies platform-specific discount rules and finalizes the purchase.

viewCart(): Displays all the items currently in the cart along with their prices.

Create two different implementations of ShoppingService:

AmazonService

Applies a 10% discount on the total cart value.

Prints a message indicating fast delivery (e.g., within 2 days).

FlipkartService

Applies a 5% discount on the total cart value.

Offers free delivery if the discounted total is ₹500 or more, otherwise adds a fixed ₹50 shipping fee.

Prints a message indicating standard delivery (e.g., 3–5 days).

Create a class ShoppingContext (following the Has-A relationship) that holds a reference to a ShoppingService.
 Inject the concrete service (Amazon or Flipkart) via constructor injection using Spring.

Implement a console-based application named ShoppingApplication that allows the user to:

Choose a platform (Amazon or Flipkart) at the start.

Perform operations from the following menu:

Add Item to Cart

View Cart

Checkout

Exit

🧠 Implementation Constraints:
Use Spring Annotation-based configuration (no XML).

Follow Strategy Design Pattern to switch between Amazon and Flipkart logic.

All classes should be declared as final to ensure immutability where possible.

Do not use any static references; rely fully on Spring for object creation and management.

 */