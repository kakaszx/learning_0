soma = 0

while True:
    num = int(input("Digite um numero: "))
    if num >= 0:
        soma = soma + num
    else:
        break
        
print("Soma = ", soma)
