
def salir():
    print('Error no es una cedula verifique que tenga 10 digitos')

def validacion_cedula(x):
    l = len(x)
    print(len(x))
    a = ''
    {True: salir(), False: a} [l == 10]


num = (input("Por favor ingrese un número: "))
validacion_cedula(num)