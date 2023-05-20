class Ferry:
    def __init__(self, name, capacity):
        self.name = name
        self.capacity = capacity
        self.current_size = 0
        self.cars = []

    def load_car(self, license_plate):
        if self.current_size >= self.capacity:
            print(f"El ferry {self.name} está lleno. No se puede agregar el auto con matrícula {license_plate}")
            return

        self.cars.append(license_plate)
        self.current_size += 1
        print(f"Ferry {self.name}: {self.get_contents()}")

    def unload_car(self):
        if self.current_size > 0:
            self.cars.pop()
            self.current_size -= 1

        print(f"Ferry {self.name}: {self.get_contents()}")

    def get_contents(self):
        return ' '.join(self.cars[::-1])


class Portos(Ferry):
    def __init__(self, capacity):
        super().__init__("Portos", capacity)


class Celebrian(Ferry):
    def __init__(self, capacity):
        super().__init__("Celebrian", capacity)


portos = Portos(10)
celebrian = Celebrian(10)

portos.load_car("ABC123")
portos.load_car("DEF456")
portos.load_car("GHI789")
portos.load_car("JKL012")
portos.load_car("MNO345")
portos.load_car("PQR678")
portos.load_car("STU901")
portos.load_car("VWX234")
portos.load_car("YZA567")
portos.load_car("BCD890")
portos.load_car("EFG123")  # Portos está lleno, no se puede agregar

celebrian.load_car("ABC123")
celebrian.load_car("DEF456")
celebrian.load_car("GHI789")
celebrian.load_car("JKL012")
celebrian.load_car("MNO345")
celebrian.load_car("PQR678")
celebrian.load_car("STU901")
celebrian.load_car("VWX234")
celebrian.load_car("YZA567")
celebrian.load_car("BCD890")
celebrian.load_car("EFG123")  # Celebrian está lleno, no se puede agregar

print("Viaje de Portos:")
while portos.current_size > 0:
    portos.unload_car()

print("Viaje de Celebrian:")
while celebrian.current_size > 0:
    celebrian.unload_car()