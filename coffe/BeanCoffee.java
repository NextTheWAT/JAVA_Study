package coffe;

public class BeanCoffee
{
    int money;
    public String buying(int money)
    {
        this.money += money;
        if(money == 4500) //Ŀ���ϳ� ����!
        {
            return "��ٹ濡�� �Ƹ޸�ī�� ������ �����ϼ̽��ϴ�! ������: 4500���Դϴ�.";
        }

        else if(money==4000) //�� �ϳ�����
        {
            return "��ٹ濡�� �� ������ �����ϼ̽��ϴ�! ������ 4000���Դϴ�.";
        }

        else 
        {
            return null;
        }
    } 
}