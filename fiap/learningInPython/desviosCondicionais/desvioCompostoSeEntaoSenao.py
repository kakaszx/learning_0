# venda = float(input("Digite a venda: "))
# if venda > 300 :
#   desconto = venda * 10 / 100
#  venda = venda - desconto
#  print("Novo valor: ", venda)
# ---

tc = int(input("Digite o seu tempo de casa"))
sal = float(input("Digite o valor do salario"))

if tc < 3:
    aumento = sal * 0.05
else:
    aumento = sal * 0.1
    novo_sal = sal + aumento
print("O seu salário foi de", sal, " para", novo_sal)
