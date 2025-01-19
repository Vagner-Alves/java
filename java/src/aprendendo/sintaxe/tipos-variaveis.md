# Tipos e Variáveis
No java, existem palavras reservadas para representar tipos de dados que precisam ser manipulados para o desenvolvimento do software. Esses dados são conhecidos como tipos primitivos ( Primitive Type).

No total temos 8 tipos primitivos:

_int, byte, short, long, float, double, boolean e char_ - esses tipos são considerados objetos, e portando representam valores. Eles são armazenados diretamente na pilha da memória ( Memory Stack).

| Tipo | Memória | Valor Mínimo | Valor Máximo |
|----------|----------|----------|------------|
| byte,    | 1 byte,  | -128     |            |
| short,   | 2 bytes, | -32.768  |            |    
| int,     | 4 bytes, | -2.147.483.648| 
| long,    | 8 bytes, | -9.223.372.036.854.755.808| |

os tipos primitivos que podem conter partes fracionárias podems ser representados da maneira abaixo:

| Tipo | Memória | Valor Mínimo | Valor Máximo |
|----------|----------|----------|------------|
| float,   | 4 byte,  | -3,4028E + 38    | 3,4028E + 38|
| double,   | 8 bytes, | -1,7976E + 308  |    1,7976E+ 308 |

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
