num = int(input("Digite 5 numeros"))
maior = num
for cont in range(1, 5, 1):
    num = int(input())
    if num > maior:
        maior = num

print("Maior valor = ", maior)
