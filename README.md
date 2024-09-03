# DesafioTarget
Desafio Target - Técnico

## Desafio 1
Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

## Desafio 2
Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

## Desafio 3
Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

Ao final do processamento, qual será o valor da variável SOMA?

## Desafio 4
Descubra a lógica e complete o próximo elemento: <br>
a) 1, 3, 5, 7, ___ <br>
b) 2, 4, 8, 16, 32, 64, ____ <br>
c) 0, 1, 4, 9, 16, 25, 36, ____ <br>
d) 4, 16, 36, 64, ____ <br>
e) 1, 1, 2, 3, 5, 8, ____ <br>
f) 2,10, 12, 16, 17, 18, 19, ____


## Desafio 5
Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?  

---
---

## Respostas

1. me.fabricio.desafio1.App
```
// Para executar desafio 1:
git clone https://github.com/FabricioLopees/DesafioTarget.git
java src/me/fabricio/challenge1/App.java
```

2. me.fabricio.desafio2.App
```
// Para executar desafio 2:
git clone https://github.com/FabricioLopees/DesafioTarget.git
java ...

```

3. Resposta: 77

4. a) 9 b) 128 c) 49 d) 100 e) 13 f) 20

5. Acionaria dois interruptores, depois iria nas salas, verificar qual lâmpada não foi acesa, assim eu saberia que o interruptor que eu não acionei, corresponde a lâmpada X, voltaria para a sala de interruptores, e desligaria um dos dois que estavam ligados, então voltaria pela segunda vez nas salas e verificaria qual lâmpada foi apagada. Assim eu já conseguiria saber que o interruptor que desliguei corresponde a lâmpada Y, e o interruptor que continuou acionado, corresponde a lâmpada Z que continuou acesa.
