# JosephCircle
约瑟夫环是一个非常经典的算法问题：若干人围成一圈，然后从某一个人开始报数，若报出了value*这个数，那么这个人将会被清除出这个圈。持续下去，一定会剩下最后一个人，这就是约瑟夫环问题。
这个项目中使用的是环形链表来模拟约瑟夫环，注释在代码中，下面是一些构建循环链表中比较关键的点。
1.先构建链表的节点，节点中包括数据域和指针域，以及他们的getters和setters，构造函数等。
2.构建环形链表类。环形链表首先有头结点first，然后是环形链表中的4个public方法:构造函数CircleLinkedList(),遍历所有节点void showNode(),创建环形链表方法void create(int value)，以及约瑟夫算法的实现void countNode(int startNo, int countNum, int nums)。
先说比较重要的一点，构建方法create(int value)。首先检验输入，如果输入不合法则直接返回，然后开始构建过程：
