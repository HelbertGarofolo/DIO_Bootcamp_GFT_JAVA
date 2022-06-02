# Conversões (casting)

- ### O que é

  É a transformação de uma determinada variável de tipo menos específico para um tipo mais específico e vice-versa.

- ### Tipos

  - ###### Upcast (implícito)

    Promoção de um tipo de dado de menor capacidade de armazenamento e representação para um tipo maior (não precisa dizer para que tipo está indo -> implícito)

  - ###### Downcast (explícito)

    Pegar uma varável maio em sua capacidade de representação e armazenamento e rebaixar ela transformando-a em uma variável de menor capacidade representação e armazenamento (tem que dizer exatamente para qual tipo está querendo rebaixar para a linguagem entender como será feito a transformação e se for o caso até se preocupar com possíveis perdas de dados -> explícito )

  - ###### Podem ser feitos tanto em tipos primitivo quanto em tipos compostos

- ### Como e quando usar

  ![](https://github.com/HelbertGarofolo/HelbertGarofolo/blob/ce1ab3ec864a2d0e469fb20a226b6de14889f005/Java/Variaveis-Tipo_de_dados-Operadores_matematicos/Casting.png)

##### Exemplos: 

- long l; int i = 10; l = i;
- int i; long l = 100; i = (int) l; ( se o número fosse bem maior que 100 poderia haver perca de informação )
- double d; float f = 10.5f; d = f; ( se o número fosse bem maior que 100 poderia haver perca de informação )
- int i; float f = 10.5f; i = (int) f; ( Haverá perca de informação )
