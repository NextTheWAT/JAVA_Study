package coffe;

public class CoffeTest
{
    public static void main(String[] args)
    {
        People kim = new People("�����",10000);
        Starcoffee scoffee = new Starcoffee(); //��Ÿī���� ���ο� �ν��Ͻ�
        BeanCoffee bcoffee = new BeanCoffee(); //��ī�� Ŭ������ �� �� �ִ� �ν��Ͻ�

        kim.VisitStarCoffee(scoffee,4000);
        kim.VisitBeanCoffee(bcoffee,4500);
    }

}