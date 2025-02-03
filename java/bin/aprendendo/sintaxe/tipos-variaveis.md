# Tipos e Variáveis
No java, existem palavras reservadas para representar tipos de dados que precisam ser manipulados para o desenvolvimento do software. Esses dados são conhecidos como tipos primitivos ( Primitive Type).

No total temos 8 tipos primitivos:

_int, byte, short, long, float, double, boolean e char_ - esses tipos são considerados objetos, e portando representam valores. Eles são armazenados diretamente na pilha da memória ( Memory Stack).

| Tipo | Memória | Valor Mínimo | Valor Máximo |
|----------|----------|----------|------------|
| byte    | 1 byte  | -128     |            |
| short   | 2 bytes | -32.768  |            |    
| int     | 4 bytes | -2.147.483.648| 
| long    | 8 bytes | -9.223.372.036.854.755.808| |

os tipos primitivos que podem conter partes fracionárias podems ser representados da maneira abaixo:

| Tipo | Memória | Valor Mínimo | Valor Máximo |
|----------|----------|----------|------------|
| float   | 4 byte  | -3,4028E + 38    | 3,4028E + 38|
| double   | 8 bytes | -1,7976E + 308  |    1,7976E+ 308 |

Apesar do tipo float ocupar metade da memória consumida do que um double, ele é menos utilizado. Ele sofre de uma limitação que compromete seu uso em determinadas situações: somente mantém uma precisão decimal entre 6 e 7 dígitos.
Atualmente, com os computadores modernos, os tipos **short e byte** se tornaramd desnecessários, pois não precisamos nos preocupar tanto assim com o espaço de memória reduzido.

Da mesma forma, dificilmente utilizaremos o tipo **long**, pois é incomum trabalhar com valores tão grandes.

Portanto, para representar números, na grande maioria das vezes utilizamos o tipo _int_ para números inteiros ou _double_ para números fracionários.

_ o ponto mais importante é compreender a definição dos tipos de dados no momento em que criamos uma variável._

antes de definir uma variável em java, faça as seguintes perguntas: 

**qual tipo de dado eu utilizaria para determinar** 
- a idade de uma pessoa? 
- o salário de um funcionário? 
- o CEP de uma cidade? 

## Variáveis e Constantes
uma variável é uma área de memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo, define um conjunto de valores e um conjunto de operações. Java é uma linguagem _fortemente tipada_, diferente de linguagens como python ou javascript , onde declarar o tipo de variável não é obrigatório.

No java utilizamos identificadores que representa uma referencia a um valor em memória, e esta referencia pode ser redirecionada a outra, sendo portanto esta a causa do nome "variável" , pois o valor pode variar.

Já as **constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. Em java, esses valores são representados pela palavra reservada **final**, seguida to tipo.

Por convenção, constantes são sempre escritas em CAIXA ALTA.

abaixo temos um exemplo sobre o uso de variáveis e constantes.

```
// variáveis

int numeroComum = 1;
int numeroComum = 10;
// o fenomeno acima é muito comum e esperado de uma variável

// apenas escrever o nome em caixa alta não é o suficiente para definir uma constante, é preciso usar a palavra final antes do tipo!
final double NUMERO_PI = 3.14;

```
