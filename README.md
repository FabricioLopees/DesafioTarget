# DesafioTarget
Desafio Target - Técnico

| Desafio | Descrição |
| :---: | --- |
| Desafio 1 | Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência. <br> <br> IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;|
| Desafio 2 | Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. <br> <br> IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; |
| Desafio 3 | Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); <br> <br> Ao final do processamento, qual será o valor da variável SOMA? |
| Desafio 4 | Descubra a lógica e complete o próximo elemento: <br> a) 1, 3, 5, 7, ___ <br> b) 2, 4, 8, 16, 32, 64, ____ <br> c) 0, 1, 4, 9, 16, 25, 36, ____ <br> d) 4, 16, 36, 64, ____ <br> e) 1, 1, 2, 3, 5, 8, ____ <br> f) 2,10, 12, 16, 17, 18, 19, ____ |
| Desafio 5 | Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada? |

---

## Respostas


### Para executar os programas
- Ter a JRE (Java Runtime Environment) instalado ou
- Acessar [Java Online Compiler](https://onecompiler.com/java), copiar o código, colar no editor online e executar.

**Para executar o desafio 1:**

```
git clone https://github.com/FabricioLopees/DesafioTarget.git
cd DesafioTarget/
java src/me/fabricio/challenge1/App.java
```

**Para executar o desafio 2:**

```
git clone https://github.com/FabricioLopees/DesafioTarget.git
cd DesafioTarget/
java src/me/fabricio/challenge2/App.java
```

**3)** Resposta: 77

**4)** Respostas: <br> **a)** 9 <br> **b)** 128 <br> **c)** 49 <br> **d)** 100 <br> **e)** 13 <br> **f)** 20

**5)** Resposta: Acionaria dois interruptores, depois iria nas salas, verificar qual lâmpada não foi acesa, assim eu saberia que o interruptor que eu não acionei, corresponde a lâmpada X, voltaria para a sala de interruptores, e desligaria um dos dois que estavam ligados, então voltaria pela segunda vez nas salas e verificaria qual lâmpada foi apagada. Assim eu já conseguiria saber que o interruptor que desliguei corresponde a lâmpada Y, e o interruptor que continuou acionado, corresponde a lâmpada Z que continuou acesa.
