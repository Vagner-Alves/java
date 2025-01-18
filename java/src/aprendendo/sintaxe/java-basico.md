# JAVA BÁSICO

**Anatomia das classes**

A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguagem com as expressões que utilizam para determinar o nome dos nossos arquivos, classes, atributos e métodos.

é muito comum mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu software seja escrita na língua inglesa.

```
public class HelloWorld {
	// código aqui ...
}
```

**Regras ao criar classes em java**

Por padrão o nome das classes começam com letra maiúscula , a maioria das classes começará com  o prefixo " public class" + NomedaClasse + corpo da classe { } ( bloco de código). 

classes executáveis: tem a capacidade de realizar a inicialização de um projeto ( ou inicializar de forma independente). 

```
public class HelloWorld {
	public static void main (String[] args){
		System.out.printl("olá, mundo");
	}
}
```
_public static void main_ indica que a classe é executável, dentro do método temos 1 parametro especiais _String [] args_ : um array do tipo String com o nome de args, abreviação de argumentos, e um corpo { }. Ao executar esse classe, o código será inicializado, compilado e vai imprimir a mensagem "olá, mundo".

## Padrão de Nomenclatura
quando se trata de escrever códigos na linguagem java, é recomendado seguir algumas **convenções** de escrita. 
vejamos os itens abaixo:

- **Arquivo.java**: Todo arquivo .java deve começar com letra maiúscula. Se a palavra for composta, a segunda palavra deve também ser maiúscula, exemplo: Calculadora.java , CalculadoraCientifica.java 

- **Nome da Classe no Arquivo**: A classe deve possuir o mesmo nome do arquivo .java, exemplo
```
// arquivo CalculadoraCientifica.java

public class CalculadoraCientifica {}
```

- **Nome de Variável**: toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser maiúscula, exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis se chama " camelCase".  

existe uma regra adicional para variáveis quando na mesma queremos identificar que ela não sofrerá alteração de valor, exemplo: queremos determinar que a variável de nome **br** sempre terá " Brasil" como valor, logo, temos a convenção de escrita abaixo.

```
String BR = "Brasil";
double PI = 3.14;
int ESTADOS_BRASILEIROS = 27;
int ANO_2018 = 2018;

escrevemos o nome da variável com letras maiúsculas e separando palavras por underline.
 ```


## Declarando Variáveis

Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém devemos seguir algumas regras da linguagem. 

- Deve conter apenas letras, _ (underline), $ ou os números de 0 a 9

- Deve obrigatoriamente se iniciar por uma letra minúscula ( boa prática ).

- não pode conter espaços

- não podemos usar palavras-chaves da linguagem java

- o nome deve ser único dentro de um escopo


```
// Declaração inválida de variáveis

int numero&um = 1; // os únicos símbolos permitidos são _ e $

int 1numero = 1; // uma variável não pode começar com número
int numero um = 1; // não pode ter espaço 

int long = 1; // long é uma palavra reservada do java.

// Corrigindo o nome das variáveis

int numero$um = 1;
int numero1 = 1;
int numeroUm = 1;
int longo = 1;

 ```

## Declarando Métodos
declarar métodos em java segue uma estrutura simples:

```
// Estrutura

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

// exemplo

int somar (int numeroUm , int numeroDois){}

String formatarCep (long cep) {}

````

## Identação
Basicamente identar é um termo utilizado para escrever o código do software de forma hierárquica,facilitando a visualização e o entendimento dele.

utilizando a IDE Eclipse, podemos identar o código utilizando as teclas **ctrl + a + ctrl + i**

## Pacotes

A medida que o sistema evolui, novos arquivos ( código fonte) surgem na estrutura do projeto. Isso exige que seja realizada uma organização desses arquivos através de pacotes ( packages ).

## Java Beans
Uma das maiores dificuldades no desenvolvimento de software é escrever código legíveis a níveis que sejam compreendidos por todo seu time ou por voce mesmo no futuro. Para isso a linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos , métodos e pacotes. 

mais cedo aprendemos algumas _regras_ de declaração de variáveis, mas agora iremos conhecer algumas _sugestões_ de nomenclatura:

- Uma variável deve ser clara, sem abreviações ou definições.



