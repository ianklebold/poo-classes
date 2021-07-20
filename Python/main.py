from account import Account
from car import Car
from account import Account

if __name__ == "__main__":
    car = Car("AMS123", Account("Ian Fernandez", "41840491"))

    print(vars(car))
    print(vars(car.driver))
    
