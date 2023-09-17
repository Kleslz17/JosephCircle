/**
 * @author Nov17_
 * 环形链表类-创建环形链表后用于测试
 */
public class CircleLinkedList {

    private Node first = null;//创建环形链表的表头

    /**
     * @param value - 创建环形链表的节点个数
     */
    public void create(int value){
        //在创建方法前先检验输入值是否合法
        if (value < 1){
            System.out.println("Illegal input");
            return;
        }

        //输入值合法的情况下，建立辅助指针
        Node temp = null;

        //在辅助指针的帮助下，循环建立环形链表
        for(int i = 1; i <= value; i++){//最大值为value的环形链表，循环次数为value
            Node node = new Node(i);//新建一个节点
            if(i == 1) {
                first = node;//如果是第一个节点，那么直接将first赋值为新节点node，并让这个节点指向first
                first.setNext(first);//所有节点创建之后都要指向first，直到下一个节点出现
                temp = first;//所有节点创建之后都要令辅助指针指向这个刚刚创建完的节点，以便后续修改他的next指向
            }else{
                temp.setNext(node);//不是第一个节点，使用temp指针来编辑上一个节点的next指向新的节点
                node.setNext(first);//指向设置成功后，令新节点的指针域指向first（亘古不变的规矩）
                temp = node;//让辅助指针停留在刚刚创建完的节点上方便编辑。
            }
            /**
             * 无论是首次创建节点还是向后延伸节点，他们的共同点就是分三步：
             * 1.设置当前节点的next为新的节点node（没有当前的话就直接设置为当前）
             * 2.设置新节点的next为表头first
             * 3.让temp停留在新节点上
             *
             * 这就是目前create方法中使用的循环建立链表，可以保证最后一个节点的指针域一定指向first
             */
        }
    }



    /**
     * showBoy方法是遍历列表的方法，循环输出链表的所有值
     */
    public void showBoy() {
        //经典检验输入值（里面脏话记得删了）
        if (first == null) {
            System.out.println("链表是空的草拟吗");
            return;
        }

        Node temp = first;//创建用于遍历链表的指针

        while (true) {
            System.out.println("DataNumber is " + temp.getNo());
            if (temp.getNext() == first) {
                break;//只要指针没有到达最后，就会循环输出链表的值，直到最后跳出。
            }
            temp = temp.getNext();
        }
    }

    /**
     *
     * @param startNo 开始的数据编号
     * @param countNum 数几下出圈（k）
     * @param nums 数据的数量
     */
    public void countNode(int startNo,int countNum,int nums){

        //老生常谈的话题（脏话删了）
        if(first == null || startNo < 1 || startNo > nums){
            System.out.println("你看你输的是啥几把玩意");
            return;
        }

        Node helper = first;//设置一个辅助指针，他会紧跟在first后面进行遍历

        while(true){
            if(helper.getNext() == first) break;
            helper = helper.getNext();//把辅助指针推到环形链表的最后（也就是first的前面一位）
        }

        for(int j = 0;j < startNo -1; j++){
            first = first.getNext();
            helper = helper.getNext();//根据输入的startNo，把first和helper推到startNo处准备开始遍历。
        }

        while(true){//开始遍历，循环断点会在程序中设置。
            if(helper == first) break;//当两个指针相遇时说明只剩下一个节点，切断循环
            for(int j = 0; j < countNum - 1; j++){
                first = first.getNext();
                helper = helper.getNext();//推进指针到需要删除的位置
            }
            System.out.println("The Value "+first.getNo()+" was out");

            first = first.getNext();//将first跳到下一个节点
            helper.setNext(first);//设置helper的下一个指针为first
            //当只剩两个节点的时候，first跳到下一个节点会直接把自己设置为helper的值，helper会把自己的下一跳设置为first（他本身）
            //这时候，helper本身的值就等于first，也可以写作 helper.getNext() == helper这个布尔表达式来进行判断。
        }

        //TODO 输出学号姓名，添加学生类并在这里进行映射转换。
        Student[] dashuju1 = {new Student("220407030101","艾达娜·叶尔兰别克"),new Student("220407030103","戴璐蔓"),new Student("220407030105","董思圻"),new Student("220407030107","房思彤"),new Student("220407030109","高畅"),new Student("220407030110","高明爽"),new Student("220407030111","哈丽玛·努尔兰"),new Student("220407030112","贺岩"),new Student("220407030114","李绍闻"),new Student("220407030115","李欣潼"),new Student("220407030116","刘闻达"),new Student("220407030117","刘子嘉"),new Student("220407030121","孟祥瑞"),new Student("220407030122","茹扎·加那尔"),new Student("220407030123","斯木巴提·努尔兰"),new Student("220407030124","唐金玉"),new Student("220407030125","田芮名"),new Student("220407030126","王涵北"),new Student("220407030127","王艺潼"),new Student("220407030128","魏麒"),new Student("220407030129","许小雷"),new Student("220407030130","闫世琪"),new Student("220407030131","杨煜坤"),new Student("220407030132","张津赫"),new Student("220407030133","张凯旗"),new Student("220407030134","张书静"),new Student("220407030135","张子薇"),new Student("220407030136","赵思雨"),new Student("220407030137","周天佐"),new Student("220407030138","邹天娇")};

        System.out.println(first.getNo());
        System.out.println("The Last Person is "+dashuju1[first.getNo() - 1].getNo()+" "+dashuju1[first.getNo() - 1].getName());//输出最后的值
    }
}
