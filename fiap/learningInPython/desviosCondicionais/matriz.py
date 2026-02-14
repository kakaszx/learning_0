matriz = [[0, 0], [0, 0], [0, 0], [0, 0]]

print("Preenchendo a matriz")

for l in range(4):
    for c in range(2):
        matriz[l][c] = int(input(f"Matriz [{l}][{c}]: "))


# 2 - Exibir a matriz
print("\nExibindo a matriz")
for l in range(4):
    for c in range(2):
        print(f"{matriz[l][c]:^5}", end="")
    print()

# 3 - Exibir a soma dos elementos da matriz
soma = 0
for l in range(4):
    for c in range(2):
        soma += matriz[l][c]

print(f"\nSoma dos elementos da matriz: {soma}")
