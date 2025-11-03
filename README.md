# ☕ Smart Café – Java Multithreading Project

## 🧠 Concept
This project demonstrates **multithreading in Java** using a real-world example of a café.

Threads in Java allow multiple parts of a program to run **concurrently**.
This project shows how threads can:
1. Do **different work** (Order taking, Cooking)
2. Do the **same work** (Multiple delivery boys)
3. **Share common resources safely** using synchronization.

---

## ⚙️ How It Works
### Classes:
- **Cafe.java** → Shared resource (common order counter)
- **OrderTaker.java** → Thread for taking new orders
- **Cook.java** → Thread for preparing food
- **DeliveryBoy.java** → Multiple threads delivering orders
- **SmartCafe.java** → Main class to start all threads

---

## 🧵 Thread Behavior
| Thread Type | Task | Type of Work |
|--------------|------|---------------|
| `OrderTaker` | Takes new orders | Different |
| `Cook` | Prepares food | Different |
| `DeliveryBoy` (2 threads) | Deliver orders | Same |
| `Cafe` | Shared resource (orders) | Shared/Synchronized |

---

## 🖥️ Example Output
---
=== Smart Café Simulation Started ===
[Cook] Preparing order #1
[Cafe] New order placed! Total orders: 1
[Cafe] Ravi delivered an order. Remaining: 0
[Cook] Preparing order #2
[Cafe] New order placed! Total orders: 1
[Cafe] Sohan delivered an order. Remaining: 0

## 🧩 Concepts Demonstrated
- Multithreading using `Thread` class  
- Concurrency  
- Synchronization to prevent race conditions  
- Shared resource management  
- Thread sleep and join  

---
