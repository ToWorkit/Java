public class Shop{
	public static void main(String[] args){
		//�����ͷ�̶�������
		System.out.println("-------------��Ʒ����嵥------------");
		System.out.println("Ʒ��      �ߴ�      �۸�       �����");
		
		//�������е����ݱ���
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 10800.88;
		int macCount = 10;
		
		String thinkBrand = "ThinkPadT430";
		double thinkSize = 14;
		double thinkPrice = 3888.88;
		int thinkCount = 5;
		
		String asuxBrand = "asux-F5800";
		double asuxSize = 15.6;
		double asuxPrice = 4999;
		int asuxCount = 18;
		
		//��Ʒ��Ϣ�嵥���д�ӡ
		System.out.println(macBrand + "     " + macSize + "      " + macPrice + " " + macCount);
		System.out.println(thinkBrand + "     " + thinkSize + "   " + thinkPrice + "    " + thinkCount);
		System.out.println(asuxBrand + "     " + asuxSize + "   " + asuxPrice + "      " + asuxCount);
		
		//�������������������Ʒ�����Ŀ�����
		int totalCount = macCount + thinkCount + asuxCount;
		double totalMoney = macCount*macPrice + thinkCount*thinkSize + asuxCount*asuxPrice;
		
		//������ײ�
		System.out.println("--------------------------");
		System.out.println("�ܿ����:" + totalCount );
		System.out.println("��Ʒ����ܽ��:" + totalMoney );
		
		
		
	}
}