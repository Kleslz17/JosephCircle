/**
 * @author Nov17_
 * ����������-����������������ڲ���
 */
public class CircleLinkedList {

    private Node first = null;//������������ı�ͷ

    /**
     * @param value - ������������Ľڵ����
     */
    public void create(int value){
        //�ڴ�������ǰ�ȼ�������ֵ�Ƿ�Ϸ�
        if (value < 1){
            System.out.println("Illegal input");
            return;
        }

        //����ֵ�Ϸ�������£���������ָ��
        Node temp = null;

        //�ڸ���ָ��İ����£�ѭ��������������
        for(int i = 1; i <= value; i++){//���ֵΪvalue�Ļ�������ѭ������Ϊvalue
            Node node = new Node(i);//�½�һ���ڵ�
            if(i == 1) {
                first = node;//����ǵ�һ���ڵ㣬��ôֱ�ӽ�first��ֵΪ�½ڵ�node����������ڵ�ָ��first
                first.setNext(first);//���нڵ㴴��֮��Ҫָ��first��ֱ����һ���ڵ����
                temp = first;//���нڵ㴴��֮��Ҫ���ָ��ָ������ոմ�����Ľڵ㣬�Ա�����޸�����nextָ��
            }else{
                temp.setNext(node);//���ǵ�һ���ڵ㣬ʹ��tempָ�����༭��һ���ڵ��nextָ���µĽڵ�
                node.setNext(first);//ָ�����óɹ������½ڵ��ָ����ָ��first��ب�Ų���Ĺ�أ�
                temp = node;//�ø���ָ��ͣ���ڸոմ�����Ľڵ��Ϸ���༭��
            }
            /**
             * �������״δ����ڵ㻹���������ڵ㣬���ǵĹ�ͬ����Ƿ�������
             * 1.���õ�ǰ�ڵ��nextΪ�µĽڵ�node��û�е�ǰ�Ļ���ֱ������Ϊ��ǰ��
             * 2.�����½ڵ��nextΪ��ͷfirst
             * 3.��tempͣ�����½ڵ���
             *
             * �����Ŀǰcreate������ʹ�õ�ѭ�������������Ա�֤���һ���ڵ��ָ����һ��ָ��first
             */
        }
    }



    /**
     * showBoy�����Ǳ����б�ķ�����ѭ��������������ֵ
     */
    public void showBoy() {
        //�����������ֵ�������໰�ǵ�ɾ�ˣ�
        if (first == null) {
            System.out.println("�����ǿյĲ�����");
            return;
        }

        Node temp = first;//�������ڱ��������ָ��

        while (true) {
            System.out.println("DataNumber is " + temp.getNo());
            if (temp.getNext() == first) {
                break;//ֻҪָ��û�е�����󣬾ͻ�ѭ����������ֵ��ֱ�����������
            }
            temp = temp.getNext();
        }
    }

    /**
     *
     * @param startNo ��ʼ�����ݱ��
     * @param countNum �����³�Ȧ��k��
     * @param nums ���ݵ�����
     */
    public void countNode(int startNo,int countNum,int nums){

        //������̸�Ļ��⣨�໰ɾ�ˣ�
        if(first == null || startNo < 1 || startNo > nums){
            System.out.println("�㿴�������ɶ��������");
            return;
        }

        Node helper = first;//����һ������ָ�룬���������first������б���

        while(true){
            if(helper.getNext() == first) break;
            helper = helper.getNext();//�Ѹ���ָ���Ƶ�������������Ҳ����first��ǰ��һλ��
        }

        for(int j = 0;j < startNo -1; j++){
            first = first.getNext();
            helper = helper.getNext();//���������startNo����first��helper�Ƶ�startNo��׼����ʼ������
        }

        while(true){//��ʼ������ѭ���ϵ���ڳ��������á�
            if(helper == first) break;//������ָ������ʱ˵��ֻʣ��һ���ڵ㣬�ж�ѭ��
            for(int j = 0; j < countNum - 1; j++){
                first = first.getNext();
                helper = helper.getNext();//�ƽ�ָ�뵽��Ҫɾ����λ��
            }
            System.out.println("The Value "+first.getNo()+" was out");

            first = first.getNext();//��first������һ���ڵ�
            helper.setNext(first);//����helper����һ��ָ��Ϊfirst
            //��ֻʣ�����ڵ��ʱ��first������һ���ڵ��ֱ�Ӱ��Լ�����Ϊhelper��ֵ��helper����Լ�����һ������Ϊfirst��������
            //��ʱ��helper�����ֵ�͵���first��Ҳ����д�� helper.getNext() == helper����������ʽ�������жϡ�
        }

        //TODO ���ѧ�����������ѧ���ಢ���������ӳ��ת����
        Student[] dashuju1 = {new Student("220407030101","�����ȡ�Ҷ�������"),new Student("220407030103","�����"),new Student("220407030105","��˼��"),new Student("220407030107","��˼ͮ"),new Student("220407030109","�߳�"),new Student("220407030110","����ˬ"),new Student("220407030111","�����ꡤŬ����"),new Student("220407030112","����"),new Student("220407030114","������"),new Student("220407030115","������"),new Student("220407030116","���Ŵ�"),new Student("220407030117","���Ӽ�"),new Student("220407030121","������"),new Student("220407030122","���������Ƕ�"),new Student("220407030123","˹ľ���ᡤŬ����"),new Student("220407030124","�ƽ���"),new Student("220407030125","������"),new Student("220407030126","������"),new Student("220407030127","������"),new Student("220407030128","κ��"),new Student("220407030129","��С��"),new Student("220407030130","������"),new Student("220407030131","������"),new Student("220407030132","�Ž��"),new Student("220407030133","�ſ���"),new Student("220407030134","���龲"),new Student("220407030135","����ޱ"),new Student("220407030136","��˼��"),new Student("220407030137","������"),new Student("220407030138","���콿")};

        System.out.println(first.getNo());
        System.out.println("The Last Person is "+dashuju1[first.getNo() - 1].getNo()+" "+dashuju1[first.getNo() - 1].getName());//�������ֵ
    }
}
