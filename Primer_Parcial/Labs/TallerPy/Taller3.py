class Student :
    is_alive = True
    def __init__(self,_name,_age): #self define parametros
        self.name = _name
        self.age = _age
    
    def __repr__(self):
        return f"name -> {self.name} ... age -> {self.age}"
    
    def __add__(self, other):
        return Student(self.name+other.name, self.age+other.age)

print(Student("Guillermo",22) + Student("Telo",0))
print(Student.is_alive)
print(Student("Guillermo",22).is_alive)

numbers = [1,2,3,4,5,6,7,8]
#squeared_numbers = []

#for number in numbers:
#    squeared_numbers.append(number**2)
#squeared_numbers = [numbers**2 for numbers in numbers]
squeared_numbers = list(map(lambda x: x**2,numbers))  #lambda es una funcion que no tiene nombre
#map va por cada uno de los elementos aplicando la funcion
print(squeared_numbers)
#even_number = [number for number in squeared_numbers if numbers % 2 == 0]
even_number = list(filter(lambda x: x % 2 == 0, squeared_numbers))

#vaidar cedula en python 
print(even_number)