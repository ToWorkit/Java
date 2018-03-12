public class Shop{
	public static void main(String[] args){
		//输出表头固定的数据
		System.out.println("-------------商品库存清单------------");
		System.out.println("品牌      尺寸      价格       库存数");
		
		//定义表格当中的数据变量
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
		
		//商品信息清单进行打印
		System.out.println(macBrand + "     " + macSize + "      " + macPrice + " " + macCount);
		System.out.println(thinkBrand + "     " + thinkSize + "   " + thinkPrice + "    " + thinkCount);
		System.out.println(asuxBrand + "     " + asuxSize + "   " + asuxPrice + "      " + asuxCount);
		
		//计算库存的总数，所有商品数量的库存求和
		int totalCount = macCount + thinkCount + asuxCount;
		double totalMoney = macCount*macPrice + thinkCount*thinkSize + asuxCount*asuxPrice;
		
		//输出表格底部
		System.out.println("--------------------------");
		System.out.println("总库存数:" + totalCount );
		System.out.println("商品库存总金额:" + totalMoney );
		
		
		
	}
}