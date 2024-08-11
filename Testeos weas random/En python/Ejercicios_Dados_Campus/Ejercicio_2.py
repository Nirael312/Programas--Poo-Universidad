
val = 1
anterior = 0

for i in range(1, 11):
    
    print("El valor actual es: " + str(val))
    print()
    
    aux = val
    val = val + anterior
    anterior = aux
    