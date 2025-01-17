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


