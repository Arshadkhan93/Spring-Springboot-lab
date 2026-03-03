package lab.nit;

/*
🧩 Task 2 — Vehicle Engine Selection System

🎯 Objective:
Demonstrate @Qualifier to inject a specific engine type (Diesel / Electric / Petrol) into a Vehicle class.

🧱 Class-wise Design

1. Interface — Engine
Method:

void start();

2️.Implementations:

DieselEngine: prints "Diesel engine started 🚛"

ElectricEngine: prints "Electric engine started ⚡"

PetrolEngine: prints "Petrol engine started 🚗"

3️. Class — Vehicle
Field:

Engine engine

Injection:

@Autowired

@Qualifier("electricEngine")

Method:

startVehicle() → call engine.start()

4️. AppConfig Class

@Configuration, @ComponentScan("com.example")

5️.MainApp Class

Load context

Get Vehicle bean

Call startVehicle()

📘 Expected Output:

Electric engine started ⚡
 */