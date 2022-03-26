package coffe;

public class People 
{
    String name;
    int money;

    public People(String name,int money)
    {
        this.name = name;
        this.money = money;
    }

    public void VisitStarCoffee(Starcoffee scoffee , int money) //��ī��
    {
       String message = scoffee.buying(4000);
       if(message!=null)
       {
           this.money-=money;
           System.out.println(name+"�� ���� ���� ����"+ money + "�Դϴ�.   " + message);
       }
    }

    public void VisitBeanCoffee(BeanCoffee beanCoffee, int money)
    {
        String message = beanCoffee.buying(4500);
        if(message!=null)
        {
            this.money-=money;
            System.out.println(name+"�� ���� ���� ����"+ money + "�Դϴ�.   "+ message);
        }
    }
}