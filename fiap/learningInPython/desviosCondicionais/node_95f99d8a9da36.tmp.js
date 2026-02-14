#         0   1    2     3
# lista = ["a", 2, True, 4.5]
# print(lista)


# ## acessar um elemento no final da lista
# lista.append(95)
# print(lista)

# ## editando um elemento da lista
# lista.insert(2, "novo valor")
# print(lista)

# ## pop remove o ultimo elemento
# lista.pop()
# print(lista)

# ## apaga toda a lista
# lista.clear()
# print(lista)

# preenchendo 5 elementos em uma lista
lista = []
for i in range(0, 5, 1):
    x = float(input("Digite um elemento: "))
    lista.append(x)

# exibindo os 5 elementos da lista - 1 forma
# for i in range(0, 5, 1):
#     print(lista[i])

# exibindo os 5 elementos da lista - 2 forma
for elemento in lista:
    print(elemento)


# somando os elementos da lista
soma = 0
for elemento in lista:
    soma = soma + elemento
print("A soma dos elementos da lista é: ", soma)
