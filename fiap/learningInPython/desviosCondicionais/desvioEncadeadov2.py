sal = float(input("Digite o seu salario: "))

if sal <= 1900:
    ir = 0
else:
    if sal <= 2800:
        ir = sal * 0.15
    else:
        ir = sal * 0.275
sal_liq = sal - ir
print(f"IR: {ir:.2f}")

print(f"Salario Liquido: {sal_liq:.2f}")
