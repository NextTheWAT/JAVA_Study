package coffe;

public class Starcoffee 
{
    int money;
    public String buying(int money)
    {
        this.money += money;
        if(money == 4500)
        {
            return "���ٹ濡�� �Ƹ޸�ī�� ������ �����ϼ̽��ϴ�! ������: 4500���Դϴ�.";
        }

        else if(money==4000)
        {
            return "���ٹ濡�� �� ������ �����ϼ̽��ϴ�! ������ 4000���Դϴ�.";
        }

        else 
        {
            return null;
        }
    }
}